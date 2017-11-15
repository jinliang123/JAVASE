package com.jinliang;

/**
 * Created by jinliang on 2017/11/15.
 * 继承Thread类创建线程
 */
public class FirstThread extends Thread{

    private int i;
    @Override
    public void run() {
        for (;i<100;i++){
            System.out.println(getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if (i == 20){
                //调用start方法时  jvm 会自动调用run方法
                new FirstThread().start();
                new FirstThread().start();
                //直接调用 线程的run 方法，系统会把线程对象当成普通对象，run方法当成普通方法
                //下面的代码并不会启动两条线程，而是一次执行两个run方法
//                new FirstThread().run();
//                new FirstThread().run();
            }
        }
    }
}
