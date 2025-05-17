package Leetcodes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class amountOfTime {
    public static int amountOfTime(TreeNode root, int start) {
        if (root == null)
        {
            return 0;
        }
        int minutes = 0;
        List<Integer> infectedNodes = new ArrayList<>();
        if(root.val != start){
            infectedNodes.add(start);
        }

        //implementing BFS (Breath-First Search)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int currentLevelSie = queue.size();

            for(int i=0; i<currentLevelSie; i++){
                TreeNode currentNode = queue.poll();

                List<TreeNode> neighbors = getAdjacentNodes(currentNode);
                for(TreeNode neighbor : neighbors){
                    int neighborValue = neighbor.val;
                    if(!infectedNodes.contains(neighborValue)){
                        infectedNodes.add(neighborValue);
                        queue.offer(neighbor);
                    }
                }
            }
            minutes++;
        }
        return minutes;
    }
    private static List<TreeNode> getAdjacentNodes(TreeNode node){
        if(node == null){
            return new ArrayList<>();
        }
        List<TreeNode> neighbor = new ArrayList<>();
        if(node.left != null){
            neighbor.add(node.left);
        }
        if(node.right != null){
            neighbor.add(node.right);
        }
        return neighbor;
    }

//----------------------------------------------------------------------------------------------
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
        Integer[] values1 = {1,2,null,3,null,4,null,5};
        TreeNode root = createTree(values1);
        System.out.println(amountOfTime(root, 1));
    }
}
