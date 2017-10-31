package BinaryTree;

import java.lang.reflect.Method;

public class LinkedBT extends ExtendedLinkedBT {
    NodeBt root;
    
    private static Method visit;
    static Object[] visiArgs = new Object[1];
    
    static int count;
    @SuppressWarnings("rawtypes")
	static Class [] paramType = {NodeBt.class};
    
    static Method theAdd1;
    static Method theOutput;
    
    static {
        try {
            Class<LinkedBT> lbt = LinkedBT.class;
            theAdd1 = lbt.getMethod("add1", paramType);
            theOutput = lbt.getMethod("output", paramType);
        } catch (Exception e) {
            //not possible
        }
    }
    
    public static void output(NodeBt t){   
        System.out.println(t.element + " ");    }
    
    public static void add1(NodeBt t){
        count++;}
    public void makeTree(Object root, Object left, Object right){
        this.root = new NodeBt(root, ((LinkedBT) left).root, ((LinkedBT) right).root);
    }
    public InBinaryTree removeLeftSubtree(){
        LinkedBT leftSubtree = new LinkedBT();
        leftSubtree.root = root.leftChild;
    return(InBinaryTree) leftSubtree;
    }
    
    public int size(){
        count = 0;
        preorder(theAdd1);
        return count;
    }
    
    public int height(){
        return theHeight(root);
    }
    
    static int theHeight(NodeBt t){
        if(t == null) return 0;
        int hl = theHeight(t.leftChild);
        int hr = theHeight(t.rightChild);
        if(hl > hr) return ++hl;
        else return ++hr;
    }
    
    public void preorder(Method visit){
        this.setVisit(visit);
        thepreorder(root);
    }
    static void thepreorder(NodeBt t){
        if(t != null){
            visiArgs[0] = t;
            try {
                getVisit().invoke(null, visiArgs);
            } catch (Exception e) {
                System.out.println(e);
            }
            thepreorder(t.leftChild);
            thepreorder(t.rightChild);
        }
    }
    public void preorderoutput(){
        preorder(theOutput);
    }
    
    public void inorder(Method visit){
        this.setVisit(visit);
        theinorder(root);
    }
    static void theinorder(NodeBt t){
        if(t != null){
            theinorder(t.leftChild);
            visiArgs[0] = t;
            try {
                getVisit().invoke(null, visiArgs);
            } catch (Exception e) {
                System.out.println(e);
            }
            theinorder(t.rightChild);
        }
    }
    public void inorderoutput(){
        inorder(theOutput);
    }
    
    public void postorder(Method visit){
        this.setVisit(visit);
        thepostorder(root);
    }
    static void thepostorder(NodeBt t){
        if(t != null){
            thepostorder(t.leftChild);
            thepostorder(t.rightChild);
            visiArgs[0] = t;
            try {
                getVisit().invoke(null, visiArgs);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public void postorderoutput(){
        postorder(theOutput);
    }

	public static Method getVisit() {
		return visit;
	}

	public void setVisit(Method visit) {
		LinkedBT.visit = visit;
	}
}
