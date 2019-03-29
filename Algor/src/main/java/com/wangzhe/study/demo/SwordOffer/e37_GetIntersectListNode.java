package com.wangzhe.study.demo.SwordOffer;

import com.wangzhe.study.demo.Standard.ListNode;

public class e37_GetIntersectListNode {
    public static void main(String[] args) {
        // 1->2->3->4->5->6->7->null
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        head1.next.next.next.next.next = new ListNode(6);
        head1.next.next.next.next.next.next = new ListNode(7);

        // 0->9->8->6->7->null
        ListNode head2 = new ListNode(0);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(8);
        head2.next.next.next = head1.next.next.next.next.next; // 8->6
        System.out.println(getIntersectListNode(head1, head2).value);

    }
    public static ListNode getIntersectListNode(ListNode pHead1,ListNode pHead2){
        if(pHead1==null||pHead2==null)
            return null;
        int count1=0;
        ListNode p1=pHead1;
        while(p1!=null){
            p1=p1.next;
            count1++;
        }
        int count2=0;
        ListNode p2=pHead2;
        while(p2!=null){
            p2=p2.next;
            count2++;
        }
        int flag=count2-count1;
        if(flag>0){
            while(flag>0){
                pHead2=pHead2.next;
                flag--;
            }
            while(pHead2!=pHead1){
                pHead1=pHead1.next;
                pHead2=pHead2.next;
            }
            return pHead1;
        }else{
            while (flag<0){
                pHead1=pHead1.next;
                flag++;
            }
            while(pHead2!=pHead1){
                pHead1=pHead1.next;
                pHead2=pHead2.next;
            }
            return pHead1;
        }
    }
}
