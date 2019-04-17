package cn.guanxiaoda.lc;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guanxiaoda
 * @date 2019-01-07
 */
public class DynamicProgramming {

    static Map<Integer, Integer> counts = new HashMap<>();

    /**
     * 这不是动态规划，这是递归
     * @param n
     * @return
     */
    public static int getWays(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            if (counts.containsKey(n)) {
                return counts.get(n);
            } else {
                int result = getWays(n - 1) + getWays(n - 2);
                counts.put(n, result);
                return result;
            }
        }
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
        System.out.println(getWays(10000));
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
