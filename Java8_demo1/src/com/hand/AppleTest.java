package com.hand;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinliang on 2017/9/17.
 */
public class AppleTest {

    //挑选出所有颜色为绿色的苹果
    public static List<Apple> fileterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if("green".equals(apple.getColor())){
                result.add(apple);
            }

        }
        return result;
    }

    //挑选出所有重量大于150的苹果
    public static List<Apple> fileterHeavyApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if (apple.getWeight()>150){
                result.add(apple);
            }
        }
        return result;
    }


}
