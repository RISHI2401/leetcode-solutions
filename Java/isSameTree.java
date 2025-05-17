package Leetcodes;

import javax.sound.midi.Soundbank;

public class isSameTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode createBinaryTree(int[] array, int index) {
        TreeNode root = null;

        if (index < array.length && array[index] != -1) {
            root = new TreeNode(array[index]);
            root.left = createBinaryTree(array, 2 * index + 1);
            root.right = createBinaryTree(array, 2 * index + 2);
        }

        return root;
    }
    public static boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        int[] p = {1,2,3};
        int[] q = {1,2,3};
        isSameTree isSameTree = new isSameTree();
        TreeNode p_tree = isSameTree.createBinaryTree(p, 0);
        TreeNode q_tree = isSameTree.createBinaryTree(q, 0);
        System.out.println(isSameTree(p_tree, q_tree));
    }

}
