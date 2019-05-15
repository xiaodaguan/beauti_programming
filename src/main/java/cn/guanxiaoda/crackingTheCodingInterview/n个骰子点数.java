package cn.guanxiaoda.crackingTheCodingInterview;

/**
 * @author guanxiaoda
 * @date 2019-05-15
 */
public class n个骰子点数 {

    public static void main(String[] args) {

        // 骰子个数
        int n = 3;
        String[] re = new n个骰子点数().probability(n);
        for (String s : re) {
            System.out.println(s);
        }
    }

    /**
     * @param n 骰子个数
     * @return 不同点数和的次数和的概率
     */
    public String[] probability(int n) {
        if (n <= 0) {
            return null;
        }

        // 所有可能的排列 6^n
        int total = (int) Math.pow(6, n);

        // c 个骰子点数和为k的次数
        // 为什么是n+1?
        // 从1个骰子开始投，点数和也是从1开始
        // 为什么是6*n+1，因为dp[0][x]没用，实际也可以省一个，但是不好理解
        int[][] dp = new int[n + 1][6 * n + 1];
        // 初始化1个骰子
        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1;
        }
        // 从第二个骰子到第n个
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= 6 * n; j++) {
                // 投i个骰子，点数和为j的次数dp[i][j] = dp[i-1][j-1]+dp[i-1][j-2]+dp[i-1][j-3]+dp[i-1][j-4]+dp[i-1][j-5]+dp[i-1][j-6]
                dp[i][j] = 0;
                for (int x = 1; x <= 6; x++) {
                    // 第j个骰子，点数为x
                    if (j - x <= 0) {
                        // 投掷第i-1个骰子的时候点数和为<=0，这种情况是不存在的，不需要计算
                        // 例如，骰子个数3，点数和为4，则投掷第三个骰子点数>=4的情况不用考虑
                        break;
                    }
                    dp[i][j] += dp[i - 1][j - x];
                }
            }
        }


        // 所有可能的和，3个骰子为 3~18 = 16
        String[] results = new String[6 * n - n + 1];
        // 结果
        for (int k = n; k <= 6 * n; k++) {
            results[k - n] = "sum=" + k + ", prob=" + dp[n][k] + "/" + total;
        }
        return results;


    }
}
