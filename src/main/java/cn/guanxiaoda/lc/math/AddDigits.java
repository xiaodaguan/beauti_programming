package cn.guanxiaoda.lc.math;

/**
 * Created by guanxiaoda on 15/11/24.
 */
public class AddDigits {
    public static int addDigits(int num) {
        while(num>=10){
            num=num/10+num%10;
        }
        return num;
    }


    public static void main(String[] args) {
        System.out.println(addDigits(7904));
    }
}
