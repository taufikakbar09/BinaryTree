package BinaryTree;

public class NodeBt {
     NodeBt left, right;
     int data;
 
     
     public NodeBt()
     {
         left = null;
         right = null;
         data = 0;
     }
     
     public NodeBt(int n)
     {
         left = null;
         right = null;
         data = n;
     }
     
     public void setLeft(NodeBt n)
     {
         left = n;
     }
     
     public void setRight(NodeBt n)
     {
         right = n;
     }
     
     public NodeBt getLeft()
     {
         return left;
     }
     
     public NodeBt getRight()
     {
         return right;
     }
     
     public void setData(int d)
     {
         data = d;
     }
     
     public int getData()
     {
         return data;
     }     
}
