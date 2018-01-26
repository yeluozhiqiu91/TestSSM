package se.Tree;

import java.util.Stack;

/**
 * Created by wang on 2018/1/25.
 */
public class VisitBinaryTree {
    //先根遍历,根左右，递归
    public static void preOrderDiGui(Node node){
        if(node!=null){
            System.out.print(node.toString());
            preOrderDiGui(node.getLeftChild());
            preOrderDiGui(node.getRightChild());
        }
    }

    //中序遍历，左根右，递归
    public static void middleDiGui(Node node){
        if(node!=null){
            middleDiGui(node.getLeftChild());
            System.out.print(node);
            middleDiGui(node.getRightChild());
        }
    }

    //后序遍历，左右根，递归
    public static void afterDiGui(Node node){
        if(node!=null){
            afterDiGui(node.getLeftChild());
            afterDiGui(node.getRightChild());
            System.out.print(node);
        }
    }

    //先根遍历,根左右，非递归
    public static void preOrder(Node node){
        if(node==null){
            return;
        }
        Stack<Node> s=new Stack<Node>();
        while (node!=null||!s.isEmpty()){//外层循环主要是对栈的处理，先弹栈顶元素，将指针移到栈顶元素的右子节点，再将此右子节点同样进行内层while的处理
            while(node!=null){                  //主要是先访问根，将根压入栈，指针移到左子节点，如此循环，最终的结果是，栈里面存的是从下到上，依次是根、根左子节点、下级左子节点。。。
                System.out.print(node.toString());
                s.push(node);
                node=node.getLeftChild();
            }
            node=s.pop();
            node=node.getRightChild();
        }
    }

    //尝试写中序遍历，左根右，非递归
    public static void middle(Node node){
        if(node==null){
            return;
        }
        Stack<Node> s=new Stack<Node>();
        while (node!=null||!s.isEmpty()){
            while (node!=null){//从根开始，将它的左子节点压入栈，压到最后，最左的左子节点肯定就在栈顶了
                s.push(node);
                node=node.getLeftChild();
            }
            node=s.pop();
            System.out.print(node);
            node=node.getRightChild();
        }
    }

    //后续遍历，左右根，非递归
    public static void after(Node node){
        if(node==null){
            return;
        }
        Node prev=node;//记录根节点
        Stack<Node> s=new Stack<Node>();
        while (node!=null||!s.isEmpty()){
            while (node!=null){//从根开始，将它的左子节点压入栈，压倒最后，最左的左子节点肯定也在栈顶了
                s.push(node);
                //System.out.println("压入元素："+node);
                node=node.getLeftChild();
            }
            Node temp=s.peek().getRightChild();         //得到栈顶元素的右子节点
            if(temp==null||temp==prev){                 //如果右子节点为空或者为记录的根节点  ，弹出栈顶元素并打印，根元素记为刚弹出的元素，否则把右子节点当做根，重复while内层循环
                node=s.pop();
                //System.out.println("弹出元素："+node);
                System.out.print(node);
                prev=node;
                node=null;
            }else{
                node=temp;
            }
        }
    }
}
