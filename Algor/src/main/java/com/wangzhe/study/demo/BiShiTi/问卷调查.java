package com.wangzhe.study.demo.BiShiTi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class 问卷调查 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            TreeSet<Integer> set=new TreeSet<Integer>();
            int n=sc.nextInt();
            if(n>0){
                for(int i=0;i<n;i++){
                    set.add(sc.nextInt());
                }
            }
            for(Integer i:set){
                System.out.println(i);
            }
        }
    }
}
