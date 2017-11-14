package com.jinliang;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by jinliang on 2017/11/14.
 */
public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //创建字节输入流
            fis = new FileInputStream("D:\\Users\\jinliang\\workspace-idea\\JAVASE\\Java_IO\\src\\com\\jinliang\\FileOutputStreamTest.java");
            //创建字节输出流
            fos = new FileOutputStream("newFile.txt");
            byte[] bbuf = new byte[1024];
            int hasRead = 0;
            while ((hasRead = fis.read(bbuf))>0){
                fos.write(bbuf,0,hasRead);
            }

        }catch (IOException e){
            e.printStackTrace();

        } finally {
            if(fis != null){
                fis.close();
            }
            if(fos != null){
                fos.close();
            }
        }
    }
}
