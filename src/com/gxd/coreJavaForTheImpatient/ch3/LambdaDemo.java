package com.gxd.coreJavaForTheImpatient.ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;

/**
 * Created by guanxiaoda on 6/19/16.
 */
public class LambdaDemo {

    public static void main(String[] args) {

        Thread t = new Thread(
                ()->{
                    for(int i=0;i<3;i++){
                        System.out.println(i);
                    }
                }
        );
        t.start();

        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(3);
        li.add(5);
        li.add(2);
        li.add(7);
        li.add(1);

        System.out.println(li);
        Collections.sort(li,(x,y)->x-y);

        System.out.println(li);
    }
}
