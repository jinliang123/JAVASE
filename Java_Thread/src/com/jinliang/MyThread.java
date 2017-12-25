package com.jinliang;

import java.util.Random;

public class MyThread extends Thread {
    private String flag;

    public MyThread(String flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "线程的run方法被调用了。。。");
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(random.nextInt(10) * 100);
                System.out.println(threadName +"...."+flag);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread("a");
        Thread thread2 = new MyThread("b");
        thread1.start();
        thread2.start();

        /**
         * 如果是调用thread的run方法，则只是一个普通的方法调用，不会开启新的线程
         */
//        thread1.run();
//        thread2.run();
    }
}
