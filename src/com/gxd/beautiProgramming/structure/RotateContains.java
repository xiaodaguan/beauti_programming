package com.gxd.beautiProgramming.structure;

/**
 * Created by guanxiaoda on 16/5/9.
 * 一个字符串能被(另一个字符串循环移位)后包含
 *
 * 其他解法:
 * (1)将s1复制成s1s1,判断s1是否包含s2
 * (2)不使用额外空间的条件下使用(1)方法
 */
public class RotateContains {

    /**
     * my answer
     * @param s1
     * @param s2
     * @return
     */
    public static boolean rotateContains1(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() < s2.length()) return false;
        if (s1.equals(s2)) return true;
        if (s2.equals("")) return true;


        int sameLen = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s2.charAt(j) == s1.charAt((j + i) % s1.length())) {
                        sameLen++;
                    } else {
                        sameLen = 0;
                        break;
                    }
                }
            }
        }


        return sameLen == s2.length() ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(rotateContains1("aabcd", "cdaa"));
        System.out.println(rotateContains1("abcd", "cdab"));
        System.out.println(rotateContains1("abcd", ""));
        System.out.println(rotateContains1("abcd", null));
        System.out.println(rotateContains1(null, "efg"));
        System.out.println(rotateContains1("abcdefg", "def"));
        System.out.println(rotateContains1("abcdefg", "defh"));

    }
}
