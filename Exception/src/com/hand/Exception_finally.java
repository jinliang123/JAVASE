package com.hand;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by jinliang on 2017/9/11.
 */
public class Exception_finally {
    public static void main(String args[]){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");

        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
            //return 强制返回 会继续执行finally
            return ;
            //exit 退出虚拟机 不会执行finally
            //System.exit(1);
        }finally {
            //关闭磁盘文件
            if(fis !=null){
                try {
                    fis.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
            System.out.println("finally已经执行，回收资源");
        }
    }

}
