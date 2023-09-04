class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

// BSF Solution

class Solution{
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target){
        Deque<TreeNode> q_o = new ArrayDeque<>();
        Deque<TreeNode> q_c = new ArrayDeque<>();

        q_o.offer(orignal);
        q_c.offer(cloned);
        while(!q_o.isEmpty()){
            TreeNode currOriginal = q_o.poll();
            TreeNode currCloned = q_c.poll();

            if(currOriginal == target) return currCloned;
            if(currOriginal.left != null){
                q_o.offer(curreOriginal.left);
                q_c.offer(currCloned.left);
            }
            if(currOriginal.right != null){
                q_o.offer(currOriginal.right);
                q_c.offer(currCloned.right);
            }
        }
        return null;
    }
}

// DFS Preorder Solution (recursion)

class Solution{
    public TreeNode inorderHelper(TreeNode o, TreeNode c, TreeNode t){
        // Base case if tree is empty or node is empty
        if(o == null) return null;
        // node found
        if(o == t) return c;
        // search the left subtree
        TreeNode left = inorderHelper(o.left,c.left,t);
        if(left != null){
            return left;
        }else{
            // else is on the right side
            return inorderHelper(o.right, c.right, t);
        }

    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target){
        return inorderHelper(original, cloned, target);     
    }
}

// DFS Inorder Solution (recursion)

class Solution{
    TreeNode ans, target;
    public void inorderHelper(TreeNode o, TreeNode c){
        if(o != null){
            inorderHelper(o.left,c.left);
            if(o == target){
                ans = c;
            }
            inorderHelper(o.right,c.right);
        }
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target){
        this.target = target;
        inorderHelper(original, cloned);  
        return ans;   
    }
}