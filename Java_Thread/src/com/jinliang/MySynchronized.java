package com.jinliang;

/**
 * synchronizde 关键字总结
 * 1.程序使用同一把锁，则需要等待上一个程序释放锁，需要一直等待，如果抛出异常，JVM自动释放锁
 * 2.如果使用不同的锁，线程之间不影响
 */
public class MySynchronized {
    public static void main(String[] args) {
        MySynchronized mySynchronized = new MySynchronized();
        MySynchronized mySynchronized1 = new MySynchronized();

        new Thread("Thread1"){
            @Override
            public void run() {
                synchronized (mySynchronized){
                    try {
                        System.out.println(this.getName()+"..."+" start");
//                        int i = 1/0;
                        Thread.sleep(5000);
                        System.out.println(this.getName()+"..."+"醒了");
                        System.out.println(this.getName()+"..."+"end");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread("Thread2"){
            @Override
            public void run() {
                synchronized (mySynchronized1){
                    System.out.println(this.getName()+"..."+" start");
                    System.out.println(this.getName()+"..."+"end");
                }
            }
        }.start();
    }


}
