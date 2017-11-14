package com.jinliang;

import java.io.File;
import java.io.IOException;

/**
 * Created by jinliang on 2017/11/14.
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File(".");
        //获取文件名
        System.out.println(file.getName());
        //获取相对路径的父路径 输出 null
        System.out.println(file.getParent());
        //获取绝对路径
        System.out.println(file.getAbsoluteFile());
        //获取绝对路径上一层路径
        System.out.println(file.getAbsoluteFile().getParent());
        //在当前目录下创建临时文件
        File tempFile = File.createTempFile("aaa",".txt",file);
        //JVM退出时删除文件
        tempFile.deleteOnExit();
        //以系统当前时间作为新文件名来创建新文件
        File newFile = new File(System.currentTimeMillis()+"");
        System.out.println("newFile对象是否存在 "+newFile.exists());
        newFile.createNewFile();
        newFile.mkdir();
        String[] fileList = file.list();
        System.out.println("==========当前路径下所有的文件和路径========");
        for (String fileName : fileList){
            System.out.println(fileName);
        }
        File[] roots = File.listRoots();
        System.out.println("=====系统所有根路径如下========");
        for (File root : roots){
            System.out.println(root);
        }
    }
}
