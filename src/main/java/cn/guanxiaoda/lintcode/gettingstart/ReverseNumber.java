package cn.guanxiaoda.lintcode.gettingstart;

/**
 * 37. ��תһ��3λ����
 * ��תһ��ֻ��3λ����������
 * <p>
 * ����
 * 123 ��ת֮���� 321��
 * 900 ��ת֮���� 9��
 * <p>
 * ע������
 * ����Լ�������һ����һ��ֻ����λ��������������������ڵ���100��С��1000��
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
