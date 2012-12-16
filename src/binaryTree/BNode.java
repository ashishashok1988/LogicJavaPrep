package binaryTree;

public class BNode {

    public BNode left,  right; // the nodes
    public Data data; //the AnyClass object

    public BNode(Data data ) {//constructor
        this.data= data;
        this.left = null;
        this.right = null;
    }

    public void show() {
        //calls the show method of the AnyClass
        System.out.println(data.surname + "-" +data.value);
    }
}