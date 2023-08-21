public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

//   DFS Recusive Approach

class rangeSumofBST {
    int ans;
    public void dfs(TreeNode node, int l, int h){
        if(node != null){
            if(node.val >= l && node.val <= h){
                ans += node.val;
            }
            if(node.val > l){
                dfs(node.left, l,  h);
            }
            if(node.val < h){
                dfs(node.right, l, h);
            }
        }
    }
    public int rangeSumBTS(TreeNode root, int low, int high){
        ans = 0;
        dfs(root, low, high);
        return ans;
    }
}

// Iteration Approach using a queue

// class rangeSumofBST{
//     public int rangeSumBTS(TreeNode root, int low, int high){
//         if(root.val == low && root.val == high) return root.val;

//         Queue<TreeNode> q = new LinkedList<>();
//         int sum = 0;
//         q.add(root);
//         while(!q.isEmpty()){
//             TreeNode cur = q.poll();
//             if(cur.val >= low && cur.val <= high){
//                 sum += cur.val;
//             }
//             if(cur.left != null && low < cur.val){
//                 q.add(cur.left);
//             }
//             if(cur.right != null && high > cur.val){
//                 q.add(cur.right);
//             }
//         }
//         return sum;
//     }
// }
