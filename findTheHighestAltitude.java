class Solution{
    public int largestAltitude(int[] gain){
        int sum = 0;
        int maxAltitude = 0;
        for(int item : gain){
            sum += item;
            maxAltitude = Math.max(sum, maxAltitude);
        }
        return maxAltitude;
    }
}