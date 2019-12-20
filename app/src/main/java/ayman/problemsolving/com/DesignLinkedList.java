package ayman.problemsolving.com;

public class DesignLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode head;

    /**
     * Initialize your data structure here.
     */
    public DesignLinkedList() {

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (head == null)
            return -1;

        int counter = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            if (counter == index)
                return currentNode.val;
            counter++;
            currentNode = currentNode.next;
        }
        return -1;
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        ListNode currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new ListNode(val);
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index >= 0) {
            int counter = 0;
            ListNode currentNode = head;
            while (currentNode != null) {
                if (counter < index - 1)
                    break;

                counter++;
                currentNode = currentNode.next;
            }

            if (counter < index - 1 && currentNode != null) {
                ListNode newNode = new ListNode(val);
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        } else {
            addAtHead(val);
        }

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index >= 0) {
            int counter = 0;
            ListNode currentNode = head;
            while (currentNode != null) {
                if (counter < index - 1)
                    break;
                counter++;
                currentNode = currentNode.next;
            }

            if (currentNode != null) {
                if (currentNode.next != null)
                    currentNode.next = currentNode.next.next;
                else
                    currentNode = null;
            }
        }
    }

}
