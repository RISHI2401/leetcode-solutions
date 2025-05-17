package Leetcodes;

import java.util.LinkedList;
import java.util.Queue;

public class pseudoPalindromicPaths {
    static Integer res = 0;
    public static int pseudoPalindromicPaths (TreeNode root) {
        countPathsRecursive(root, new int[10]);
        return res;
    }

    private static void countPathsRecursive(TreeNode root, int[] counts) {
        if(root == null) return;
        counts[root.val]++;
        if(root.left == null && root.right == null) {
            if(isPalidromic(counts)) res++;
        } else {
            countPathsRecursive(root.left, counts);
            countPathsRecursive(root.right, counts);
        }

        counts[root.val]--;
    }

    private static boolean isPalidromic(int[] counts) {
        int odds = 0;
        for(int i : counts) {
            if(i%2 == 1) {
                odds++;
            }
        }
        return odds <= 1;
    }

//    ------------------------------------------------------------------------------------------------------------------
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
        Integer[] treenodes = {2,3,1,3,1,null,1};

        TreeNode root = createTree(treenodes);

        System.out.println(pseudoPalindromicPaths(root));

    }
}


//Code in PYTHON

/*
from typing import Optional, List

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    result = 0

    def pseudoPalindromicPaths(self, root: Optional[TreeNode]) -> int:
        counts = [0] * 10
        self.countPathRecursive(root, counts)
        return self.result

    def countPathRecursive(self, root: Optional[TreeNode], counts: List[int]):
        if root is None:
            return

        counts[root.val] += 1

        if root.left is None and root.right is None:
            if self.isPalindromic(counts):
                self.result += 1
        else:
            self.countPathRecursive(root.left, counts.copy())  # Copy counts to avoid modifying the same list
            self.countPathRecursive(root.right, counts.copy())

        counts[root.val] -= 1

    def isPalindromic(self, counts: List[int]) -> bool:
        odds = 0
        for i in counts:
            if i % 2 == 1:
                odds += 1

        return odds <= 1

 */
