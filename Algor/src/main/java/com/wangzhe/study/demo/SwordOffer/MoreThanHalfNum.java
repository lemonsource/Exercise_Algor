package com.wangzhe.study.demo.SwordOffer;

import com.wangzhe.study.demo.Standard.std;

import java.util.Arrays;

public class MoreThanHalfNum {
    public static void main(String []args){
        //System.out.println("hello swordOffer");
        int numbers[] = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        int res=Solution(numbers);
//        int res=Partition(numbers,0,numbers.length-1);
        System.out.println("超过一半的数字为："+ res);
    }

    private static int Solution(int [] array) {
        int start=0;
        int end=array.length-1;
        int length=array.length;
        int mid=length/2;
        int index=Partition(array,start,end);
        while(index!=mid){
            if(index>mid){
                end=index-1;
                index=Partition(array,start,end);
            }else{
                start=index+1;
                index=Partition(array,start,end);
            }
        }
        int res=array[index];
        if(!checkMoreThanHalf(array,res)){
            throw new RuntimeException("not exit");
        }
        return res;
    }
    public static int Partition(int []array,int start,int end){
        int temp = array[start];
        int i=start;
        int j=end;
        while(i<j){
            while(array[j]>=temp&&i<j)
                j--;
            while(array[i]<=temp&&i<j)
                i++;
            if(i<j){
                std.swap(array,i,j);
            }
        }
        array[start]=array[i];
        array[i]=temp;
        return i;
    }
    public static int Partition2(int[] arr, int lo, int hi) {
        if (arr==null || arr.length<=0 || lo<0 || hi>=arr.length){
            throw new RuntimeException("输入有误");
        }
        int flag = lo;
        //以arr[hi]为基准 划分
        for (int i = lo; i < hi; i++) {
            if (arr[i] <= arr[hi]){
                std.swap(arr, i, flag++);
            }
        }
        std.swap(arr, hi, flag);
        return flag;
    }
    private static boolean checkMoreThanHalf(int[] arr, int num) {
        int times = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (num == arr[i]){
                times++;
            }
        }
        if (times * 2 <= length){
            return false;
        }
        return true;
    }
}
