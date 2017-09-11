package com.hand;

/**
 * Created by jinliang on 2017/9/11.
 */
public class MyException_Test {
    private double initPrice = 30.0;
    public void bid(String bidPrice) throws MyException{
        double d =0.0;
        try {
            d=Double.parseDouble(bidPrice);

        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("竞拍价必须是数值，不能包含其他字符");
        }
        if(initPrice>d){
            throw new MyException("竞拍价比起拍价低，不允许竞拍");
        }
        initPrice= d;
    }

    public static void main(String args[]){
        MyException_Test myException = new MyException_Test();
        try {
            myException.bid("df");

        }catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

}
