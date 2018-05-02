package cn.guanxiaoda.crackingTheCodingInterview.arrayAndString;

import com.sun.media.jfxmedia.track.Track;
import sun.text.normalizer.UnicodeSet;

import java.nio.charset.Charset;

/**
 * Created by guanxiaoda on 16/4/27.
 *
 * 判断两个字符串是否变位词(通过字符变换位置变成对方)
 */
public class IsAnagram {

    /**
     * new 一个长为字母表大小的数组,每个位置上的数值为字符串中对应字母出现的次数
     * 若两个字符串为变位词,则每个字母出现的次数相同
     * @param str1
     * @param str2
     * @return
     */
    private static boolean isAnagram2(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] counts = new int[UnicodeSet.MAX_VALUE];
        for (int i = 0; i < str1.length(); i++) {
            counts[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            counts[str2.charAt(i)]--;
        }
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) return false;

        }
        return true;
    }

    /**
     * 排序后比较
     * @param str1
     * @param str2
     * @return
     */
    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        if (sort(str1).equals(sort(str2))) return true;
        else return false;

    }


    private static String sort(String str) {
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }


    public static void main(String[] args) {

        System.out.println(sort("jfkdsal"));

        System.out.println(isAnagram2("我是一个个中国 人", "个一中国 人是我个"));
        System.out.println(isAnagram2("我是一个个中国 人", "个一中国 人是我一"));
        System.out.println(isAnagram2("aabbcccddeefg", "efgbbddcccaa"));
    }
}
