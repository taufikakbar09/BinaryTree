package BinaryTree;

public class BinaryTreeTraverse implements Cloneable{
    NodeBt root;
    
    public static void visit(NodeBt t) {
        System.out.print(t.element+" ");
    }
    
    public void insert(Object data)
     {
         root = insert(root, data);
     }
    
    private NodeBt insert(NodeBt node, Object data)
     {
         if (node == null)
             node = new NodeBt(data);
         else
         {
             if (node.rightChild == null)
                 node.rightChild = insert(node.rightChild, data);
             else
                 node.leftChild = insert(node.leftChild, data);             
         }
         return node;
     }     
    
    public void preOrder(){
        preOrder(root);
    }
    public static void preOrder(NodeBt t) {
        if(t != null){
            visit(t);
            preOrder(t.leftChild);
            preOrder(t.rightChild);
        }
    }
    
    public void inOrder(){
        preOrder(root);
    }
    public static void inOrder(NodeBt t) {
        if(t != null){
            inOrder(t.leftChild);
            visit(t);
            inOrder(t.rightChild);
        }
    }
    
    public void postOrder(){
        postOrder(root);
    }
    public static void postOrder(NodeBt t) {
        if(t != null){
            postOrder(t.leftChild);
            postOrder(t.rightChild);
            visit(t);
        }
    }
    
    public Object clone(){
         try {         
             return super.clone();
         } catch (CloneNotSupportedException ex) {
             throw new Error("Error");
         }
    }    
    
    public void clonepostorder(){
        clone();
        postOrder();
    }
}
