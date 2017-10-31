package BinaryTree;

public class BinaryTree {
    Object element;
    BinaryTree leftChild;  
    BinaryTree rightChild; 
    
    public static void visit(BinaryTree t){
        System.out.print(t.element+" ");
    }
    
    public BinaryTree(){
        
    }
    public BinaryTree(Object theElement, BinaryTree theleftChild, BinaryTree therightChild){
        element = theElement;
        leftChild = theleftChild;
        rightChild = therightChild;
       
    }
    public static void preOrder(BinaryTree t){
        if (t !=null){
            visit(t);
            preOrder(t.leftChild);
            preOrder(t.rightChild);
        }
    }
    public static void inOrder(BinaryTree t){
        inOrder(t.leftChild); 
        visit(t); 
        inOrder(t.rightChild); 
    }
    public static void postOrder(BinaryTree t){
        if (t!=null){
            postOrder(t.leftChild); 
            postOrder(t.rightChild); 
            visit(t); 
            
        }
    }
}
