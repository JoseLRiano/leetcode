import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution{
    public boolean closeString(String word1, String word2){
        if(word1.length() != word2.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(char c : word1.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for(char c : word2.toCharArray()){
            map2.put(c, map2.getOrDefault(c, 0) +1);
        }

        if(!map1.keySet().equals(map1.keySet())) return false;

        List<Integer> arr1 = new ArrayList<>(map1.values());
        List<Integer> arr2 = new ArrayList<>(map2.values());

        Collections.sort(arr1);
        Collections.sort(arr2);

        return arr1.equals(arr2);
    }
}