class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftSum = 0;
        for(int n : nums) sum += n;
        for(int i = 0; i < nums.length; i++){
            if(leftSum == sum - leftSum - nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }    
    public static void main(String[] args){
        FindPivotIndex pivot = new FindPivotIndex();
        int[] arr = {1,7,3,6,5,6};
        System.out.print("Solution index: " + pivot.pivotIndex(arr) + " ");
    }
}
