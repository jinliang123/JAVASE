package com.hand;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by jinliang on 2017/9/19.
 */
public class TestForeach {
    public static void main(String[] args) {
        Collection books = new HashSet();
        books.add("轻量级JavaEE实战");
        books.add("Struts2权威指南");
        books.add("Java8实战");
        books.add("SpringBoot实战");
        for (Object obj:books) {
            String book = (String)obj;
            if(("Struts2权威指南").equals(book)){
                //如果修改集合中的元素会出现异常  ConcurrentModificationException
                books.remove(book);
            }
        }
        System.out.println(books);
    }
}
