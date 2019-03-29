package com.wangzhe.study.demo.CodingInterviewGuide;

import java.util.Scanner;

public class E判断旋转词 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1=sc.next();
            String s2=sc.next();
            boolean res=getResult(s1,s2);
            System.out.println(res);
        }
    }
    public static boolean getResult(String s1,String s2){
        if(s1==null||s2==null||s1.length()!=s2.length()){
            return false;
        }
        String b=s2+s2;
        if(b.contains(s1)){
            return true;
        }else {
            return false;
        }
    }
}
