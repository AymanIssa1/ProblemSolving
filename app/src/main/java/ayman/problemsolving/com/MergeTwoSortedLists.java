package ayman.problemsolving.com;

public class MergeTwoSortedLists {

    public static void main(String... args){
        ListNode l1Head = new ListNode(1);
        ListNode l1 = l1Head;
        l1.next = new ListNode(2);
        l1 = l1.next;
        l1.next = new ListNode(4);

        ListNode l2Head = new ListNode(1);
        ListNode l2 = l2Head;
        l2.next = new ListNode(3);
        l2 = l2.next;
        l2.next = new ListNode(4);

        ListNode sortedList = mergeTwoLists(l1Head,l2Head);

        while (sortedList != null) {
            System.out.print(sortedList.val + ",");
            sortedList = sortedList.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode p = head;

        while (l1 != null || l2 != null){
            if (l1 != null && l2 != null){
                if (l1.val <= l2.val){
                    p.next = l1;
                    l1 = l1.next;
                } else {
                    p.next = l2;
                    l2 = l2.next;
                }
                p = p.next;
            } else if (l1 == null) {
                p.next = l2;
                l2 = l2.next;
                p = p.next;
            } else if (l2 == null) {
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            }
        }

        return head.next;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
