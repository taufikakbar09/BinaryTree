/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

import java.lang.reflect.Method;

/**
 *
 * @author hp
 */
public interface InBinaryTree {
    public boolean isEmpty();
    public Object root();
    public InBinaryTree removeLeftSubtree();
    public InBinaryTree removeRightSubtree();
    public void preOrder(Method visit);
    public void inOrder(Method visit);
    public void postOrder(Method visit);
    public void levelOrder(Method visit);
}
