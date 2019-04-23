//给定一个包含了一些 0 和 1的非空二维数组 grid , 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。你可以假设二维矩阵的四个边缘都被水包围着。 
//
// 找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为0。) 
//
// 示例 1: 
//
// 
//[[0,0,1,0,0,0,0,1,0,0,0,0,0],
// [0,0,0,0,0,0,0,1,1,1,0,0,0],
// [0,1,1,0,1,0,0,0,0,0,0,0,0],
// [0,1,0,0,1,1,0,0,1,0,1,0,0],
// [0,1,0,0,1,1,0,0,1,1,1,0,0],
// [0,0,0,0,0,0,0,0,0,0,1,0,0],
// [0,0,0,0,0,0,0,1,1,1,0,0,0],
// [0,0,0,0,0,0,0,1,1,0,0,0,0]]
// 
//
// 对于上面这个给定矩阵应返回 6。注意答案不应该是11，因为岛屿只能包含水平或垂直的四个方向的‘1’。 
//
// 示例 2: 
//
// 
//[[0,0,0,0,0,0,0,0]] 
//
// 对于上面这个给定的矩阵, 返回 0。 
//
// 注意: 给定的矩阵grid 的长度和宽度都不超过 50。 
//

@SuppressWarnings("ALL")
class Solutiondydzdmj {



    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        byte[][] visited = new byte[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (visited[i][j] == 1) {
                    continue;
                }

                int area = dfs(grid, i, j, visited);
                if (area > max) {
                    max = area;
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j, byte[][] visited) {
        if (visited[i][j] == 1) {
            return 0;
        }
        visited[i][j] = 1;
        int area = 0;
        if (grid[i][j] == 1) {
            area = 1;
            if (i > 0) {
                area += dfs(grid, i - 1, j, visited);
            }
            if (j > 0) {
                area += dfs(grid, i, j - 1, visited);
            }
            if (i < grid.length - 1) {
                area += dfs(grid, i + 1, j, visited);
            }
            if (j < grid[0].length - 1) {
                area += dfs(grid, i, j + 1, visited);
            }
        }

        return area;
    }


}