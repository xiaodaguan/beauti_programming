//给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。 
//
// 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下： 
//
// 
// "123" 
// "132" 
// "213" 
// "231" 
// "312" 
// "321" 
// 
//
// 给定 n 和 k，返回第 k 个排列。 
//
// 说明： 
//
// 
// 给定 n 的范围是 [1, 9]。 
// 给定 k 的范围是[1, n!]。 
// 
//
// 示例 1: 
//
// 输入: n = 3, k = 3
//输出: "213"
// 
//
// 示例 2: 
//
// 输入: n = 4, k = 9
//输出: "2314"
// 
//

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
class Solutiondkgpl {


    public String getPermutation(int n, int k) {
        char[] nums = new char[n];
        Set<Integer> seen = new HashSet<>(n);
        int index = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (seen.contains(j)) {
                    continue;
                }
                int factorial = factorial(n - i);
                index += factorial;
                if (index >= k) {
                    index -= factorial;
                    nums[i - 1] = (char) (j + '0');
                    seen.add(j);
                    break;
                }
            }
        }
        return new String(nums);

    }


    private int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}