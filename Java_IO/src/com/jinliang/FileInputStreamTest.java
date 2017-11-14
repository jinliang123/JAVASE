package com.jinliang;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by jinliang on 2017/11/14.
 */
public class FileInputStreamTest {

    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("D:\\Users\\jinliang\\workspace-idea\\JAVASE\\Java_IO\\src\\com\\jinliang\\FileInputStreamTest.java");
        //创建一个长度1024的 竹筒
        byte[] bbuf = new byte[1024];
        //保存实际读取的长度
        int hasRead = 0;
        while ((hasRead=fis.read(bbuf))>0){
            System.out.println(new String(bbuf,0,hasRead));
        }
        //关闭文件输入流
        fis.close();
    }
}
