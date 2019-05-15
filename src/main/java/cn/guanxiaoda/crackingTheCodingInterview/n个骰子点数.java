package cn.guanxiaoda.crackingTheCodingInterview;

/**
 * @author guanxiaoda
 * @date 2019-05-15
 */
public class n�����ӵ��� {

    public static void main(String[] args) {

        // ���Ӹ���
        int n = 3;
        String[] re = new n�����ӵ���().probability(n);
        for (String s : re) {
            System.out.println(s);
        }
    }

    /**
     * @param n ���Ӹ���
     * @return ��ͬ�����͵Ĵ����͵ĸ���
     */
    public String[] probability(int n) {
        if (n <= 0) {
            return null;
        }

        // ���п��ܵ����� 6^n
        int total = (int) Math.pow(6, n);

        // c �����ӵ�����Ϊk�Ĵ���
        // Ϊʲô��n+1?
        // ��1�����ӿ�ʼͶ��������Ҳ�Ǵ�1��ʼ
        // Ϊʲô��6*n+1����Ϊdp[0][x]û�ã�ʵ��Ҳ����ʡһ�������ǲ������
        int[][] dp = new int[n + 1][6 * n + 1];
        // ��ʼ��1������
        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1;
        }
        // �ӵڶ������ӵ���n��
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= 6 * n; j++) {
                // Ͷi�����ӣ�������Ϊj�Ĵ���dp[i][j] = dp[i-1][j-1]+dp[i-1][j-2]+dp[i-1][j-3]+dp[i-1][j-4]+dp[i-1][j-5]+dp[i-1][j-6]
                dp[i][j] = 0;
                for (int x = 1; x <= 6; x++) {
                    // ��j�����ӣ�����Ϊx
                    if (j - x <= 0) {
                        // Ͷ����i-1�����ӵ�ʱ�������Ϊ<=0����������ǲ����ڵģ�����Ҫ����
                        // ���磬���Ӹ���3��������Ϊ4����Ͷ�����������ӵ���>=4��������ÿ���
                        break;
                    }
                    dp[i][j] += dp[i - 1][j - x];
                }
            }
        }


        // ���п��ܵĺͣ�3������Ϊ 3~18 = 16
        String[] results = new String[6 * n - n + 1];
        // ���
        for (int k = n; k <= 6 * n; k++) {
            results[k - n] = "sum=" + k + ", prob=" + dp[n][k] + "/" + total;
        }
        return results;


    }
}
