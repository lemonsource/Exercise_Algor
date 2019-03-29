package com.wangzhe.study.demo.SwordOffer;

public class e31_FindGreatestSumOfSubArray {
    public static void main(String []args){
        int[] data = {1, -2, 3, 10, -4, 7, 2, -5};
        int[] data2 = {-2, -8, -1, -5, -9};
        int[] data3 = {2, 8, 1, 5, 9};
        System.out.println(FindGreatestSum(data));
        System.out.println(FindGreatestSum(data2));
        System.out.println(FindGreatestSum(data3));
        System.out.println("动态规划的方式");
        System.out.println(FindGreatestSumOfSubArray(data));
        System.out.println(FindGreatestSumOfSubArray(data2));
        System.out.println(FindGreatestSumOfSubArray(data3));
    }
    public static int FindGreatestSum(int []arr){
        if(arr==null||arr.length<0)
            return 0;
        int cur=arr[0];
        int res=cur;
        for(int i=1;i<arr.length;i++){
            cur+=arr[i];
            res=Math.max(res,cur);
            cur=cur>0?cur:0;
        }
        return res;
    }

    //动态规划
    public static int FindGreatestSumOfSubArray(int []arr){
        if(arr.length<0)
            return 0;
        int tempSum=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            tempSum=tempSum<0?arr[i]:tempSum+arr[i];
            res=tempSum>res?tempSum:res;
        }
        return res;
    }
}
