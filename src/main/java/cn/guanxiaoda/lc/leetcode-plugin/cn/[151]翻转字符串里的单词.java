//给定一个字符串，逐个翻转字符串中的每个单词。 
//
// 
//
// 示例 1： 
//
// 输入: "the sky is blue"
//输出: "blue is sky the"
// 
//
// 示例 2： 
//
// 输入: "  hello world!  "
//输出: "world! hello"
//解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
//
//
// 示例 3：
//
// 输入: "a good   example"
//输出: "example good a"
//解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
//
//
// 
//
// 说明： 
//
// 
// 无空格字符构成一个单词。 
// 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。 
// 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。 
// 
//
// 
//
// 进阶： 
//
// 请选用 C 语言的用户尝试使用 O(1) 额外空间复杂度的原地解法。 
//

@SuppressWarnings("ALL")
class Solution151 {

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        char[] src = new char[s.length()];
        int a = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != ' ' || s.charAt(i + 1) != ' ') {
                src[a++] = s.charAt(i);
            }
        }
        if (s.charAt(s.length() - 1) != ' ') {
            src[a] = s.charAt(s.length() - 1);
        }

        int st = 0;
        int end = s.length();
        while ((st < end) && (src[st] <= ' ')) {
            st++;
        }
        while ((st < end) && src[end - 1] <= ' ') {
            end--;
        }


        return reverse(src, st, end).trim();
    }

    private String reverse(char[] src, int start, int end) {
        int i = start;
        int j = start;
        int p = end - 1;
        char[] arr = new char[end];
        while (i < end && j < end && p >= 0) {

            if (i >= j || src[j] != ' ') {
                j++;
                if (j != end) {
                    continue;
                }
            }
            int l = i;
            for (int k = p - (j - i) + 1; k <= p; k++) {
                arr[k] = src[i];
                i++;
            }
            if (p - (j - l) >= 0) {
                arr[p - (j - l)] = ' ';
            }
            p = p - (j - l) - 1;
            i++;
        }

        return new String(arr);
    }
}