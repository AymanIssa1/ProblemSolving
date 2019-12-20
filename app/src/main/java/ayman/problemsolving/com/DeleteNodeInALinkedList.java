package ayman.problemsolving.com;

public class DeleteNodeInALinkedList {


    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static class ListNode {
        int val;
        ReverseLinkedList.ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
