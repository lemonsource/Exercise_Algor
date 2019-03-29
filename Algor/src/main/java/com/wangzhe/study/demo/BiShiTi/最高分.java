package com.wangzhe.study.demo.BiShiTi;

import java.util.Scanner;

public class 最高分 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int studentNum =sc.nextInt();
            int operationNums=sc.nextInt();
            //学生成绩grades
            int[] grades = new int[studentNum];
            for(int i=0;i<studentNum;i++){
                grades[i]=sc.nextInt();
            }

                for(int i=0;i<operationNums;i++){
                        String op = sc.next();
                        if(op.equals("Q")){
                            int left=sc.nextInt();
                            int right=sc.nextInt();
                            int temp;
                            if(left>right){
                                temp=left;
                                left=right;
                                right=temp;
                            }
                            System.out.println(getMax(grades,left-1,right));
                        }else if(op.equals("U")){
                            int index=sc.nextInt();
                            int temp=sc.nextInt();
                            grades[index-1]=temp;
                        }

                }
        }
        sc.close();
    }
    public static int getMax(int[] arr,int left,int right){
        int temp=arr[left];
        for(int i=left;i<right;i++){
            if(arr[i]>temp){
                temp=arr[i];
            }
        }
        return temp;
    }
}
