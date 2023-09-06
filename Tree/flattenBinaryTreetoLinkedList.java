class Solution{
    public TreeNode helper(TreeNode node){
        if(node == null) return null;
        if(node.left == null && node.right == null) return node;
        TreeNode leftSide = helper(node.left);
        TreeNode rightSide = helper(node.right);

        if(leftSide != null){
            leftSide.right = node.right;
            node.right = node.left;
            node.left = null;
        }

        return rightSide == null ? leftSide : rightSide;
    }
    public void flatten(TreeNode root){
        helper(root);
    }
}