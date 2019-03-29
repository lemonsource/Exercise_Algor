package com.wangzhe.study.demo.JavaEE;

public class StringTest {
    public static void main(String []args){
        String s1=new String("aaa");
        String s2=new String("aaa");
        System.out.println(s1=="aaa");
        System.out.println(s1==s2);
        String s3=s2.intern();
        String s4=s2.intern();
        System.out.println(s3==s4);

        //使用字面量的形式创建字符串，会自动存入缓冲池
        String s5="bbb";
        String s6="bbb";
        System.out.println(s5=="bbb");
        System.out.println(s5==s6);
        
        String a="ab";
        String b="a"+"b";
        System.out.println("a=b???"+a==b);

    }
}
