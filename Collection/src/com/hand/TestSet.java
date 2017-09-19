package com.hand;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by jinliang on 2017/9/19.
 */
public class TestSet {
    public static void main(String[] args) {
        Set books = new HashSet();
        books.add(new String("Struts2权威指南"));
        books.add(new String("Struts2权威指南"));
        //输出的结果只有一个，因为 Set 方法是采用 equals 来比较两个对象是否相同 所以返回true 只能添加一个元素
        System.out.println(books);
    }
}
