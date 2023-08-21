// Definition for a binary tree Node

public class TreeNode{
    int val;
    TreeNode left;
    TreeNode rigth;
    TreeNode(int x) { val = x; }

}
public abstract class LowestCommonAncestorBT {
    TreeNode ans;

    public boolean dfs(TreeNode node, TreeNode p, TreeNode q){
        if(node == null) return false;

        int left = dfs(node.left, p, q) ? 1 : 0;
        int right = dfs(node.right, p, q) ? 1 : 0;
        
        int mid = (node == p || node == q) ? 1 : 0;
        
        if(mid + left + right >= 2){
            ans = node;
        }
        return (mid + left + right > 0);

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        dfs(root, p, q);
        return ans;
    }    
}
