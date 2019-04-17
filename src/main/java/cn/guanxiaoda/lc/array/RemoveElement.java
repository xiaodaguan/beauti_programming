package cn.guanxiaoda.lc.array;

/**
 * Created by guanxiaoda on 15/11/18.
 *
 Given an array and a value, remove all instances of that value in place and return the new length.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
            }else {
                nums[j]=nums[i];
                j++;
            }

        }




        return j;
    }


    public static void main(String[] args) {

        int[] arr=new int[]{4,5};
        int val = 4;
        System.out.println(removeElement(arr,val));

    }

}
