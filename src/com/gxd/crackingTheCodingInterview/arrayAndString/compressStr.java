package com.gxd.crackingTheCodingInterview.arrayAndString;

import sun.text.normalizer.UnicodeSet;

/**
 * Created by guanxiaoda on 16/4/27.
 * ѹ���ַ���(aaabbccccdaa -> a3b2c4d1a2)
 * ��ѹ�����ַ���û�б��,�򷵻�ԭ�ַ���
 * todo ���ȼ��
 */
public class CompressStr {


    public static String compressStr(String str) {
        if (str == null || str.equals("")) {
            return str;
        }
        int count = 1;
        char lastChar = str.charAt(0);
        String newStr = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == lastChar) {
                count++;
            } else {
                newStr += lastChar + "" + count;
                lastChar = str.charAt(i);
                count = 1;
            }
        }
        return newStr+lastChar+""+count;
    }

    public static void main(String[] args) {
        System.out.println((int) 'a');

        System.out.println((char) 97);


        System.out.println(compressStr("aaabbbbccdeeffggggggggggaaasjfdlaasajffjkkfkdkdk;;a;flajhdfhjskj"));

    }
}
