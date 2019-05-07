//给出一个区间的集合，请合并所有重叠的区间。 
//
// 示例 1: 
//
// 输入: [[1,3],[2,6],[8,10],[15,18]]
//输出: [[1,6],[8,10],[15,18]]
//解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
// 
//
// 示例 2: 
//
// 输入: [[1,4],[4,5]]
//输出: [[1,5]]
//解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。 
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("ALL")
class Solutionhbqj {

    public int[][] merge(int[][] intervals) {
        // sort
        sortArrs(intervals);
        List<int[]> al = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (al.isEmpty() || al.get(al.size() - 1)[1] < intervals[i][0]) {
                al.add(intervals[i]);
            } else {
                if (al.get(al.size() - 1)[1] < intervals[i][1]) {
                    al.get(al.size() - 1)[1] = intervals[i][1];
                }
            }
        }
        int[][] res = new int[al.size()][2];
        for (int i = 0; i < al.size(); i++) {
            res[i] = al.get(i);
        }
        return res;
    }

    private void sortArrs(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
    }
}