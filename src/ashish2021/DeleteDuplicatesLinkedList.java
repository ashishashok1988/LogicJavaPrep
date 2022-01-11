package ashish2021;

public class DeleteDuplicatesLinkedList {

    ListNode head; 

    public void addNode(int value) {
        ListNode newNode = new ListNode(value);
        ListNode nextNode = null;
        if (head == null) {
            head = newNode;
        } else {
            nextNode = head;
            while(true) {
                if(nextNode.next==null) {
                    nextNode.next = newNode;
                    return;
                } else {
                    nextNode = nextNode.next;
                }
            }
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode focusNode = head;
        head = null;
        while (focusNode.next!=null) {
            ListNode nextNode = focusNode.next;
            if (focusNode.value == nextNode.value) {
                focusNode.next = nextNode.next.next;
                focusNode = nextNode.next;
            } else {
                if(head == null) {
                    head = focusNode;
                }
                focusNode = nextNode;
            }
        }
        
        return head;
    }

    public static void main(String args[]) {
        DeleteDuplicatesLinkedList linkedList = new DeleteDuplicatesLinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(4);
        linkedList.addNode(5);
        
        ListNode returnedHead = linkedList.deleteDuplicates(linkedList.head);
        System.out.println(returnedHead);
    }
}

