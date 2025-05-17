package Leetcodes;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leafSimilar {
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1 = treeLeafs(root1, list1);
        list2 = treeLeafs(root2, list2);

        return list1.equals(list2);
    }

    private static List<Integer> treeLeafs(TreeNode root, List<Integer> list){
        if(root == null){
            return list;
        }
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        //recursive approach for both sub trees
        treeLeafs(root.left, list);
        treeLeafs(root.right, list)
;
        return list;
    }
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

    public static void main(String[] args) {
        Integer[] values1 = {1,2,3};
        Integer[] values2 = {1,3,2};

        TreeNode root1 = createTree(values1);
        TreeNode root2 = createTree(values2);

        System.out.println(leafSimilar(root1, root2));

    }
}
