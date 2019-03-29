package com.wangzhe.study.demo.SwordOffer;

public class b04_二维数组中的查找 {
    public static void main(String []args){
        boolean res;
        int matrix[][] = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
        {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}
};
        res=find(matrix,8);
        System.out.println("结果是"+res);
    }
    public static boolean find(int [][]matrix,int target){
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return false;
        int rows=matrix.length;
        int cols=matrix[0].length;
        //从右上角开始
        int r=0;
        int c=cols-1;
        while(c>=0&&r<rows){
            if(matrix[r][c]==target){
                return true;
            }else if(matrix[r][c]>target){
                c--;
            }else{
                r++;
            }

        }
        return false;
    }
}
