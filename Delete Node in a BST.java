class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return root;

        if (root.val == key) {

            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode lef = root.left;

                TreeNode temp = lef;

                while (temp.right != null) {
                    temp = temp.right;
                }

                root.val = temp.val;
                root.left = deleteNode(root.left, temp.val);
                return root;
            }
        }
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        } else {
            root.right = deleteNode(root.right, key);
            return root;
        }

    }
}