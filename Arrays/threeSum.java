import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution{
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            // skip duplicates after index 0
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            //  Set two pointer to run at the beggining (i + 1) and end of the array nums
            int l = i + 1;
            int r = nums.length - 1;

            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[l],nums[r]));

                    while(l < r && nums[l] == nums[l + 1] ){
                        l++;
                    }
                    while(l < r && nums[r] == nums[r -1]){
                        r--;
                    }
                    l++;
                    r--;
                }else if(sum < 0){
                    l++;
                }else {
                    l++;
                }
            }

        }
        return ans;
    }
}