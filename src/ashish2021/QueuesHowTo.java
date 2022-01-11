package ashish2021;

public class QueuesHowTo {

    QueueNode<Integer> front;
    QueueNode<Integer> rear;

    public void enqueue(Integer value) {
        QueueNode<Integer> newNode = new QueueNode<Integer>(value);
        System.out.println("Pushing " + newNode.value);
        if (front == null && rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue() {
        QueueNode<Integer> poppedFront = null ;
        if (front != null) {
            poppedFront = front;
            front = front.next;
        }
        System.out.println("dequeued " + poppedFront.value);
    }

    public void viewElements() {
        System.out.println("Viewing elements:");
        QueueNode<Integer> focusNode = front;
        while(focusNode!=null) {
            System.out.print(focusNode.value + "\t");
            focusNode = focusNode.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        QueuesHowTo queuesHowTo = new QueuesHowTo();
        queuesHowTo.enqueue(10);
        queuesHowTo.enqueue(20);
        queuesHowTo.enqueue(30);
        queuesHowTo.enqueue(40);
        queuesHowTo.enqueue(50);
        queuesHowTo.enqueue(60);
        queuesHowTo.viewElements();
        queuesHowTo.dequeue();
        queuesHowTo.dequeue();
        queuesHowTo.viewElements();
        queuesHowTo.enqueue(70);
        queuesHowTo.enqueue(80);
        queuesHowTo.viewElements();
        queuesHowTo.dequeue();
        queuesHowTo.viewElements();
        
    }
}
class QueueNode<T> {

    public  T value;

    public QueueNode<T> next;
    
    public QueueNode(T value) {
        this.value = value;
    }

}