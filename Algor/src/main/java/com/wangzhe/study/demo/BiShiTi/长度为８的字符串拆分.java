package com.wangzhe.study.demo.BiShiTi;

import java.util.Scanner;

public class 长度为８的字符串拆分 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            Operate(s);
            s=sc.nextLine();
            Operate(s);
        }
    }
    public static void Operate(String s){
        int len=s.length();
        int i=0;
        int j=i+7;
        while(j<len-1){
            System.out.println(s.substring(i,i+7));
            i+=8;
            j+=8;
        }
        int o=7+i-len;
        String res=s.substring(i);
        for(int w=0;w<o;w++){
            res=res+"0";
        }
        System.out.println(res);
    }
}
