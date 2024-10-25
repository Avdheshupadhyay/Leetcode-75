class Solution {
    List<Integer> ans = new ArrayList<>();
    public void solve(TreeNode node, int level){
        if(ans.size() == level) {
            ans.add(node.val);
        }
        if(node.right!=null) solve(node.right, level+1);
        if(node.left!=null) solve(node.left, level+1);
        
        
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null){
            return ans;
        }

        solve(root, 0);
        return ans;
    }
}