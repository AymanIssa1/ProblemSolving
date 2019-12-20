package ayman.problemsolving.com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLinkedList {

    // 206. Reverse Linked List
    // https://leetcode.com/problems/reverse-linked-list

    public static void main(String... arg) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);

        ListNode reversed = reverseList3(head);

        while (reversed != null){
            System.out.print(reversed.val + " -> ");
            reversed = reversed.next;
        }
    }


    public static ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        Stack<Integer> stack = new Stack<>();

        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        ListNode reversedLinkedListHead = new ListNode(stack.pop());
        ListNode reversedLinkedListRef = reversedLinkedListHead;
        while (!stack.isEmpty()) {
            reversedLinkedListRef.next = new ListNode(stack.pop());
            reversedLinkedListRef = reversedLinkedListRef.next;
        }
        return reversedLinkedListHead;
    }


    public static ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = null;

        ListNode reversedList = reverseList2(next);
        next.next = head;

        return reversedList;
    }

    public static ListNode reverseList3(ListNode head) {
        ListNode reversed = null;
        while (head != null) {
            ListNode node = new ListNode(head.val);
            node.next = reversed;
            reversed = node;
            head = head.next;
        }
        return reversed;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
