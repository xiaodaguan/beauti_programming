package cn.guanxiaoda.lintcode.gettingstart;

/**
 * 37. 反转一个3位整数
 * 反转一个只有3位数的整数。
 * <p>
 * 样例
 * 123 反转之后是 321。
 * 900 反转之后是 9。
 * <p>
 * 注意事项
 * 你可以假设输入一定是一个只有三位数的整数，这个整数大于等于100，小于1000。
 *
 * @author guanxiaoda
 * @date 2018/12/12
 */
public class ReverseNumber {

    public static int reverseInteger(int number) {
        int n1 = number / 100;
        System.out.println(n1);
        int n2 = 10 *( (number / 10) % 10);
        System.out.println(n2);
        int n3 = 100 * (number % 10);
        System.out.println(n3);
        return n1 + n2 + n3;
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(reverseInteger(num));
    }
}
