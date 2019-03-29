package com.wangzhe.study.demo.CodingInterviewGuide;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E判断变形词 {
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
        if(s1==null||s2==null||s1.length()!=s2.length())
            return false;
        Map<Character,Integer> map = new HashMap<>();
        char[] s1CharArr = s1.toCharArray();
        char[] s2CharArr = s2.toCharArray();
        for(int i=0;i<s1CharArr.length;i++){
            if(map.containsKey(s1CharArr[i])){
               // map.get(s1CharArr[i]);
                int j=map.get(s1CharArr[i]);
                j++;
                map.put(s1CharArr[i],j);
            }else{
                map.put(s1CharArr[i],1);
            }
        }
        for(int i=0;i<s2CharArr.length;i++){
            if(map.containsKey(s2CharArr[i])){
                int j=map.get(s2CharArr[i]);
                if(--j<0)
                    return false;
                map.put(s1CharArr[i],j);

            }else{
                return false;
            }
        }
        return true;

    }
}
