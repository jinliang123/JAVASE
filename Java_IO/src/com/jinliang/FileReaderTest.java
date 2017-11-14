package com.jinliang;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by jinliang on 2017/11/14.
 */
public class FileReaderTest {
    public static void main(String[] args) throws IOException{
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\Users\\jinliang\\workspace-idea\\JAVASE\\Java_IO\\src\\com\\jinliang\\FileReaderTest.java");
            char[] cbuf = new char[32];
            int hasRead = 0;
            while ((hasRead = fr.read(cbuf))>0){
                System.out.println(new String(cbuf,0,hasRead));

            }
        } catch (IOException e){
            e.printStackTrace();

        }finally {
            if(fr!=null){
                fr.close();
            }
        }




    }
}
