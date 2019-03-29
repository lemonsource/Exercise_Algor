package com.wangzhe.study.demo.BiShiTi;

import java.util.Scanner;

public class 浮点数的近似值 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            double input=sc.nextDouble();
            int res=getResult(input);
            System.out.println(res);
        }sc.close();
    }
    public static int getResult(double input){
        int i = (int)input;
        return (input-i)>=0.5?i+1:i;
    }
}
