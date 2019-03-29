package com.wangzhe.study.demo.SwordOffer;

public class e32_numberOf1Between1AndN {
    public static void main(String []args){
        int a=12;
        System.out.println(GetNumOf1Between1AndN(a));

    }
    public static int GetNumOf1Between1AndN(int n){
        int count=0;
        while(n>0){
            String str=String.valueOf(n);
            char [] arr=str.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='1')
                    count++;
            }
            n--;
        }
        return count;
    }

}
