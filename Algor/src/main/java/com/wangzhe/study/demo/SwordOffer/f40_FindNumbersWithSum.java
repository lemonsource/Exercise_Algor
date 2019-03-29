package com.wangzhe.study.demo.SwordOffer;

import java.security.PublicKey;
import java.util.Arrays;

public class f40_FindNumbersWithSum {
    public static void main(String[] args) {
        int[] data1 = {1, 2, 4, 7, 11, 15};
        System.out.println(findNumbersWithSum(data1, 15));
        int[] data2 = {1, 2, 4, 7, 11, 16};
        System.out.println(findNumbersWithSum(data2, 17));
        //int[] data3 = {1, 2, 4, 7, 11, 16};
        //System.out.println(findNumbersWithSum(data3, 10));
    }

    public static String findNumbersWithSum(int []arr,int s){
        int [] res=new int[2];
        int p1=0;
        int p2=arr.length-1;
        while(arr[p1]+arr[p2]!=s){
            if(arr[p1]+arr[p2]>s){
                p2--;
            }else {
                p1++;
            }
        }
        res[0]=arr[p1];
        res[1]=arr[p2];

        return Arrays.toString(res);
    }
}
