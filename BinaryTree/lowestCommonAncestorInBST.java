class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        // Recursion Approach

        // if(p.val > root.val && q.val > root.val){
        //     return lowestCommonAncestor(root.right, p, q);
        // }else if(p.val < root.val && q.val < root.val){
        //     return lowestCommonAncestor(root.left, p, q);
        // }else {
        //     return root;
        // }
        
        // Iteration Approach

        while(root != null){
            if(p.val < root.val && q.val < root.val){
                root = root.left;
            }else if(p.val > root.val && q.val > root.val){
                root = root.right;
            }else return root;
        }
        return null;
    }
}
