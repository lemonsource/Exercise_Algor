package com.wangzhe.study.demo.SwordOffer;

public class b03_数组中的重复数字 {
    public static void main(String []args){

        int arr[] = {2,3,1,0,2,5,3};
        int res=RepeatNums(arr,-1);
        System.out.println(res);
    }

    public static int RepeatNums(int[] arr, int res){

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                if(arr[arr[i]]==arr[i]){
                    res=arr[i];
                    return res;
                }
                    int temp = arr[i];
                    arr[i]=arr[temp];
                    arr[temp]=temp;

            }
        }
        return res;
    }
}
