package se.Tree;

/**
 * Created by wang on 2018/1/25.
 */
public class TreeTest {
    public static void main(String[] args) {
        Node root=new Node('A');
        Node l21=new Node('B');
        Node l22=new Node('C');
        Node l31=new Node('D');
        Node l32=new Node('E');
        Node l33=new Node('F');
        Node l34=new Node('G');
        root.setLeftChild(l21);
        root.setRightChild(l22);
        l21.setLeftChild(l31);
        l21.setRightChild(l32);
        l22.setLeftChild(l33);
        l22.setRightChild(l34);
        System.out.print("先序：");
        VisitBinaryTree.preOrderDiGui(root);
        System.out.println();
        System.out.print("中序：");
        VisitBinaryTree.middleDiGui(root);
        System.out.println();
        System.out.print("后序：");
        VisitBinaryTree.afterDiGui(root);
        System.out.println();
        System.out.print("非递归先序：");
        VisitBinaryTree.preOrder(root);
        System.out.println();
        System.out.print("非递归中序：");
        VisitBinaryTree.middle(root);
        System.out.println();
        System.out.print("非递归后序：");
        VisitBinaryTree.after(root);
    }
}
