import java.util.HashMap;

public class buildTree {
    private int post_idx;
    private int[] postorder;
    private int[] inorder;
    private HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode helper(int left, int right){
        if(left > right){
            return null;
        }

        int rootVal = postorder[post_idx];
        TreeNode root = new TreeNode(rootVal);

        int index = map.get(rootVal);

        // Recursion 
        post_idx--;

        root.right = helper(index + 1, right);

        root.left = helper(left, index -1);
        return root;
    }


    public TreeNode buildTree(int[] inorder, int[] postorder){
        this.postorder = postorder;
        this.inorder = inorder;

        post_idx = postorder.length - 1;

        int idx = 0;
        for(int val : inorder){
            map.put(val, idx++);
        }

        return helper(0, inorder.length -1);
    }

}
