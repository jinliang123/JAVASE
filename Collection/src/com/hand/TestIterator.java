package com.hand;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by jinliang on 2017/9/19.
 */
public class TestIterator {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("轻量级JavaEE实战");
        books.add("Struts2权威指南");
        books.add("Java8实战");
        books.add("SpringBoot实战");

        Iterator it = books.iterator();
        while (it.hasNext()){
            String book =(String) it.next();
            if(book.equals("轻量级JavaEE实战")){
                it.remove();
            }
            book="测试字符串";
        }

        System.out.println(books);


    }
}
