package com.jinliang;

/**
 * Created by jinliang on 2017/11/15.
 * 实现Runnable接口创建线程
 */
public class SecondThread implements Runnable {
    private int i;
    @Override
    public void run() {
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName()+ " "+i);
        }

    }
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if( i == 20){
                SecondThread sc = new SecondThread();
                new Thread(sc,"Thread-0").start();
                new Thread(sc,"Thread-1").start();
            }
        }
    }
}
