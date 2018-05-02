package cn.guanxiaoda.test;

import java.time.LocalDate;
import java.util.Calendar;

/**
 * Created by guanxiaoda on 6/16/16.
 */
public class TestDate {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        LocalDate date = LocalDate.of(2016,6,16);
        System.out.println(date);
        date.plusDays(1);
        System.out.println(date);
        System.out.println(date.plusDays(1));
        System.out.println(date.plusMonths(1));
    }
}
