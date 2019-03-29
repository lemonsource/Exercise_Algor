package com.wangzhe.study.demo.ConcurrencyProj;

import java.util.concurrent.*;

public class MyCompletionService implements Callable<String> {
    private int id;

    public MyCompletionService(int i){
        this.id=i;
    }
    public static void main(String[] args) throws Exception{
        ExecutorService service=Executors.newCachedThreadPool();
        CompletionService<String> completion=new ExecutorCompletionService<String>(service);
        for(int i=0;i<10;i++){
            //生产者submit执行的任务
            completion.submit(new MyCompletionService(i));
        }
        for(int i=0;i<10;i++){
            //使用者take已经完成的任务
            System.out.println(completion.take().get());
        }
        service.shutdown();
    }

    @Override
    public String call() throws Exception {
        Integer time=(int)(Math.random()*1000);
        try{
            System.out.println(this.id+" start");
            Thread.sleep(time);
            System.out.println(this.id+" end");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return this.id+":"+time;
    }
}
