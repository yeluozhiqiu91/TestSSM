package se.Tree;

/**
 * Created by wang on 2018/1/29.
 */
public class TestTreeNew {
    public static void main(String[] args) {
        Node root=new Node('A');
        Node l21=new Node('B');
        Node l22=new Node('C');
        Node l31=new Node('D');
        Node l32=new Node('E');
        Node l33=new Node('F');
        Node l34=new Node('G');
        Node l42=new Node('H');
        root.setLeftChild(l21);
        root.setRightChild(l22);
        l21.setLeftChild(l31);
        l21.setRightChild(l32);
        l22.setLeftChild(l33);
        l22.setRightChild(l34);
        l31.setRightChild(l42);
        VisitBinaryTreeNew.preOrderDiGui(root);
        System.out.println();
        VisitBinaryTreeNew.middleOrderDiGui(root);
        System.out.println();
        VisitBinaryTreeNew.afterOrderDiGui(root);
        System.out.println();
        VisitBinaryTreeNew.preOrder(root);
        System.out.println();
        VisitBinaryTreeNew.middleOrder(root);
        System.out.println();
        VisitBinaryTreeNew.afterOrder(root);
    }
}
