package BinaryTree;

public class BT {
    private NodeBt root;
 
     
     public BT()
     {
         root = null;
     }
    
     public boolean isEmpty()
     {
         return root == null;
     }
     
     public void insert(int data)
     {
         root = insert(root, data);
     }
     
     private NodeBt insert(NodeBt node, int data)
     {
         if (node == null)
             node = new NodeBt(data);
         else
         {
             if (node.getRight() == null)
                 node.right = insert(node.right, data);
             else
                 node.left = insert(node.left, data);             
         }
         return node;
     }     
     
     public int countNodes()
     {
         return countNodes(root);
     }
     
     private int countNodes(NodeBt r)
     {
         if (r == null)
             return 0;
         else
         {
             int l = 1;
             l += countNodes(r.getLeft());
             l += countNodes(r.getRight());
             return l;
         }
     }
     
     public boolean search(int val)
     {
         return search(root, val);
     }
     
     private boolean search(NodeBt r, int val)
     {
         if (r.getData() == val)
             return true;
         if (r.getLeft() != null)
             if (search(r.getLeft(), val))
                 return true;
         if (r.getRight() != null)
             if (search(r.getRight(), val))
                 return true;
         return false;         
     }
     
     public void inorder()
     {
         inorder(root);
     }
     private void inorder(NodeBt r)
     {
         if (r != null)
         {
             inorder(r.getLeft());
             System.out.print(r.getData() +" ");
             inorder(r.getRight());
         }
     }
    
     public void preorder()
     {
         preorder(root);
     }
     private void preorder(NodeBt r)
     {
         if (r != null)
         {
             System.out.print(r.getData() +" ");
             preorder(r.getLeft());             
             preorder(r.getRight());
         }
     }
    
     public void postorder()
     {
         postorder(root);
     }
     private void postorder(NodeBt r)
     {
         if (r != null)
         {
             postorder(r.getLeft());             
             postorder(r.getRight());
             System.out.print(r.getData() +" ");
         }
     }     
}
