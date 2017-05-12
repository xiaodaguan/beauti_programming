package com.gxd.test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by guanxiaoda on 6/16/16.
 */
public class TestBasicVar {
    public static void swapint(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }

    public static void swapStr(String a, String b) {
        String t = a;
        a = b;
        b = t;
    }

    public static void changeStr(String a) {
        a += "test";
    }

    public static void changeSB(StringBuilder sb) {
        sb.append("test");
    }

    public static void swapArray(int[] a, int[] b){
        int[] t = a;
        a = b;
        b = t;
    }

    public static void changeArray(int[] a){
        a[0]=999;
    }

    public static void main(String[] args) {
        int x = 1, y = 2;
        String m = "aa", n = "bb";
        swapint(x, y);
        swapStr(m, n);
        System.out.printf("%d, %d\n", x, y);
        System.out.printf("%s, %s\n", m, n);
        changeStr(m);
        System.out.println(m);

        StringBuilder sb = new StringBuilder("aaa");
        changeSB(sb);
        System.out.println(sb.toString());


        int[] a ={1,2};
        int[] b={3,4};
        swapArray(a,b);
        System.out.println(a[0]);
        changeArray(a);
        System.out.println(a[0]);

    }
}
