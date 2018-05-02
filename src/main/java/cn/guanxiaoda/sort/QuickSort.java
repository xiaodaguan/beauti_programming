package cn.guanxiaoda.sort;

/**
 * Created by guanxiaoda on 17/5/11.
 * ֧��ѡ�������Ҷ����ԣ�ѡ�����ȴ��������ң�ѡ���ң��ȴ��������ң�ѡ�м䣿��������Ҫ����һ��k��
 *
 * ˼·��
 * 1. partition��֧��
 * 2. �ݹ�
 *
 * ����partition:
 * ÿ���ҵ����ʵ�Ԫ�أ���ӣ��ӻ�λ
 * Ҫ��<=��>=���������ظ�Ԫ��������ѭ��
 * ��Ҫ����ָ������֮����top���
 * */
public class QuickSort {

    public static void quickSort(int[] arr, int l, int r){
        if(l<r){
            int pivot = partition(arr, l ,r);//֧��λ��

            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]);
            System.out.println();
            quickSort(arr,l,pivot-1);
            quickSort(arr,pivot+1,r);
        }
    }

    private static int partition(int[] arr, int l, int r){

        int top = arr[r];//֧��ֵ����ʼ������
        while(l<r){

            while(arr[l] <= top && l<r) l++;//���������ұ�top���
            arr[r]=arr[l];//���ҵ���ֵ��ӣ��ӵ����
            while(arr[r] >= top && l<r) r--;//���������ұ�topС��
            arr[l]=arr[r];//���ҵ���ֵ��ӣ��ӵ��ұ�
        }
        arr[l]=top;//֧�����(��ʱl=r)

        return l;//����֧��λ��
    }



    public static void main(String[] args) {
        int[] a = {3,6,5,4,4,2,8,7,6};

        quickSort(a,0,a.length-1);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
    }
}
