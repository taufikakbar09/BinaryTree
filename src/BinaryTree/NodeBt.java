package BinaryTree;

public class NodeBt {
    Object element;
    NodeBt leftChild;
    NodeBt rightChild;

    public NodeBt() {
    }
    
    public NodeBt(Object n)
     {
         leftChild = null;
         rightChild = null;
         element = n;
     }

    public NodeBt(Object element, NodeBt leftChild, NodeBt rightChild) {
        this.element = element;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
}
