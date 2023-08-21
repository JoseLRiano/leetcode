class Solution{
    public int majorityElement(int[] nums){
        int element = 0;
        int count = 0;
        for(int n : nums){
            if(count == 0){
                element = n;
                count = 1;
            }else if(element == n){
                count = count + 1;
            }else{
                count = count - 1;
            }
        }
        return element;
    }
}