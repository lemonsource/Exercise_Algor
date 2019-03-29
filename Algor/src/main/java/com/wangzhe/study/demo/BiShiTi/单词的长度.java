package com.wangzhe.study.demo.BiShiTi;

import java.util.Scanner;

public class 单词的长度 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s = sc.nextLine();
            LastWorldLen(s);
        }
    }
    public static void LastWorldLen(String s){
        int i = s.lastIndexOf(" ");
        System.out.println(s.substring(i+1).length());
    }
}
