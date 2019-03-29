package com.wangzhe.study.demo.BiShiTi;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class 字符串包含 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            func(s);
        }
    }
    public static void func(String s){
        char[] arr = s.toCharArray();
        StringBuilder res = new StringBuilder();
        TreeSet<Character> set = new TreeSet<>();
        for(int i =0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                res.append(arr[i]);
                set.add(arr[i]);
            }
        }
        System.out.println(res.toString());
    }

}
