package ayman.problemsolving.com;

public class Main {


    public static void main(String... args) {
        DesignLinkedList designLinkedList = new DesignLinkedList();
        designLinkedList.addAtHead(1);
        designLinkedList.addAtTail(3);
        designLinkedList.addAtIndex(4,2);
        System.out.println(designLinkedList.get(1));
        designLinkedList.deleteAtIndex(-1);
        System.out.println(designLinkedList.get(1));


        while (designLinkedList.head != null) {
            System.out.print(designLinkedList.head.val + " -> ");
            designLinkedList.head = designLinkedList.head.next;
        }
    }

}
