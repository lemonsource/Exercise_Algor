package com.wangzhe.study.demo.SwordOffer;

import com.wangzhe.study.demo.Standard.BinaryTreeNode;

public class f39_1TreeDepth {
    public static void main(String []args){
        // 不是完全二叉树，但是平衡二叉树
        //             1
        //         /      \
        //        2        3
        //       /\         \
        //      4  5         6
        //        /
        //       7
        BinaryTreeNode n1 = new BinaryTreeNode(1);
        BinaryTreeNode n2 = new BinaryTreeNode(2);
        BinaryTreeNode n3 = new BinaryTreeNode(3);
        BinaryTreeNode n4 = new BinaryTreeNode(4);
        BinaryTreeNode n5 = new BinaryTreeNode(5);
        BinaryTreeNode n6 = new BinaryTreeNode(6);
        BinaryTreeNode n7 = new BinaryTreeNode(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n5.left = n7;
        n3.right = n6;
        System.out.println(TreeDepth(n1));
//        System.out.println(isBalanced2(n1));
        System.out.println("----------------");
    }

    public static int TreeDepth(BinaryTreeNode head){
        if(head==null)
            return 0;
        int left=TreeDepth(head.left);
        int right=TreeDepth(head.right);
        return left>right?left+1:right+1;
    }
}
