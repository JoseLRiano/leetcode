
public class preInPostOrderDFS {
    //  POSTORDER
    public void preorder(TreeNode root){
        if(root == null) return;
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    // INORDER
    
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }

    // POSTORDER
    public void postorder(TreeNode root){
        if(root == null) return;
        postorder(root.right);
        postorder(root.left);
        System.out.println(root.val);
    }
}
