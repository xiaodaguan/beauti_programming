package cn.guanxiaoda.crackingTheCodingInterview.arrayAndString;

import sun.text.normalizer.UnicodeSet;

/**
 * Created by guanxiaoda on 16/4/19.
 *
 */
public class IsUniqueChars {

    /**
     *
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
        System.out.println(isUniqueChars2("我是一个中国人吗"));

    }
}
