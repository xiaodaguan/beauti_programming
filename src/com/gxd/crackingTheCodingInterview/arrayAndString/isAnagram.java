package com.gxd.crackingTheCodingInterview.arrayAndString;

import com.sun.media.jfxmedia.track.Track;
import sun.text.normalizer.UnicodeSet;

import java.nio.charset.Charset;

/**
 * Created by guanxiaoda on 16/4/27.
 *
 * �ж������ַ����Ƿ��λ��(ͨ���ַ��任λ�ñ�ɶԷ�)
 */
public class IsAnagram {

    /**
     * new һ����Ϊ��ĸ���С������,ÿ��λ���ϵ���ֵΪ�ַ����ж�Ӧ��ĸ���ֵĴ���
     * �������ַ���Ϊ��λ��,��ÿ����ĸ���ֵĴ�����ͬ
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
     * �����Ƚ�
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

        System.out.println(isAnagram2("����һ�����й� ��", "��һ�й� �����Ҹ�"));
        System.out.println(isAnagram2("����һ�����й� ��", "��һ�й� ������һ"));
        System.out.println(isAnagram2("aabbcccddeefg", "efgbbddcccaa"));
    }
}
