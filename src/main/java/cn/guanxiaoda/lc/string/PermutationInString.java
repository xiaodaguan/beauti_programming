package cn.guanxiaoda.lc.string;

/**
 * @author guanxiaoda
 * @date 2019-04-11
 */
public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(new PermutationInString().checkInclusion("ab", "eidbaooo"));
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        } else {
            int[] freq = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                freq[s1.charAt(i) - 'a']++;
            }

            for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
                String s3 = s2.substring(i, i + s1.length());
                int[] freq1 = new int[26];
                for (int j = 0; j < s3.length(); j++) {
                    freq1[s3.charAt(j) - 'a']++;
                }
                if (match(freq, freq1)) {
                    return true;
                }
            }
            return false;

        }
    }

    private boolean match(int[] freq, int[] freq1) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != freq1[i]) {
                return false;
            }
        }
        return true;
    }
}
