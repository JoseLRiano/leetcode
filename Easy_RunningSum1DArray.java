class RunningSum1dArray {
    public int[] runningSum(int[] nums) {
        for(int n = 1; n < nums.length; n++)
            nums[n] += nums[n - 1];
        return nums;
    }
    public static void main(String[] args){
        RunningSum1dArray sum = new RunningSum1dArray();
        int[] arr = {1,2,3,4,5};
        int[] numsSol = sum.runningSum(arr);
        for (int i : numsSol) {
            System.out.print(i + " ");   
        }
    }
}

