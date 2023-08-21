import java.util.HashMap;
import java.util.Map;

class Solution {
    int target;
    int count = 0;
    Map<Long, Integer> map = new HashMap<>();

    public void preorder(TreeNode node, Long currSum){
        if(node == null){
            return;
        }

        //add value of the node to currSum
        currSum += node.val;

        // check is the currSum is equals to the target
        if(currSum == target){
            count++;
        }

        count += map.getOrDefault(currSum - target, 0);

        map.put(currSum, map.getOrDefault(currSum, 0) + 1);

        preorder(node.left, currSum);

        preorder(node.right, currSum);

        // remove the current su from the hashmap in order to not use it on the parallel subtree

        map.put(currSum, map.get(currSum) -1);

    }

    public int pathSum(TreeNode root, int targetSum){
        target = targetSum;
        preorder(root, 0L); // 0L = zero type long 
        return count;
    }
}