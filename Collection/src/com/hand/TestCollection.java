package com.hand;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by jinliang on 2017/9/19.
 */
public class TestCollection {
    public static void main(String args[]){
        Collection c = new ArrayList();
        c.add("孙悟空");
        c.add(6);
        c.remove(6);
        System.out.println(c.size());
        boolean test = c.contains("孙悟空");
        System.out.println(test);
        c.add("轻量级JavaEE实战");
        System.out.println(c);

        Collection book = new HashSet();
        book.add("轻量级JavaEE实战");
        book.add("Struts2权威指南");
        c.containsAll(book);
        c.removeAll(book);
        System.out.println(c);
    }

}
