package com.wangzhe.study.demo.SwordOffer;

import java.util.Arrays;

import static com.wangzhe.study.demo.SwordOffer.MoreThanHalfNum.Partition;

public class e30_GetLeastNums {
    public static void main(String []args){
        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        int k = 5;
        System.out.println("数组arr"+Arrays.toString(arr));
        GetLeastKNums(arr,k);
        System.out.println("之后的数组arr"+Arrays.toString(arr));
    }
    private static void GetLeastKNums(int []arr,int k){
        int start = 0;
        int end = arr.length-1;
        int index=Partition(arr,start,end);
        while(index!=k-1){
            if(index>k-1){
                index=Partition(arr,start,index-1);
            }else {
                index=Partition(arr,index+1,end);
            }
        }
        System.out.println("最小的K个数为：");
        for(int i=0;i<k;i++){
            System.out.println(arr[i]+",");
        }
    }
}
