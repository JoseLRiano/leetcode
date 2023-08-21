
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root != null){
            q.offer(root);
        }
        TreeNode cur;
        while(!q.isEmpty()){
            int size = size();
            List<Integer> subAns = new LinkedList<>();
            for(int i = 0; i < size; i++){
                cur = q.poll();
                subAns.add(cur.val);
                if(cur.left != null){
                    q.offer(cur.left);
                }
                if(cur.right != null){
                    q.offer(cur.right);
                }
            }
            ans.add(subAns);
        }
        return ans;
    }
}
