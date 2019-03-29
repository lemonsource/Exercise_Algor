package com.wangzhe.study.demo.SwordOffer;

public class b05_替换空格 {
    public static void main(String []args){
        String res;
        StringBuffer s=new StringBuffer("A  B");
        res=replaceSpace(s);
        System.out.println("结果是"+res);
    }

    public static String replaceSpace(StringBuffer str){
        int p1=str.length()-1;
        for(int i=0;i<p1;i++){
            if(str.charAt(i)==' '){
                str.append("  ");
            }
        }
        int p2=str.length()-1;
        while(p1<p2&&p1>=0){
            char c = str.charAt(p1--);
            if(str.charAt(p1)==' '){
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');
                str.setCharAt(p2--,'%');
            }else{
                str.setCharAt(p2--,c);
            }
        }
        return str.toString();
    }
}
