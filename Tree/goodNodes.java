class Solution{
    private int count;
    public int goodNodes(TreeNode root){
        count = 0;
        dfs(root, Integer.MIN_VALUE);
        return count;
    }
    public void dfs(TreeNode node, int max){
        if(max <= node.val) count++;
        if(node.left != null){
            dfs(node.left, Math.max(max, node.val));
        }
        if(node.right != null){
            dfs(node.right, Math.max(max, node.val));
        }
    }
}