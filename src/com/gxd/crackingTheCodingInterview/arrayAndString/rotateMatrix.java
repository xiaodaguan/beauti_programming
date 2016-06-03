package com.gxd.crackingTheCodingInterview.arrayAndString;

/**
 * Created by guanxiaoda on 16/4/27.
 * 矩阵旋转
 * 给定一幅n*n矩阵表示的图像,其中每个像素的大小为4字节,编写一个方法,将该矩阵旋转90度,不占用额外空间能否做到?
 * <p/>
 * 一个int的大小是32bit,也就是4字节,题目的意思是每个像素存储一个int
 * <p/>
 * 基本思路: 如果可以使用额外空间?比较容易
 * <p/>
 * 如果不可以使用额外空间?
 * 元素坐标转移关系
 * <p/>
 * ...
 * 分层转动,每一层内,设定偏移量,依次转动每个元素
 * 需要转动的层数N/2,如果n为奇数时,最中央的元素无需旋转
 * 偏移量的取值,每一层由layer开始,直到倒数第二个元素,即N-2-layer
 * 坐标对应关系,对于确定的layer和offset,每个方位上的元素坐标如下:
 * top: (layer, N-1-layer-offset)
 * right: (N-1-layer-off, N-1-layer)
 * down: (N-1-layer, layer+offset)
 * left: (layer+offset, layer)
 * 转动时,对于一组确定的layer和offset,首先保存一个方位的元素,然后依次转移值,例如:
 * 1. save top -> TOPVAL;
 * 2. right -> top;
 * 3. down -> right;
 * 4. left -> down;
 * 5. TOPVAL -> left;
 */
public class rotateMatrix {

    /**
     *
     */
    private void rotateWithoutExtraSpace() {
        for (int layer = 0; layer < this.N / 2; layer++) {
            for (int offset = layer; offset <= this.N - 2 - layer; offset++) {
                int topVal = this.MATRIX[layer][N - 1 - layer - offset];
                //右to上
                this.MATRIX[layer][N - 1 - layer - offset] = this.MATRIX[N - 1 - layer - offset][N - 1 - layer];
                //下to右
                this.MATRIX[N - 1 - layer - offset][N - 1 - layer] = this.MATRIX[N - 1 - layer][layer + offset];
                //左to下
                this.MATRIX[N - 1 - layer][layer + offset] = this.MATRIX[layer + offset][layer];
                //上to左
                this.MATRIX[layer + offset][layer] = topVal;
            }
        }

    }

    private int[][] MATRIX;
    private int N;

    public rotateMatrix(int n) {
        this.N = n;
        initMatrix(n);
    }

    private void initMatrix(int n) {
        int[][] matrix = new int[n][n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = k++;
            }
        }
        this.MATRIX = matrix;
    }

    private void print() {
        int[][] matrix = this.MATRIX;
        for (int i = 0; i < this.N; i++) {
            for (int j = 0; j < this.N; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 使用额外空间的方法
     */
    private void rotateWithExtraSpace() {
        int[][] matrix = this.MATRIX;
        int[][] newmatrix = new int[this.N][this.N];

        for (int i = 0; i < this.N; i++) {
            for (int j = 0; j < this.N; j++) {
                newmatrix[this.N - 1 - j][i] = matrix[i][j];
            }
        }

        this.MATRIX = newmatrix;
    }


    public static void main(String[] args) {
//        System.out.println(Integer.SIZE);
        rotateMatrix ma = new rotateMatrix(6);
        ma.print();
        System.out.println("--------");
        ma.rotateWithExtraSpace();
        ma.print();
        System.out.println("--------");
        ma.rotateWithExtraSpace();
        ma.print();
        System.out.println("--------");
        ma.rotateWithoutExtraSpace();
        ma.print();
        System.out.println("--------");
        ma.rotateWithoutExtraSpace();
        ma.print();

    }
}
