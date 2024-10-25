class Solution {
    int max = 0;
    public int longestZigZag(TreeNode root) {

        if(root.left != null)
            helper(root.left, 'l', 0);

        if(root.right != null)
            helper(root.right, 'r', 0);

        return max;
    }
    void helper(TreeNode root, char c, int count)
    {

        if(root == null)
        {
            max = Math.max(max, count);
            return;
        }

        if(c=='r')
        {
            helper(root.left, 'l', count+1);
            helper(root.right, 'r', 0);
        }

        else
        {
            helper(root.right, 'r', count+1);
            helper(root.left, 'l', 0);
        }
    }
}
