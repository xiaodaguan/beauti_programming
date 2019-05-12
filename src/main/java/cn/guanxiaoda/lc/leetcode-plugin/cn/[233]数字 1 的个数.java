//给定一个整数 n，计算所有小于等于 n 的非负整数中数字 1 出现的个数。 
//
// 示例: 
//
// 输入: 13
//输出: 6 
//解释: 数字 1 出现在以下数字中: 1, 10, 11, 12, 13 。 
//

@SuppressWarnings("ALL")
class Solutionszidgs {
//    public static void main(String[] args) {
//        System.out.println(new Solution().countDigitOne(101));
//    }

    public int countDigitOne(int n) {
        if (n <= 0) return 0;
        if (n < 10) return 1;
        int b = getLen(n);// 长度
        int p = power(b - 1);
        int f = n / p;// 首位
        int l = n % p;// 除首位外剩余数


        return (f == 1 ? (l + 1) : p)// 首位贡献
                + f * countDigitOne(p - 1)// 剩余位贡献
                + countDigitOne(l);


    }


    /**
     * 求位数
     *
     * @param n
     * @return
     */
    private int getLen(int n) {
        if (n == 0) return 1;
        int ret = 0;
        while (n > 0) {
            n /= 10;
            ret++;
        }
        return ret;
    }

    /**
     * 求10的n次方
     *
     * @param n
     * @return
     */
    private int power(int n) {
        if (n == 0) return 1;
        int ret = 1;
        for (int i = 1; i <= n; i++) {
            ret *= 10;
        }
        return ret;
    }
}