class Solution{
    public int longestSubarrys(int[] nums){
        int i = 0;
        int j = 0;
        int k = 1;
        while( i < nums.length){
            if(nums[i] == 0) k--;
            if(k < 0){
                if(nums[j] == 0) k++;
                j++;
            }

            i++;
        }
        return i - j -1;   
    }
}