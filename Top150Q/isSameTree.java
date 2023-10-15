package Top150Q;

import java.util.Deque;
import java.util.LinkedList;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){ this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q){
        Deque<TreeNode> q1 = new LinkedList<>();

        q1.add(p);
        q1.add(q);
        while(!q1.isEmpty()){
                TreeNode node1 = q1.poll();
                TreeNode node2 = q1.poll();
                if(node1 == null && node2 == null) continue;
                if(node1 == null || node2 == null) return false;
                if(node1.val != node2.val){
                    return false;
                }
               
                    q1.add(node1.left);
                    q1.add(node2.left);
              
                    q1.add(node1.right);
                    q1.add(node2.right);
                
        }
        return true;

        // // Recursion 

        // // Base Case
        // if(p == null && q == null) return true;
        // // Check if one of the nodes is null
        // if(p == null || q == null) return false;
        // // Check values of nodes
        // if(p.val != q.val) return false;
        // // recuresion call
        // return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
