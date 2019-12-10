package com.zeroten.flow;

import org.testng.annotations.Test;

import java.util.Arrays;

public class Practice {
    @Test
    public  void Test(){
        /*
        * 吸血鬼数字
        * 1260 = 21 * 60 　1827 = 21 * 87 　2187 = 27 * 81
        * */
        test1();
        /*
        * 回文数
        * */
        System.out.println("**********************************************************");
        test2();
    }
    public  void test1(){
        for (int i=10;i<100;i++) {
            for (int j = i + 1; j < 100; j++) {
                int target = i * j;
                if (target < 1000 || target > 9999) {
                    continue;
                }
                int[] targetNum = {target / 1000, target / 100 % 10, target / 10 % 100 % 10, target % 10};
                int[] strNum = {i % 10, i / 10, j % 10, j / 10};
                Arrays.sort(targetNum);
                Arrays.sort(strNum);
                if (Arrays.equals(targetNum, strNum)) {
                    System.out.println("吸血鬼数有："+target + " = " + i + " * " + j);
                }
            }
        }
    }
    public  void test2(){
        int count=0;
        for(int i=101;i<=999;i++) {
            int g= i % 10;
            int s= i / 10 % 10;
            int q= i / 100;
            if(g==q)
           {
               count++;
               System.out.println("回文数有："+i);
           }

       }
        System.out.println("1000以内的回文数共有："+count);
    }
}
