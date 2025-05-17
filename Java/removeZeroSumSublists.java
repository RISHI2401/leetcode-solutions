package Leetcodes;

import java.util.List;

public class removeZeroSumSublists {
    public static ListNode removeZeroSumSublists(ListNode head) {
        if(head == null)return head;
        ListNode prev = null;
        ListNode cur = head;
        int  running_sum=0;
        while(cur!=null)
        {
            running_sum += cur.val;
            if(running_sum==0)
            {
                if(prev == null)
                    head = cur.next;
                else
                    prev.next = cur.next;
                return removeZeroSumSublists(head);
            }
            cur = cur.next;
        }
        head.next = removeZeroSumSublists(head.next);
        return head;
    }
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static ListNode createLinkedList(int[] array) {
        ListNode dummy = new ListNode(0); // Create a dummy node to simplify insertion
        ListNode current = dummy;

        for (int value : array) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next; // Return the actual head of the linked list (skip the dummy node)
    }

    public static void main(String[] args) {
        int[] array = {1,2,-3,3,1};
        ListNode head = createLinkedList(array);
        ListNode ans = removeZeroSumSublists(head);
        printLinkedList(ans);
    }

}
