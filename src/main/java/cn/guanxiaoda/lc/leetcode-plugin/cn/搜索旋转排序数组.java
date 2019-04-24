//假设按照升序排序的数组在预先未知的某个点上进行了旋转。 
//
// ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。 
//
// 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。 
//
// 你可以假设数组中不存在重复的元素。 
//
// 你的算法时间复杂度必须是 O(log n) 级别。 
//
// 示例 1: 
//
// 输入: nums = [4,5,6,7,0,1,2], target = 0
//输出: 4
// 
//
// 示例 2: 
//
// 输入: nums = [4,5,6,7,0,1,2], target = 3
//输出: -1 
//

@SuppressWarnings("WrongPackageStatement")
class Solutionssxzpxsz {


    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        return searchUnOrdered(nums, target, 0, nums.length - 1);
    }

    private int searchOrdered(int[] nums, int target, int begin, int end) {
        if (begin > end) {
            return -1;
        }
        int mid = (begin + end) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[begin] <= target && target < nums[mid]) {
            return searchOrdered(nums, target, begin, mid - 1);
        } else {
            return searchOrdered(nums, target, mid + 1, end);
        }
    }

    private int searchUnOrdered(int[] nums, int target, int begin, int end) {
        if (begin > end) {
            return -1;
        }
        int mid = (begin + end) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[begin] <= nums[mid]) {
            // 前有序，后无序
            if (nums[begin] <= target && target < nums[mid]) {
                return searchOrdered(nums, target, begin, mid - 1);
            } else {
                return searchUnOrdered(nums, target, mid + 1, end);
            }
        } else {
            // 前无序，后有序
            if (nums[mid] < target && target <= nums[end]) {
                return searchOrdered(nums, target, mid + 1, end);
            } else {
                return searchUnOrdered(nums, target, begin, mid - 1);
            }
        }
    }

}