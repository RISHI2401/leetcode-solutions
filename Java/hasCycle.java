package Leetcodes;

import java.util.List;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}
public class hasCycle {
    public static boolean hasCycle(ListNode head){
        if(head == null || head.next == null){
            return false;
        }
        ListNode turtoise = head;
        ListNode hare = head.next;

        while(hare != null && hare.next != null){
            if(turtoise == hare){
                return true;
            }
            turtoise = turtoise.next;
            hare = hare.next.next;
        }
        return false;
    }
    public static int findLength(ListNode head){
        int length = 0;
        ListNode current = head;

        while(current != null){
            length++;
            current = current.next;
        }
        return length;
    }
    public static ListNode getNodeAtIndex(ListNode head, int index){
        if(head == null || index < 0){
            return null;
        }
        ListNode current = head;
        int currentIndex = 0;

        while(current != null && currentIndex < index){
            current = current.next;
            currentIndex++;
        }
        return current;
    }
    public static ListNode middleNode(ListNode head) {
        // so again we are using the turtoise and hare algorithm with a small catch that we are not catching them this time
        if(head == null){return null;}
        ListNode turtoise = head;
        ListNode hare = head; // also here we are keeping the head and not head.next because we are not catching

        while(hare != null && hare.next != null){
            //  therefore no if(turtoise == hare) statement
            turtoise = turtoise.next;
            hare = hare.next.next;
        }
        return turtoise;
    }
}
