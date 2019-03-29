package com.wangzhe.study.demo.BiShiTi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HeQiShui {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int temp;
        while(sc.hasNext()){
            temp=sc.nextInt();
            if(temp!=0){
                list.add(temp);
            }else{
                break;
            }

        }
        Integer[] arr=list.toArray(new Integer[list.size()]);
        int []res=QishuiPing(arr);
//        for(int i=0;i<res.length;i++){
//            System.out.println(res[i]);
//        }
    }

    public static int[] QishuiPing(Integer []arr){
        int len = arr.length;
        int []res=new int[10];
        for(int i=0;i<len;i++){
            //res[i]=HeQiShui(arr[i]);
            System.out.println(HeQiShui(arr[i]));
        }
        return res;
    }

    public static int HeQiShui(int n){

        if(n<2){
            return 0;
        }else{
            int p=n/3;
            int k=p;
            int q=n%3;
            if(q==2){
                //借一瓶
                p++;
                //三瓶喝完多了三个空瓶子
                //k+=3;
            }else{
                //否则为ｋ个空瓶子现在
                k+=q;
            }
            return p+HeQiShui(k);
        }
    }
}
