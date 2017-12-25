package com.jinliang;

import java.util.Random;

public class MyRunnable implements Runnable {

    private String flag;

    public MyRunnable(String flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "线程执行了。。。。");
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(random.nextInt(10)*100);
                System.out.println(threadName+"...."+flag);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable("a"));
        Thread thread2 = new Thread(new MyRunnable("b"));
        thread1.start();
        thread2.start();

    }
}
