package com.wangzhe.study.demo.SwordOffer;

import java.util.Arrays;
import java.util.Scanner;

public class e36_MergeSort {
    public static void main(String[] args){
        Scanner sc;
        sc = new Scanner(System.in);
        int[]a=new int[5];
        System.out.println("Plz input array input:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("the data you just input:"+Arrays.toString(a));
        Mergesort(a,0,a.length-1);
        System.out.println("the data after sort:"+Arrays.toString(a));
    }
    public static void Mergesort(int[] a,int low,int high){
        if(low>=high)
            return;
        int mid=(low+high)/2;
        Mergesort(a,low,mid);
        Mergesort(a,mid+1,high);
        Merge(a,low,mid,high);
    }


    public static void Merge(int[]a,int low,int mid, int high){
        int[] temp=new int[a.length];
        int k=low;
        int i=low;//i从左边数组第一个数开始遍历
        int j=mid+1;//j从右边数组的第一个数开始遍历
        while(i<=mid&&j<=high){
            if(a[i]<=a[j]){
                temp[k++]=a[i++];
            }
            else{
                temp[k++]=a[j++];
            }
        }
        if(i<=mid){
            temp[k++]=a[i++];
        }
        if(j<=high){
            temp[k++]=a[j++];
        }
        while(low<=high){//这个地方为什么不能用k??????????????
            a[low]=temp[low++];
        }
        if(k==high){
            System.out.println("true");
        }
    }
}
