package ashish2021;

public class BinarySearchTree {

    TreeNode root;
    
    public void addNode(int value) {
        TreeNode newNode = new TreeNode(value);
        
        if (root == null) {
            root = newNode;
            return;
        } else {
            TreeNode focusNode = root;

            while(true) {
                if (value <= focusNode.value) {
                    if (focusNode.leftChild == null) {
                        focusNode.leftChild = newNode;
                        return;
                    } else {
                        focusNode = focusNode.leftChild;
                    }
                        
                } else {
                    if (focusNode.rightChild == null) {
                        focusNode.rightChild = newNode;
                        return;
                    } else {
                        focusNode = focusNode.rightChild;
                    }
                }
            }
        }
    }

    public void inOrderTraversal(TreeNode node) {
        if (node!=null) {
            inOrderTraversal(node.leftChild);
            System.out.println(node.value);
            inOrderTraversal(node.rightChild);
        }       
    }

    public static void main(String args[]) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.addNode(50);
        binarySearchTree.addNode(25);
        binarySearchTree.addNode(15);
        binarySearchTree.addNode(30);
        binarySearchTree.addNode(75);
        binarySearchTree.addNode(85);
        binarySearchTree.addNode(52);
        binarySearchTree.addNode(15);
        binarySearchTree.inOrderTraversal(binarySearchTree.root);
    }
}

class TreeNode {
    public int value;
    public TreeNode leftChild;
    public TreeNode rightChild;
    
    public TreeNode(int value) {
        this.value = value;
    }

    public String toString() {
        return String.valueOf(value);
    }
}