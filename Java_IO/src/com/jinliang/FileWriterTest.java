package com.jinliang;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by jinliang on 2017/11/14.
 */
public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter("poem.txt");
            fw.write("Test\n");
            fw.write("Hello world \n");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fw != null){
                fw.close();
            }
        }

    }
}
