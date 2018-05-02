package cn.guanxiaoda.crackingTheCodingInterview.arrayAndString;

import java.util.HashSet;

/**
 * Created by guanxiaoda on 6/3/16.
 * 若M*N矩阵中某个元素为0,则将其所在的行与列清零
 * <p/>
 * 开始中了陷阱,在扫描的过程中直接将所在行列置0,然后发现扫描结束整个矩阵都不好了T_T
 * <p/>
 * 然后明白必须先扫描一边,记录下需要清零的行和列,然后再统一清零
 * <p/>
 * 用了两个hashset,用数组自然是更好的,不过如果想要节约空间,需要用boolean数组,当作一个向量,标记那些需要清零的行和列为true即可
 * 或者用位向量应该也可以
 *
 *
 */
public class MatrixClearLines {

    private int[][] MATRIX;
    private int M;
    private int N;

    /**
     * 笨办法
     */
    private void clearLines() {
        HashSet<Integer> rows = new HashSet<Integer>();
        HashSet<Integer> cols = new HashSet<Integer>();
        for (int row = 0; row < M; row++) {
            for (int col = 0; col < N; col++) {

                if (this.MATRIX[row][col] == 0) {
                    rows.add(row);
                    cols.add(col);
                }

            }
        }

        for (int row : rows) {
            for (int i = 0; i < N; i++) {
                this.MATRIX[row][i] = 0;
            }
        }
        for (int col : cols) {
            for (int i = 0; i < M; i++) {
                this.MATRIX[i][col] = 0;
            }
        }
    }

    private void clearLineBetter() {
        int rows = 0;
        int cols = 0;
        for (int row = 0; row < M; row++) {
            for (int col = 0; col < N; col++) {

                if (this.MATRIX[row][col] == 0) {
                    rows |= 1 << row;
                    cols |= 1 << col;
                }

            }
        }

        for (int i = 0; i < M; i++) {
            if (rows % 2 == 1) {
                for (int j = 0; j < N; j++) {
                    this.MATRIX[i][j] = 0;
                }
            }
            rows >>= 1;
        }

        for (int j = 0; j < N; j++) {
            if (cols % 2 == 1) {
                for (int i = 0; i < M; i++) {
                    this.MATRIX[i][j] = 0;
                }
            }
            cols >>= 1;
        }

    }

    public MatrixClearLines(int m, int n) {
        this.M = m;
        this.N = n;
        initMatrix(m, n);
    }

    /**
     * 随机赋值
     *
     * @param m
     * @param n
     */
    private void initMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (10 * Math.random());
            }
        }
        this.MATRIX = matrix;
    }

    private void print() {
        int[][] matrix = this.MATRIX;
        for (int i = 0; i < this.M; i++) {
            for (int j = 0; j < this.N; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixClearLines mcl = new MatrixClearLines(6, 8);
        mcl.print();
        System.out.println("---");
//        mcl.clearLines();
        mcl.clearLineBetter();
        mcl.print();
    }

}
