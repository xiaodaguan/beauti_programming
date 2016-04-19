package com.gxd.crackingTheCodingInterview.arrayAndString;

import sun.text.normalizer.UnicodeSet;

/**
 * Created by guanxiaoda on 16/4/19.
 * 相关:
 * 常见字符集&编码:ascii, gb2312, big5, gb18030, unicode
 * ascii: 256个拉丁字母\阿拉伯数字\英文标点
 * gbXXXX: 汉字\数学符号\罗马希腊字母\日文假名\全角字符(gb2312->gbk/gb18030)
 * big5: 繁体中文社区常见
 * <p/>
 * unicode字符集: 统一各个国家地区的字符集(统一码\万国码)
 * utf-8/utf-16/utf-32: 三种编码方案
 * <p/>
 * int类型的范围:
 * c语言只规定int类型至少能表示-32767~32767之间的整数
 * 实际的范围要看平台和编译器
 * 2^32 - 1 = 2147483647
 * - 2^32 = 2147483648
 * 可以用来表示32维的向量,当假定只有26个字母的时候(其实输入汉字也可以,why? '我'-'a'的差值为2万多),可以用一个int类型的数字来表示字母表中每个字符是否出现超过1次
 * 第0个字母->a
 * 第1个字母->b
 * 第n个字母->x-'a'
 * <p/>
 * 按位与: &
 */
public class isUniqueChars {

    /**
     * 建立一个数组,长度为字母表长度,每个位置上的值为该字符在字符串中出现的次数
     * 只要有一个值>1,则字符串不是uniquechars
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
     * 用一个向量(int表示二进制数)表示数组,因为数组每个位置上只需要0或者1就可以
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


//        System.out.println(diffA('我'));
//
//        System.out.println(isUniqueChars2("aaabbbccc"));
//        System.out.println(isUniqueChars2("abcdefg"));
//        System.out.println(isUniqueChars2("abcdeff"));
//        System.out.println(isUniqueChars2("zxcvfjk"));
//        System.out.println(isUniqueChars2("我是一个中国人"));
        System.out.println(isUniqueChars2("我 是一个人人人"));

    }
}
