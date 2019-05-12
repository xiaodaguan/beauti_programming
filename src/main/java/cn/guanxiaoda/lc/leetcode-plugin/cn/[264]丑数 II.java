//编写一个程序，找出第 n 个丑数。 
//
// 丑数就是只包含质因数 2, 3, 5 的正整数。 
//
// 示例: 
//
// 输入: n = 10
//输出: 12
//解释: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 是前 10 个丑数。 
//
// 说明: 
//
// 
// 1 是丑数。 
// n 不超过1690。 
// 
//

@SuppressWarnings("ALL")
class Solutioncs2 {

//    public static void main(String[] args) {
//        System.out.println(new Solution().nthUglyNumber(0));
//    }

    public int nthUglyNumber(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        int[] uglys = new int[n + 1];
        uglys[0] = 1;
        int px2 = 0;
        int px3 = 0;
        int px5 = 0;

        for (int i = 1; i < n; i++) {
            int min = min(uglys[px2] * 2, uglys[px3] * 3, uglys[px5] * 5);
            if (uglys[px2] * 2 == min) px2++;
            if (uglys[px3] * 3 == min) px3++;
            if (uglys[px5] * 5 == min) px5++;
            uglys[i] = min;
        }
        return uglys[n - 1];
    }

    /**
     * 3个数最小值
     *
     * @param i1
     * @param i2
     * @param i3
     * @return
     */
    private int min(int i1, int i2, int i3) {
        if (i1 < i2) {
            return i1 < i3 ? i1 : i3;
        } else {
            return i2 < i3 ? i2 : i3;
        }
    }
}