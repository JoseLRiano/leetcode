class Solution{
    public int numOfSubarrays(int[] nums, int k, int t){
        int res = 0;
        int sum = 0;
        int r = 0;
        while(r < nums.length){
            if(r <= k - 1){
                sum += nums[r];
                if(r == k -1 && sum/k == t){
                    res++;
                }
                r++;
            }else{
                sum += nums[r] - nums[r - k];
                if(sum / k == t) res++;
                r++;
            }
        }
        return res;
    }
}