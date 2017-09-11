package com.hand;

/**
 * Created by jinliang on 2017/9/11.
 * 进行异常信息捕获时，先捕获小异常，再捕获大的异常
 */
public class Exception_03 {
    public static void main(String args[]){
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c=a/b;
            System.out.println("您输入的两个数相除的结果是:"+a/b);

        }catch (IndexOutOfBoundsException id){
            System.out.println("数组越界异常");
        }catch (NumberFormatException ne){
            System.out.println("数字格式化异常");
        }catch (ArithmeticException ae){
            System.out.println("算术异常");
        }catch (Exception e){
            System.out.println("未知异常");
        }finally {
            //回收资源
            //java的垃圾回收机制不会回收任何物理资源，垃圾回收机制只能回收堆内存中对象所占有的内存。
        }

    }
}
