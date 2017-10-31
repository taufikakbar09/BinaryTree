package BinaryTree;

public class ExtendedLinkedBT implements ExtendedBT , Cloneable{

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            throw new Error("Error");
        }
    }

    public boolean compare(NodeBt root1, NodeBt root2) {
        if (root1 == null || root2 == null) {
            return true;
        }
        if (root1 != null || root2 != null) {
            return (root1.element == root2.element
                    && compare(root1.leftChild, root2.leftChild)
                    && compare(root1.rightChild, root2.rightChild));
        }
        return false;
    }

    public void Swap(final NodeBt root) {
        final NodeBt temp = root.rightChild;
        root.rightChild = root.leftChild;
        root.leftChild = temp;

        if (root.leftChild != null) {
            Swap(root.leftChild);
        }

        if (root.rightChild != null) {
            Swap(root.rightChild);
        }
    }
}
