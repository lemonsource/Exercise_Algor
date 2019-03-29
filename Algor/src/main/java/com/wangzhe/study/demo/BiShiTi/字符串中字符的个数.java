package com.wangzhe.study.demo.BiShiTi;

import java.util.Scanner;

public class 字符串中字符的个数 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] charArr;
        int count=0;
        while(sc.hasNext()){
            String s= sc.next().toUpperCase();
            charArr= s.toCharArray();
            char c =sc.next().toUpperCase().charAt(0);
            for(int i=0;i<charArr.length;i++){
                if(charArr[i]==c)
                    count++;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
