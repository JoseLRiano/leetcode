import java.util.HashMap;

class maxNumbersOfKSumParis {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count= 0;
        for(int item : nums){
            if(map.containsKey(k - item) && map.get(k - item) > 0){
                count++;
                map.put(k - item, map.get(k - item)-1);
            }else{
                map.put(item, map.getOrDefault(item, 0) +1);
            }
        }
        return count++;
    }
}
