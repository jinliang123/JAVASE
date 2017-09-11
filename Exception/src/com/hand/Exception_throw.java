package com.hand;

/**
 * Created by jinliang on 2017/9/11.
 */
public class Exception_throw {
    public static void main(String args[]){
        throwRuntime(1);

    }

    public static void throwRuntime(int a) {
        if(a>0){
            throw new RuntimeException("a的值大于0，不符合要求");
        }
    }
}
