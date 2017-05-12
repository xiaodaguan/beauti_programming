package com.gxd.sort;

/**
 * Created by guanxiaoda on 17/5/11.
 * 支点选最左最右都可以：选最左，先从右向左找；选最右，先从左向右找；选中间？（可能需要设置一个k）
 *
 * 思路：
 * 1. partition找支点
 * 2. 递归
 *
 * 关于partition:
 * 每次找到合适的元素，填坑，坑换位
 * 要用<=和>=，否则有重复元素容易死循环
 * 不要忘了指针相遇之后用top填坑
 * */
public class QuickSort {

    public static void quickSort(int[] arr, int l, int r){
        if(l<r){
            int pivot = partition(arr, l ,r);//支点位置

            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]);
            System.out.println();
            quickSort(arr,l,pivot-1);
            quickSort(arr,pivot+1,r);
        }
    }

    private static int partition(int[] arr, int l, int r){

        int top = arr[r];//支点值，起始坑在右
        while(l<r){

            while(arr[l] <= top && l<r) l++;//从左向右找比top大的
            arr[r]=arr[l];//用找到的值填坑，坑到左边
            while(arr[r] >= top && l<r) r--;//从右向左找比top小的
            arr[l]=arr[r];//用找到的值填坑，坑到右边
        }
        arr[l]=top;//支点填坑(此时l=r)

        return l;//返回支点位置
    }



    public static void main(String[] args) {
        int[] a = {3,6,5,4,4,2,8,7,6};

        quickSort(a,0,a.length-1);

        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
    }
}
