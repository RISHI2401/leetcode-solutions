package Leetcodes;

import java.util.LinkedList;
import java.util.Queue;

public class maxAncestorDiff {
    public static int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }
    private static int dfs(TreeNode node, int maxValue, int minValue){
        if(node == null){
            return maxValue - minValue;
        }
        //update maxDifference
        int currentMax = Math.max(Math.abs(node.val - maxValue), Math.abs(node.val - minValue));

        //updating maxValue and minValue for the recursive calls
        maxValue = Math.max(maxValue, node.val);
        minValue = Math.min(minValue, node.val);

        //recursive calls on the left and right child
        int leftDiff = dfs(node.left, maxValue, minValue);
        int rightDIff = dfs(node.right, maxValue, minValue);

        return Math.max(currentMax, Math.max(leftDiff, rightDIff));
    }

    //---------------------------------------------------------------------------------------
    public static TreeNode createTree(Integer[] values) {
        if (values == null || values.length == 0 || values[0] == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(values[0]);
        queue.offer(root);

        int index = 1;
        while (index < values.length) {
            TreeNode current = queue.poll();

            Integer leftValue = values[index++];
            if (leftValue != null) {
                current.left = new TreeNode(leftValue);
                queue.offer(current.left);
            }

            if (index < values.length) {
                Integer rightValue = values[index++];
                if (rightValue != null) {
                    current.right = new TreeNode(rightValue);
                    queue.offer(current.right);
                }
            }
        }

        return root;
    }

//-----------------------------------------------------------------------------------------------

    public static void main(String[] args) {
        Integer[] values1 = {8,3,10,1,6,null,14,null,null,4,7,13};
        TreeNode root = createTree(values1);
        System.out.println(maxAncestorDiff(root));
    }

}
