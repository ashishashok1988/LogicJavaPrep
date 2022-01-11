package ashish2021;

public class ReverseLinkedList {

    ListNode head;

    public static void main(String args[]) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        reverseLinkedList.addNode(10);
        reverseLinkedList.addNode(20);
        reverseLinkedList.addNode(15);
        reverseLinkedList.addNode(25);
        reverseLinkedList.addNode(30);
        reverseLinkedList.addNode(36);
        reverseLinkedList.addNode(20);
        reverseLinkedList.addNode(89);

        ListNode reverseNode = reverseLinkedList.reverseLinkedList();
        
        reverseLinkedList.displayNode(reverseNode);
        
    }

    public ListNode reverseLinkedList() {
        ListNode prev = null;

        while(head!=null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
         }
        
        return prev;
    }

    public void displayNode(ListNode node) {
        ListNode nextNode = node;
        System.out.println("Displaying List:");
        while(nextNode!=null) {
            System.out.println(nextNode.value);
            nextNode = nextNode.next;            
        }
    }

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
}

class ListNode {
    public int value;
    
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }
}