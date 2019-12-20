package ayman.problemsolving.com;

public class IntersectionOfTwoLinkedLists {



    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int headALength = linkedListLength(headA);
        int headBLength = linkedListLength(headB);

        ListNode shorterLinkedList = headALength > headBLength ? headB : headA;
        ListNode longerLinkedList = headALength > headBLength ? headA : headB;

        longerLinkedList = moveToPosition(longerLinkedList, Math.abs(headALength - headBLength));

        while (shorterLinkedList != null && longerLinkedList != null) {
            if (longerLinkedList == shorterLinkedList)
                return longerLinkedList;

            shorterLinkedList = shorterLinkedList.next;
            longerLinkedList = longerLinkedList.next;
        }
        return null;
    }

    public ListNode moveToPosition(ListNode head, int steps){
        while (steps != 0) {
            head = head.next;
            steps--;
        }
        return head;
    }

    public int linkedListLength(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
