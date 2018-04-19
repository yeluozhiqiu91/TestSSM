package se.Tree;

import java.util.Stack;

/**
 * Created by wang on 2018/1/29.
 */
public class VisitBinaryTreeNew {
    //先序遍历，递归
    public static void preOrderDiGui(Node node){
        if(node!=null){
            System.out.print(node);
            preOrderDiGui(node.getLeftChild());
            preOrderDiGui(node.getRightChild());
        }
    }
    //中序遍历，递归
    public static void middleOrderDiGui(Node node){
        if(node!=null){
            middleOrderDiGui(node.getLeftChild());
            System.out.print(node);
            middleOrderDiGui(node.getRightChild());
        }
    }
    //后续遍历，递归
    public static void afterOrderDiGui(Node node){
        if(node!=null){
            afterOrderDiGui(node.getLeftChild());
            afterOrderDiGui(node.getRightChild());
            System.out.print(node);
        }
    }

    //先序遍历，非递归
    public static void preOrder(Node node){
        Stack<Node> s=new Stack<Node>();
        while(node!=null||!s.isEmpty()){
            while(node!=null){
                System.out.print(node);
                s.push(node);
                node=node.getLeftChild();
            }
            node=s.pop();
            node=node.getRightChild();
        }
    }

    //中序遍历，非递归
    public static void middleOrder(Node node){
        Stack<Node> s=new Stack<Node>();
        while (node!=null||!s.isEmpty()){
            while (node!=null){
                s.push(node);
                node=node.getLeftChild();
            }
            node=s.pop();
            System.out.print(node);
            node=node.getRightChild();
        }
    }
    public static void afterOrder(Node node){
        Node prev=new Node('#');
        Stack<Node> s=new Stack<Node>();
        while (node!=null||!s.isEmpty()){
            while (node!=null){
                s.push(node);
                node=node.getLeftChild();
            }
            node=s.peek();
            if(node.getRightChild()==null||node.getRightChild()==prev){
                System.out.print(node);
                s.pop();
                prev=node;
                node=null;//这句很重要，不然又会把这个节点当根节点执行内层while循环的
            }else{
                node=node.getRightChild();
            }
        }
    }
}
