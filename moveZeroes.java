class Solution {
    public void moveZeroes(int[] nums) {
        int countZeroes = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                countZeroes++;
            }else if(countZeroes > 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i - countZeroes] = temp;
            }
        }
    }
}