package com.wangzhe.study.demo.CodingInterviewGuide;

import java.util.Scanner;

public class E字符串转换成整数值 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            boolean res=getResult(sc.next());
            System.out.println(res);
        }

    }
    public static boolean getResult(String s){
        char[] charArr = s.toCharArray();
        if(charArr[0]!='-'&&charArr[0]<'1'||charArr[0]>'9')
            return false;
        if(charArr[0]=='-'&&(charArr.length==1||charArr[1]==0))
            return false;
        if(charArr[0]=='0'&&charArr.length>1)
            return false;
        for(int i=1;i<charArr.length;i++){
            if(charArr[i]<'0'||charArr[i]>'9')
                return false;
        }
        return true;
    }
}
