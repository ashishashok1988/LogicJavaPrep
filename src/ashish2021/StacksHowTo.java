package ashish2021;

public class StacksHowTo {

    StackNode<Integer> top;

    public void push(Integer value) {
        StackNode<Integer> newNode = new StackNode<Integer>(value);
        System.out.println("Pushing " + newNode.value);
        if (top == null) {
            top = newNode;
        } else {
            StackNode<Integer> temp = top;
            top = newNode;
            top.next = temp;
        }
    }

    public void pop() {
        StackNode<Integer> popedTop = null ;
        if (top != null) {
            popedTop = top;
            top = top.next;
        }
        System.out.println("Popped " + popedTop.value);
    }

    public void viewElements() {
        System.out.println("Viewing elements:");
        StackNode<Integer> focusNode = top;
        while(focusNode!=null) {
            System.out.print(focusNode.value + "\t");
            focusNode = focusNode.next;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        StacksHowTo stacksHowTo = new StacksHowTo();
        stacksHowTo.push(10);
        stacksHowTo.push(20);
        stacksHowTo.push(30);
        stacksHowTo.push(40);
        stacksHowTo.push(50);
        stacksHowTo.push(60);
        stacksHowTo.viewElements();
        stacksHowTo.pop();
        stacksHowTo.pop();
        stacksHowTo.viewElements();
        stacksHowTo.push(70);
        stacksHowTo.push(80);
        stacksHowTo.viewElements();
        stacksHowTo.pop();
        stacksHowTo.viewElements();
        
    }
}

class StackNode<T> {

    public  T value;

    public StackNode<T> next;
    
    public StackNode(T value) {
        this.value = value;
    }

}