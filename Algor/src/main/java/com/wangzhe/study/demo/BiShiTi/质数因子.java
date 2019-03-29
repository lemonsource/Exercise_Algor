package com.wangzhe.study.demo.BiShiTi;

import java.util.Scanner;

public class 质数因子 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        while(sc.hasNextLong()){
            long input = sc.nextLong();
            if(input<2){
                sc.close();
                return;
            }
            String res=getResult(input);
            System.out.println(res);
        }
        sc.close();
    }
    public static String getResult(long input){
        StringBuilder sb = new StringBuilder();
        while(input!=1){
            for(int i=2;i<=input;i++){
                if(input%i==0){
                    sb.append(i);
                    sb.append(" ");
                    input/=i;
                    break;
                }
            }
        }
        return sb.toString();
    }
}
