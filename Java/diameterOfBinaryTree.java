package Leetcodes;

import Learning.TreeNode;

public class diameterOfBinaryTree {
    public static Learning.TreeNode createBinaryTree(int[] array, int index) {
        Learning.TreeNode root = null;

        if (index < array.length && array[index] != -1) {
            root = new Learning.TreeNode(array[index]);
            root.left = createBinaryTree(array, 2 * index + 1);
            root.right = createBinaryTree(array, 2 * index + 2);
        }

        return root;
    }

    public static int diameterOfBinaryTree(Learning.TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(Math.max(leftDiameter, rightDiameter), leftHeight + rightHeight);
    }
    public static int Height(Learning.TreeNode node){
        if (node == null){ return 0; }
        return 1 + Math.max(Height(node.left), Height(node.right));
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 3, 4, 5};
        Learning.TreeNode root = createBinaryTree(nodes, 0);
        System.out.println(diameterOfBinaryTree(root));
    }
}
