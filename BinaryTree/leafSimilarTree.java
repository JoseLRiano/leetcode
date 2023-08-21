
public class leafSimilarTree {

    public void dfs(TreeNode node, List<Integer> arr){
        if(node != null){
            if(node.left == null & node.right == null){
                arr.add(node.val);
            }
            dfs(node.left);
            dsf(node.right);

        }
    }
    
    public boolean leafSimilar(TreeNode root1, root2){
        //  DFS postorder traverse

        List<Integer> arr1 = new Arraylist<>();
        List<Integer> arr2 = new ArrayList<>(); 

        dfs(root1, arr1);
        dfs(root2, arr2);

        return arr1.equals(r2);
    }    
}
