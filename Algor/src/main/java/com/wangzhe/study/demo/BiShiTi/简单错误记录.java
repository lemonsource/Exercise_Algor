package com.wangzhe.study.demo.BiShiTi;

import java.util.*;


public class 简单错误记录 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        HashMap<String,Integer> map = new HashMap<>();
        Map<String,Integer> map = new LinkedHashMap<>();
        String filename;
        String key;
        while(sc.hasNext()) {


                String s1 = sc.next();
                int id = s1.lastIndexOf('\\');
                filename = id < 0 ? s1 : s1.substring(id + 1);

                int row = sc.nextInt();
                key = filename + " " + row;

                if (map.containsKey(key)) {
                    map.put(key, map.get(key) + 1);
                } else {
                    map.put(key, 1);
                }
                func(map);

        }
        sc.close();







    }
    public static void func(Map<String,Integer> map){
        //对记录进行排序
        List<Map.Entry<String,Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return(o2.getValue()-o1.getValue()==0?(o1.getValue()-o2.getValue()):o2.getValue()-o1.getValue());
            }
        });

        int m=0;
        for(Map.Entry<String,Integer> entry:list) {
            m++;
            if (m<= 8) {
                String[] record = entry.getKey().split(" ");
                String k = record[0].length() > 16 ? record[0].substring(record[0].length() - 16) : record[0];
                System.out.println(k + " " + record[1] +" "+entry.getValue());
            }
        }
    }
}
