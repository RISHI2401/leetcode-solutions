package Leetcodes;

import Learning.TreeNode;
import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class findBottomLeftValue {
    // Map to store the heights of left subtrees
    private static Map<Integer, Integer> map = new HashMap<>();

    public static Learning.TreeNode createBinaryTree(Integer[] array, int index) {
        Learning.TreeNode root = null;

        if (index < array.length && array[index] != null) {
            root = new Learning.TreeNode(array[index]);
            root.left = createBinaryTree(array, 2 * index + 1);
            root.right = createBinaryTree(array, 2 * index + 2);
        }

        return root;
    }

    public static int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode leftmost = null;

        while (!q.isEmpty()) {
            leftmost = q.poll();

            if (leftmost.right != null) {
                q.offer(leftmost.right);
            }
            if (leftmost.left != null) {
                q.offer(leftmost.left);
            }
        }

        return leftmost.val;
    }

    public static int findMaxHeightLeftSubtree(TreeNode root) {
        int maxHeight = 0;
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxHeight) {
                maxHeight = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] nodes = {2, 1, 3};
        Integer[] nodes2 = {1, 2, 3, 4, null, 5, 6, null, null, 7};
        Learning.TreeNode root = createBinaryTree(nodes, 0);
        Learning.TreeNode root2 = createBinaryTree(nodes2, 0);
        System.out.println(findBottomLeftValue(root));
        System.out.println(findBottomLeftValue(root2));
    }
}
