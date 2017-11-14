package com.hand;

import java.util.HashSet;

/**
 * Created by jinliang on 2017/9/27.
 *
 */
class A{
    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

class B{
    @Override
    public int hashCode() {
        return 1;
    }
}

class C{
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 2;
    }
}

public class TestHashSet {
    public static void main(String[] args) {
        HashSet books = new HashSet();
        books.add(new A());
        books.add(new A());
        books.add(new B());
        books.add(new B());
        books.add(new C());
        books.add(new C());
        System.out.println(books);
    }

}
