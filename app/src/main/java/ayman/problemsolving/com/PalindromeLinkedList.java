package ayman.problemsolving.com;

import java.util.Stack;

public class PalindromeLinkedList {

    // 234. Palindrome Linked List
    // https://leetcode.com/problems/palindrome-linked-list/

    // Recursive
    public boolean isPlaindrome3(ListNode head) {
        int length = lengthOfList(head);
        Result result = isPalinromeRecurse(head, length);
        return result.result;
    }

    public Result isPalinromeRecurse(ListNode head, int length) {
        if (head == null || length <= 0) // Even number of nodes
            return new Result(head, true);
        else if (length == 1) // Odd number of nodes
            return new Result(head.next, true);

        /* Recurse on sublist. */
        Result res = isPalinromeRecurse(head.next,length -2);

        /* I child calls are not a palindrome, pass back up a failure */
        if (!res.result || res.node == null)
            return res;

        /* Check if matches corresponding node on other side. */
        res.result = (head.val == res.node.val);

        /* Return corresponding node. */
        res.node = res.node.next;

        return res;

    }

    class Result {
        public ListNode node;
        public boolean result;

        public Result(ListNode nod, boolean result) {
            this.node = nod;
            this.result = result;
        }
    }

    int lengthOfList(ListNode head) {
        int size = 0;
        while (head != null){
            size++;
            head = head.next;
        }
        return size;
    }

    // Iterative
    public boolean isPalindrome2(ListNode head) {
        ListNode node = head;
        Stack<Integer> stack = new Stack<>();

        while (node != null){
            stack.push(node.val);
            node = node.next;
        }

        node = head;
        while (node != null) {
            if (node.val != stack.pop())
                return false;
            node = node.next;
        }

        return true;
    }


    // Reverse and compare
    public boolean isPalindrome(ListNode head) {
        ListNode reversedNode = reverseLinkedList(head);
        return isLinkedListEqual(head, reversedNode);
    }

    public ListNode reverseLinkedList(ListNode head) {
        ListNode reversed = null;
        while (head != null) {
            ListNode node = new ListNode(head.val);
            node.next = reversed;
            reversed = node;
            head = head.next;
        }
        return reversed;
    }

    public boolean isLinkedListEqual(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val)
                return false;
            list1 = list1.next;
            list2 = list2.next;
        }
        return list1 == null && list2 == null;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
