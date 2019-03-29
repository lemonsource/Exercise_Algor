package com.wangzhe.study.demo.BiShiTi;

import java.util.Scanner;

public class toHex {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.next();
            toHex(s);
        }


//        System.out.println(toHex(s));
    }
    public static void toHex(String s){
        Integer i=Integer.parseInt(s.substring(2),16);
        //return i.toString();
        System.out.println(i.toString());
    }
}
