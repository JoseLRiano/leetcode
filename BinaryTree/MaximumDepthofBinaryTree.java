/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root){
        //  Recursion Approach postorder
        
        // if(root == null) return 0;
        // int left = maxDepth(root.left);
        // int right = maxDepth(root.right);
        // return Math.max(left, right) + 1;
        // 

        // BFS 

        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        int level =0;

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            while(size > 0){   
                TreeNode temp = q.poll();
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                size--;
            }
            level++;
        }
        return level;
    }
}
