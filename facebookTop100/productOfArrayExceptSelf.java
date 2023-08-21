package facebookTop100;
class Solution{
    public int[] productExceptSelf(int[] nums){
        int right = 1;
        int[] solution= new int[nums.length];
        solution[0] = 1;
        for(int i = 1; i < nums.length; i++){
            solution[i] = nums[i - 1] * solution[i - 1];
        }
        for(int j = nums.length - 1; j >= 0; j--){
            solution[j] = solution[j] * right;
            right = right * nums[j];
        }
        return solution;
    }
}