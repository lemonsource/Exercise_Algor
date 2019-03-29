package com.wangzhe.study.demo.Concurrency;

public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        for(int i=0;i<3;i++){
            new Thread(new LiftOff()).start();//显式的创建线程
        }
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.exit(0);
        }

        System.out.println("Waiting for LiftOff");
    }
}
