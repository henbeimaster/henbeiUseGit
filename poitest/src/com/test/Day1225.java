package com.test;

import java.lang.reflect.Array;

/**
 * @Author:lipc
 * @Date:2018/12/25 10:32
 */
public class Day1225 {
    public static void main(String[] args) {

        String abc = "[0-9]*";
        String asd = "054154";
        System.out.println(asd.matches(abc));

        String aaa = "^[\\-a-zA-Z0-9\\_\\u4e00-\\u9fa5]+$";
        String qwe = "sdhfAs---gdagags阿斯顿发245215_";
        System.out.println(qwe.matches(aaa));




    }
}
