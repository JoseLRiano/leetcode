import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution{
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> ans2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int n : nums1){
            set1.add(n);
        }
        for(int n : nums2){
            set2.add(n);
        }
        for(int i : set1){
            if(!set2.contains(i)) ans1.add(i);
        }
        for(int i : set2){
            if(!set1.contains(i)) ans2.add(i);
        }
        answer.add(ans1);
        answer.add(ans2);
        return answer;
    }
}