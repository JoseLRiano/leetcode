
public class countUnivalSubtrees {

    //      Using a global variable

    // private int count;
    // public boolean dfs(TreeNode node){
    //     if(node == null) return true;

    //     boolean left = dfs(node.left);
    //     boolean right = dfs(node.right);

    //     if(left && right){
    //         if(node.left != null && node.left.val != node.val){
    //             return false;
    //         }
    //         if(node.right != null && node.right.val != node.val){
    //             return true;
    //         }
    //         count++;
    //         return true;
    //     }

    //     return false;

    // }

    // private int countUnivalSub(TreeNode root){
    //     dfs(root);
    //     return count;
    // }


    //      Not using a global variable 

    private Boolean dfs(TreeNode node, int[] count){
        if(node == null) return true;

        boolean isLeftUni = dfs(node.left, count);
        boolean isRightUni = dfs(node.right, count);

        if(isLeftUni && isRightUni && (node.left == null || node.left.cal == node.val) && (node.righ == null || node.right.val == node.val)){
            count[0]++;
            return true;
        }
        return false;

    }

    public int countUnivalSubtrees(TreeNode root){
        int[] count = new int[1];
        dfs(root, count);
        return count[0];
    }
}
