import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr){
        //Create a hashmap and set
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        // Add all the values as a key and count the Occurrences in the value 
        for(int n : arr){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        // loop through the map key get the values and add them to the set
        // Set will only add unique values 
        for(Integer key : map.keySet()){
            set.add(map.get(key));
        }
        // if occurrences of values are unique the map and set sizes will be equal to return true else return false
        return map.size() == set.size();
    }
}