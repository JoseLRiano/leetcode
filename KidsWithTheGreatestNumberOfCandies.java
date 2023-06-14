import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args){
        Solution test = new Solution();
        int[] arrTest = {4,2,1,1,2};
        int extraCand = 2;
        System.out.println(test.kidsWithCandies(arrTest, extraCand));
    }
}
