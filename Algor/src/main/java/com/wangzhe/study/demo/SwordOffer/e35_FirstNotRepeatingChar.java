package com.wangzhe.study.demo.SwordOffer;

import java.util.HashMap;
import java.util.Map;

public class e35_FirstNotRepeatingChar {
    public static void main(String []args){
        System.out.println(FirstNotRepeatingChar("google"));
    }
    public static char FirstNotRepeatingChar(String str){
        if(str==null||str.length()<0){
            throw new IllegalArgumentException("Args should not be empty or null");
        }
        int value;
        char []chars = str.toCharArray();
        Map<Character,Integer > map = new HashMap<Character, Integer>();
        for(int i=0;i<chars.length;i++){
            if(map.get(chars[i])==null){
                map.put(chars[i],i);
            }else{
                value=map.get(chars[i]);
                value++;
                map.put(chars[i],value);
            }
        }
        for(int i=0;i<chars.length;i++){
            if(map.get(chars[i])==1)
                return chars[i];
        }
        return '\0';
    }
}
