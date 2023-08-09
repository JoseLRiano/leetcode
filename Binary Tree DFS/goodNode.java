class Solution{
    // This class will create and object node, int to save into the Stack
    // class NodeAndMax {
    //     public TreeNode node;
    //     public int max;

    //     public NodeAndMax(TreeNode node, int max){
    //         this.node = node;
    //         this.max = max;
    //     }
    // }

    // public int goodNodes(TreeNode root){
    //     //  iteration approach using a Stack to transverse the tree
    //     int goodNodes = 0;
    //     Stack<NodeAndMax> stack = new Stack<>();
    //     stack.push(new NodeAndMax(root, root.val));

    //     while(!stack.isEmpty()){
    //         NodeAndMax currentNodeAndMax = stack.pop();
    //         TreeNode curNode = currentNodeAndMax.node;
    //         int max = currentNodeAndMax.max;

    //         if(curNode.val >= max){
    //             goodNodes++;
    //             max = curNode.val;
    //         }
    //         if(curNode.right != null){
    //             stack.push(new NodeAndMax(curNode.right, max));
    //         }
    //         if(curNode.left != null){
    //             stack.push(new NodeAndMax(curNode.left, max));
    //         }
    //     }
    //     return goodNodes;
    // }

    //  Recursive Approach
    
    private int count = 0;
    public int goodNodes(TreeNode root) {
        
        dfs(Integer.MIN_VALUE, root);
        return count;
    }

    public void dfs(int max, TreeNode root){
        TreeNode node = root;
        if(max <= node.val){
            count++;
        }
        if(node.left != null){
            dfs( Math.max(node.val, max), node.left);
        }
        if(node.right != null){
            dfs( Math.max(node.val, max), node.right);
        }
    }
}