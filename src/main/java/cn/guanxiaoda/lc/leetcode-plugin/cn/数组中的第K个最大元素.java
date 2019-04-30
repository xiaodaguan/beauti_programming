//在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。 
//
// 示例 1: 
//
// 输入: [3,2,1,5,6,4] 和 k = 2
//输出: 5
// 
//
// 示例 2: 
//
// 输入: [3,2,3,1,2,4,5,5,6] 和 k = 4
//输出: 4 
//
// 说明: 
//
// 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。 
//

@SuppressWarnings("ALL")
class Solutionfkl {


    public int findKthLargest(int[] nums, int k) {

        // 构造大顶堆
        for (int i = (nums.length - 1) / 2; i >= 0; i--) {
            fixDown(nums, nums.length, i);
        }

        // 堆排序
        // 交换到第k个，直接返回该元素，堆排序终止
        int re = 0;
        for (int i = 0; i < k; i++) {
            swap(nums, 0, nums.length - 1 - i);
            re = nums[nums.length - 1 - i];

            fixDown(nums, nums.length - i - 1, 0);
        }
        return re;
    }



    /**
     * 自定向下修复堆
     *
     * @param num
     * @param i
     */
    private void fixDown(int[] nums, int len, int i) {
        int parent = i;
        int lc = 2 * parent + 1;
        int rc = 2 * parent + 2;
        while (lc < len) {
            if (rc >= len || nums[lc] > nums[rc]) {
                // 和左子比较
                if (nums[parent] < nums[lc]) {
                    swap(nums, parent, lc);
                    parent = lc;
                    lc = 2 * parent + 1;
                    rc = 2 * parent + 2;
                } else {
                    break;
                }
            } else {
                // 和右子比较
                if (nums[parent] < nums[rc]) {
                    swap(nums, parent, rc);
                    parent = rc;
                    lc = 2 * parent + 1;
                    rc = 2 * parent + 2;
                } else {
                    break;
                }
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}