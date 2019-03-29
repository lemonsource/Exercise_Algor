package com.wangzhe.study.demo.SwordOffer;

public class e34_GetUglyNumber {
    public static void main(String []args){
        System.out.println("最大的丑数"+GetUglyNumber(1500));
    }
    public static int GetUglyNumber(int n){
        if(n<=0)
            return 0;
        int []UglyNumbers=new int[n];
        UglyNumbers[0]=1;
        int nextIndex=1;
        int p2=0;
        int p3=0;
        int p5=0;

        while(nextIndex<n){
            int min=min(UglyNumbers[p2]*2,UglyNumbers[p3]*3,UglyNumbers[p5]*5);
            UglyNumbers[nextIndex]=min;
            while(UglyNumbers[p2]*2<=UglyNumbers[nextIndex]){
                p2++;
            }
            while(UglyNumbers[p3]*3<=UglyNumbers[nextIndex]){
                p3++;
            }
            while(UglyNumbers[p5]*5<=UglyNumbers[nextIndex]){
                p5++;
            }
            nextIndex++;
        }
        return UglyNumbers[--nextIndex];
    }
    private static int min(int a, int b, int c) {
        int min = a<b? a: b;
        return c<min? c: min;
    }
}
