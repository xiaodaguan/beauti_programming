package com.gxd.test;

/**
 * Created by guanxiaoda on 5/17/16.
 */
public class testThread implements Runnable {


    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            testThread tt = new testThread();
            Thread t = new Thread(tt, i + "");
            t.start();
            System.out.println(t.getName() + "start.");

        }
    }

    @Override
    public void run() {

        try {
            Thread.sleep(1000 * 60 * 60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
