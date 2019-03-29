package com.wangzhe.study.demo.SwordOffer;

import java.util.Stack;

public class b06_从尾到头打印链表 {
    public static void main(String []args){
        Node headNode=new Node("头节点");
        Node node1=new Node("A");
        Node node2=new Node("B");
        Node node3=new Node("C");
        Node node4=new Node("D");
        Node node5=new Node("E");
        headNode.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        Node newNode=printListFromTailToHeadwithStack(headNode);
        while(newNode!=null){
            System.out.print(newNode.data+" ");
            newNode=newNode.getNext();
        }
    }
    //头插法建立链表
    public static Node printListFromTailToHead(Node node){
        Node head = new Node("HeadNode");
        Node p;
        Node q=node.next;
        while(q!=null){
            p=q.next;
            q.next=head.next;
            head.next=q;
            q=p;
        }
        return head;

    }
    //使用栈
    public static Node printListFromTailToHeadwithStack(Node node){
        Node head = new Node("HeadNode");
        Stack<Node> stack = new Stack<>();
        Node p =node.next;
        while(p!=null){
            stack.add(p);
            p=p.next;
        }
        while(!stack.isEmpty()){
            head.next=stack.pop();
        }
        return head;
    }
}
class Node{
    String data;
    Node next;
    public Node(String data) {
        super();
        this.data = data;
    }
    public Node(String data, Node next) {
        super();
        this.data = data;
        this.next = next;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }


}
