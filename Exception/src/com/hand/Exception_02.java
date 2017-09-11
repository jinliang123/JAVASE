package com.hand;

/**
 * Created by jinliang on 2017/9/11.
 *  异常中的关键字  try catch finally throw throws
 *  throws 用于方法声明可能抛出异常
 *  throw  用于抛出一个具体的异常
 *  异常分为两类：checked异常和Runtime异常
 *
 */
public class Exception_02 {
    public static void div(int x,int y)throws Exception{
        System.out.println(x/y);

    }
    public static void main(String args[]){
        try {
            div(4,0);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("一定会执行的操作");
        }
    }


}
