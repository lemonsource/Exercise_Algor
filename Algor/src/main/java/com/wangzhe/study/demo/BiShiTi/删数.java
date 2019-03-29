package com.wangzhe.study.demo.BiShiTi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 删数 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
          delete(sc.nextInt());
        }
    }
    public  static void delete(int d){
        Integer n=d;
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        System.out.println(DeleteNums(arr));

    }
    public static int DeleteNums(Integer[] arr){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        int deleteIndex = 0;
        Integer lastnum=list.get(0);
        while(!list.isEmpty()){
            deleteIndex=(deleteIndex+2)%list.size();
            lastnum=list.get(deleteIndex);
            list.remove(deleteIndex);

        }
        return lastnum;
    }

}
