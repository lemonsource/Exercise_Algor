package com.wangzhe.study.demo.SwordOffer;

import java.util.Arrays;

import static com.wangzhe.study.demo.SwordOffer.e36_MergeSort.Mergesort;

public class f44_IsContinuous {
    public static void main(String[] args) {
        int[] numbers1 = {1, 3, 2, 5, 4};
        System.out.println(isContinuous(numbers1));
        int[] numbers2 = {1, 3, 2, 6, 4};
        System.out.println(isContinuous(numbers2));
        int[] numbers3 = {0, 3, 2, 6, 4};
        System.out.println(isContinuous(numbers3));
        int[] numbers4 = {0, 3, 1, 6, 4};
        System.out.println(isContinuous(numbers4));
        int[] numbers5 = {1, 3, 0, 5, 0};
        System.out.println(isContinuous(numbers5));
        int[] numbers6 = {1, 3, 0, 7, 0};
        System.out.println(isContinuous(numbers6));
        int[] numbers7 = {1, 0, 0, 5, 0};
        System.out.println(isContinuous(numbers7));
        int[] numbers8 = {1, 0, 0, 7, 0};
        System.out.println(isContinuous(numbers8));
        int[] numbers9 = {3, 0, 0, 0, 0};
        System.out.println(isContinuous(numbers9));
        int[] numbers10 = {0, 0, 0, 0, 0};
        System.out.println(isContinuous(numbers10));
        int[] numbers11 = {1, 0, 0, 1, 0};
        System.out.println(isContinuous(numbers11));
    }
    public static boolean isContinuous(int []arr){
        if(arr==null||arr.length<=0)
            return false;
        //Mergesort(arr,0,arr.length-1);
        Arrays.sort(arr);
        int cntZero=0;
        int cntGap=0;
        int len=arr.length;
        for(int i=0;i<len&&arr[i]==0;i++){
            cntZero++;
        }
        int p1 = cntZero;   //指向第一个不为0的数
        int p2 = p1+1;
        while (p2 < len){
            if (arr[p1] == arr[p2]){    //不好，有对子
                return false;
            }
            cntGap += arr[p2]-arr[p1]-1;
            p1++;
            p2++;
        }
        return cntGap<=cntZero ? true : false;
    }
}
