package com.gxd.crackingTheCodingInterview.arrayAndString;

/**
 * Created by guanxiaoda on 16/4/27.
 * ���ַ����пո��滻Ϊ%20
 * todo 为什么一定要从后向前?是否可以从前向后
 */
public class replaceSpace {


    public static String replaceSpace(String str) {
        if (str == null) return null;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') count++;
        }
        char[] newCharSet = new char[str.length() + count*2];
        for (int i = str.length()-1, j = newCharSet.length - 1; i >=0 ; i--) {
            if (str.charAt(i) == ' ') {
                newCharSet[j--] = '0';
                newCharSet[j--] = '2';
                newCharSet[j--] = '%';
            } else {
                newCharSet[j--] = str.charAt(i);
            }
        }


        return new String(newCharSet);
    }


    public static void main(String[] args) {
        System.out.println(replaceSpace("fjiq jdkalg jklsa ll"));
        System.out.println(replaceSpace("���Ƕ��� ����˵..."));
        System.out.println(replaceSpace("guanxiaoda.cn"));
        System.out.println(replaceSpace(""));
        System.out.println(replaceSpace(null));
        System.out.println(replaceSpace("https://%20guanxiaoda.cn"));
    }


}
