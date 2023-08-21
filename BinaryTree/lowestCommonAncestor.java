
class Solution {

    // Recursion

    // private TreeNode ans;

    // public boolean recurseTree(TreeNode cur, TreeNode p, TreeNode q){
    //     if(cur == null) return false;

    //     int left = recurseTree(cur.left, p, q) ? 1 : 0;
    //     int right = recurseTree(cur.right, p, q) ? 1 : 0;

    //     int mid = (cur == p || cur == q) ? 1 : 0;

    //     if(mid + left + right >=2){
    //         ans = cur;
    //     }

    //     return (mid + left + right > 0);
    // }
    
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNodee q){
    //     recurseTree(root,p,q);
    //     return ans;
    // }

    // Iterative Approach

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNodee q){
        
        Deque<TreeNode> stack = new ArrayDeque<>();

        Map<TreeNode,TreeNode> parentMap = nes HashMap<>();

        parentMap.put(root, null);
        stack.push(root);

        while(!parentMap.containsKey(p) || !parentMap.containsKey(q)){
            TreeNode node = stack.pop();

            if(node.left != null){
                parentMap.put(node.left, node);
                stack.push(node.left);
            }
            if(node.right != null){
                parentMap.put(node.right, node);
                stack.push(node.right);
            }
        }

        Set<TreeNode> ancestors = new HashSet<>();

        while(p != null){
            ancestors.add(p);
            p = parentMap.get(p);
        }

        while(!ancestors.contains(q)){
            q = parentMap.get(q);
        }
        return q;
    }

}
