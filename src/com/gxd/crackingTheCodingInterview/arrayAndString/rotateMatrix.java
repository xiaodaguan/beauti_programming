package com.gxd.crackingTheCodingInterview.arrayAndString;

/**
 * Created by guanxiaoda on 16/4/27.
 * ������ת
 * ����һ��n*n�����ʾ��ͼ��,����ÿ�����صĴ�СΪ4�ֽ�,��дһ������,���þ�����ת90��,��ռ�ö���ռ��ܷ�����?
 * <p/>
 * һ��int�Ĵ�С��32bit,Ҳ����4�ֽ�,��Ŀ����˼��ÿ�����ش洢һ��int
 * <p/>
 * ����˼·: �������ʹ�ö���ռ�?�Ƚ�����
 * <p/>
 * ���������ʹ�ö���ռ�?
 * Ԫ������ת�ƹ�ϵ
 * <p/>
 * ...
 * �ֲ�ת��,ÿһ����,�趨ƫ����,����ת��ÿ��Ԫ��
 * ��Ҫת���Ĳ���N/2,���nΪ����ʱ,�������Ԫ��������ת
 * ƫ������ȡֵ,ÿһ����layer��ʼ,ֱ�������ڶ���Ԫ��,��N-2-layer
 * �����Ӧ��ϵ,����ȷ����layer��offset,ÿ����λ�ϵ�Ԫ����������:
 * top: (layer, N-1-layer-offset)
 * right: (N-1-layer-off, N-1-layer)
 * down: (N-1-layer, layer+offset)
 * left: (layer+offset, layer)
 * ת��ʱ,����һ��ȷ����layer��offset,���ȱ���һ����λ��Ԫ��,Ȼ������ת��ֵ,����:
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
                //��to��
                this.MATRIX[layer][N - 1 - layer - offset] = this.MATRIX[N - 1 - layer - offset][N - 1 - layer];
                //��to��
                this.MATRIX[N - 1 - layer - offset][N - 1 - layer] = this.MATRIX[N - 1 - layer][layer + offset];
                //��to��
                this.MATRIX[N - 1 - layer][layer + offset] = this.MATRIX[layer + offset][layer];
                //��to��
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
     * ʹ�ö���ռ�ķ���
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
