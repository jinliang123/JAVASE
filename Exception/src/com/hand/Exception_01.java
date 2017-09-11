package com.hand;

/**
 * Created by jinliang on 2017/9/11.
 * Throwable类下 Error Exception
 */
class ExceptionEntity{

    public void div(int x,int y){
        try {
            System.out.print(x/y);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("一定会执行的操作");
        }

    }

}

public class Exception_01 {
    public static void main(String args[]){
        ExceptionEntity entity = new ExceptionEntity();
        entity.div(4,0);

    }
}
