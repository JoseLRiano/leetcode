class Soltuon{
    public boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }else if(nums[i] < middle && nums[i] > min){
                middle = nums[i];
            }else if(nums[i] > min && nums[i] > middle){
                return true;
            }
        }
        return false;
    }
}