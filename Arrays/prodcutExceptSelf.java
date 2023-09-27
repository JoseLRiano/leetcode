class Solution {
    public int[] productExceptSelf(int[] nums) {
        int right = 1;
        int[] solution = new int[nums.length];
        solution[0] = 1;

        for(int i = 1 ; i < nums.length; i++){
            solution[i] = nums[i - 1] * solution[i - 1];
        }
        for(int j = nums.length - 1; j >= 0; j--){
            solution[j] = solution[j] * right;
            right = right * nums[j];
        }
        return solution;       
        
        // int n = nums.length;
        // int[] ans = new int[n];

        // int[] left = new int[n];
        // int[] right = new int[n];

        // left[0] = 1;

        // for(int i = 1; i < n; i++){
        //     left[i] = left[i -1] * nums[i -1];
        // }
        // right[n -1] = 1;
        // for(int i = n - 2; i >= 0; i--){
        //     right[i] = right[i+1] * nums[i+1]; 
        // }
        // for(int i = 0; i < n; i++){
        //     ans[i] = left[i] * right[i];
        // }
        // return ans;
    }
}