//给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。 
//
// 注意：答案中不可以包含重复的三元组。 
//
// 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
// 
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
class Solutionsszh {

//    public static void main(String[] args) {
//        System.out.println(new Solution().threeSum(new int[]{2, 13, -2, -5, -1, 10, 6, -8, 5, -5, 7, -5, -14, -4, -5, 10, -15, -2, -14, -6, 10, 6, -14, -14, -9, -11, 8, -3, -2, 12, -9, -14, 3, 5, -12, -13, -8, 1, -14, 12, 12, 0, 14, 5, 4, -14, -8, 4, -9, -7, 14, -13, 6, 7, -12, 5, 12, 11, -13, -5, 0, -6, -12, -12, 6, 13, 12, 13, 0, 5, 2, -11, 13, 1, 9, 2, 2, -14, 13, 8, -14, 4, 2, 8, -3, -3, -10, -14, -15, 14, -12, 1, -15, 14, -4, 6, 12, -6, -4, -3, 6, 5}));
//    }

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> re = new ArrayList<>();

        int len = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < len; i++) {
            int j = i + 1, k = len - 1;
            int target = -nums[i];
            while (j < k) {
                if (nums[j] == nums[j - 1]) {
                    j++;
                    continue;
                }
                if (k < len - 1 && nums[k] == nums[k + 1]) {
                    k--;
                    continue;
                }
                if (nums[j] + nums[k] > target) {
                    k--;
                } else if (nums[j] + nums[k] < target) {
                    j++;
                } else {
                    if (i == j) {
                        j++;
                    } else if (i == k) {
                        k--;
                    } else {
                        re.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++;
                        k--;
                    }
                }
            }
        }


        return re;
    }
}