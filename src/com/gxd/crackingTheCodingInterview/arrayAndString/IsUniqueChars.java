package com.gxd.crackingTheCodingInterview.arrayAndString;

import sun.text.normalizer.UnicodeSet;

/**
 * Created by guanxiaoda on 16/4/19.
 * �ַ�������ĸ�Ƿ�ֻ����һ��(�Ƿ�����ظ����ֵ��ַ�)
 * ���:
 * �����ַ���&����:ascii, gb2312, big5, gb18030, unicode
 * ascii: 256��������ĸ\����������\Ӣ�ı��
 * gbXXXX: ����\��ѧ����\����ϣ����ĸ\���ļ���\ȫ���ַ�(gb2312->gbk/gb18030)
 * big5: ����������������
 * <p/>
 * unicode�ַ���: ͳһ�������ҵ������ַ���(ͳһ��\�����)
 * utf-8/utf-16/utf-32: ���ֱ��뷽��
 * <p/>
 * int���͵ķ�Χ:
 * c����ֻ�涨int���������ܱ�ʾ-32767~32767֮�������
 * ʵ�ʵķ�ΧҪ��ƽ̨�ͱ�����
 * 2^32 - 1 = 2147483647
 * - 2^32 = 2147483648
 * ����������ʾ32ά������,���ٶ�ֻ��26����ĸ��ʱ��(��ʵ���뺺��Ҳ����,why? '��'-'a'�Ĳ�ֵΪ2���),������һ��int���͵���������ʾ��ĸ����ÿ���ַ��Ƿ���ֳ���1��
 * ��0����ĸ->a
 * ��1����ĸ->b
 * ��n����ĸ->x-'a'
 * <p/>
 * ��λ��: &
 */
public class IsUniqueChars {

    /**
     * ����һ������,����Ϊ��ĸ����,ÿ��λ���ϵ�ֵΪ���ַ����ַ����г��ֵĴ���
     * ֻҪ��һ��ֵ>1,���ַ�������uniquechars
     */
    public static boolean isUniqueChars1(String str) {
        if (str == null) return true;
        if (str.length() > UnicodeSet.MAX_VALUE) return false;
        int[] alphabet = new int[UnicodeSet.MAX_VALUE];
        for (int i = 0; i < str.toCharArray().length; i++) {
            if (alphabet[str.toCharArray()[i]] > 0) return false;

            alphabet[str.toCharArray()[i]]++;
        }

        return true;
    }

    /**
     * ��һ������(int��ʾ��������)��ʾ����,��Ϊ����ÿ��λ����ֻ��Ҫ0����1�Ϳ���
     *
     * @param str
     * @return
     */
    public static boolean isUniqueChars2(String str) {
        if (str == null) return true;
        if (str.length() > UnicodeSet.MAX_VALUE) return false;
        int vector = 0;
        for (int i = 0; i < str.length(); i++) {
            int diff = str.charAt(i);
            if (vector >> diff == 1) return false;

            vector |= 1 << diff;
        }


        return true;
    }

    public static int diffA(char c) {
        return c - 'a';
    }

    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);


//        System.out.println(diffA('c'));
//
//        System.out.println(1>>2);
//        System.out.println(1<<2);

//        int x = 3;
//        x |= 3 << 1;
//        System.out.println(x);
//        System.out.println(x);

//        System.out.println(5&2);


//        System.out.println(diffA('��'));
//
//        System.out.println(isUniqueChars2("aaabbbccc"));
//        System.out.println(isUniqueChars2("abcdefg"));
//        System.out.println(isUniqueChars2("abcdeff"));
//        System.out.println(isUniqueChars2("zxcvfjk"));
//        System.out.println(isUniqueChars2("����һ���й���"));
        System.out.println(isUniqueChars2("�� ��һ��������"));

    }
}
