import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;


/**
  Definition for a binary tree node.
**/
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 

public class binaryTreeVerticalOrderTraversalBFS {
    // BFS Approach

    public List<List<Integer>> verticalOrder(TreeNode root){

        List<List<Integer>> output = new ArrayList<>();
        if(root == null) return output;
        
        Map<Integer, ArrayList> columnTable = new HashMap();
        Queue<Pair<TreeNode, Integer>> queue = new ArrayDeque();
        int column = 0;
        queue.offer(new Pair(root, column));

        while(!queue.isempty()){
            Pair<TreeNode, Integer> p = queue.poll();
            root = p.getKey();
            column = p.getValue();
            
            if(root != null){
                if(!columnTable.containsKey(column)){
                    columnTable.put(column, new ArrayList<Integer>());
                }
                columnTable.get(column).add(root.val);

                queue.offer(new Pair(root.left, column -1));
                queue.offer(new Pair(root.right, column + 1));
            }
        }

         List<Integer> sortedKeys = new ArrayList<Integer>(columnTable.keySet());
        Collections.sort(sortedKeys);
        for(int k : sortedKeys){
            output.add(columnTable.get(k));
        }

        return output;
    }

}
