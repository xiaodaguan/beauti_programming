package cn.guanxiaoda.coreJavaForTheImpatient.ch1;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by guanxiaoda on 6/16/16.
 */
public class Practise {
    public static void inOut() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input number: ");
        int n = 0;
        if (scanner.hasNext()) {
            n = scanner.nextInt();
        }

        System.out.println(Integer.toString(n, 2));
        System.out.println(Integer.toString(n, 8));
        System.out.println(Integer.toString(n, 16));

    }

    public static void angle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input num:");
        int n = 0;
        if (scanner.hasNext()) {
            n = scanner.nextInt();

        }
        System.out.printf("%d¶È\n", n % 360);
        System.out.printf("%s¶È\n", (Math.floorMod(n, 360)));
    }

    public static int getMax(int a, int b, int c) {
        int bigger = a > b ? a : b;
        int max = bigger > c ? bigger : c;
        return max;
    }

    public static int getMax1(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static BigInteger factorial(int n) {
        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(Integer.toString(i)));
        }
        return result;
    }

    public void printSub(String str){

    }

    public static void main(String[] args) throws IOException {
//        inOut();
//        angle();
//        System.out.println(getMax(3, 7, 5));
//        System.out.println(getMax1(3, 7, 5));
//        System.out.println(Math.nextUp(0));
//        System.out.println(Double.MAX_VALUE);

//        int a = (int) Double.MAX_VALUE;
//        System.out.println(a);
//        System.out.println(Integer.MAX_VALUE);

//        System.out.println(factorial(4));
//        System.out.println(factorial(1000));

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.pow(2,15));




    }
}
