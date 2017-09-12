package com.hand;

/**
 * Created by jinliang on 2017/9/12.
 */
public class ThreadException_Test implements Runnable{
    @Override
    public void run() {
        firstMethod();
    }
    public void firstMethod(){
        secondMethod();
    }

    private void secondMethod() {
        int a=5;
        int b=0;
        int c=a/b;
    }
    public static void main(String args[]){
        new Thread(new ThreadException_Test()).run();
    }

}
