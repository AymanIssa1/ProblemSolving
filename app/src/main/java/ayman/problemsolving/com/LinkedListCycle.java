package ayman.problemsolving.com;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode fastRunner = head.next;
        ListNode slowRunner = head;

        while (fastRunner != slowRunner) {
            if (fastRunner == null || fastRunner.next == null)
                return false;

            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;
        }
        return true;
    }

    public boolean hasCycle2(ListNode head){
        Set<ListNode> addedNodes = new HashSet<>();
        while (head != null){
            if (addedNodes.contains(head))
                return true;
            else
                addedNodes.add(head);
            head = head.next;
        }
        return false;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
