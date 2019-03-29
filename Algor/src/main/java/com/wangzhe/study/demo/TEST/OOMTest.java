package com.wangzhe.study.demo.TEST;

import java.util.ArrayList;
import java.util.List;

public class OOMTest {
    //堆异常
    static class OOMObject{}
    public static void main(String[]args){
        List<OOMObject> list = new ArrayList<>();
        while(true){
            list.add(new OOMObject());
        }
    }
}
