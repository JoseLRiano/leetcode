import java.util.Arrays;
import java.util.HashMap;

class maxNumbersOfKSumParis {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count= 0;
        for(int item : nums){
            if(map.getOrDefault(k - item, 0) > 0){
                count++;
                map.put(k - item, map.get(k - item)-1);
            }else{
                map.put(item, map.getOrDefault(item, 0) +1);
            }
        }
        return count;

        // Two Pointer Approach 
        // Arrays.sort(nums);
        // int left = 0;
        // int right = nums.length -1;
        // int count = 0;
        // while(left < right){
        //     if(nums[left] + nums[right] == k){ count++; left++; right--;}
        //     else if(nums[left] + nums[right] < k) left++;
        //     else right--;
        // }
        // return count;


    }
}
