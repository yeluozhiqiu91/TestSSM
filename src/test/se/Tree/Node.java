package se.Tree;

import java.io.Serializable;

/**
 * Created by wang on 2018/1/25.
 */
public class Node implements Serializable{
    private static final long serialVersionUID = 7297854954428519376L;
    private char data;
    private Node leftChild;
    private Node rightChild;

    public Node(char data) {
        this.data = data;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return ""+data;
    }
}
