package com.wwwjf.algorithm;

/**
 * 排序
 */
public class Sort {

    /**
     * 冒泡排序
     * 自左向右，相邻的两个数比较，较大的数往后移，较小的数往前移
     *
     * @param nums
     * @return
     */
    public static int[] bubbleSort(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }

        return nums;
    }


    /**
     * 快速排序
     * 选择一个参考数，比参考数小的放在左边，比参考数大的放在右边，然后再同样的方法比较右边的数和左边的数
     * @param nums
     * @return
     */
    public static int[] quickSort(int[] nums) {

        if (nums.length <= 0) {
            return nums;
        }

        quickSort(nums, 0, nums.length - 1);


        return nums;
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left < right) {

            //一分为二
            int middle = getMiddle(nums, left, right);
            System.out.println("middle=" + middle);

            //小的数排序
            quickSort(nums, 0, middle - 1);

            //大的数排序
            quickSort(nums, middle + 1, right);
        }

    }

    //找到中间的位置,一分为二
    private static int getMiddle(int[] list, int left, int right) {
        int tmp = list[left];    //数组的第一个作为中轴 取第一个为参考数，先判断最右边的下标

        while (left < right) {

            while (left < right && list[right] >= tmp) {//判断右边下标

                right--;

            }

            list[left] = list[right];   //比中轴小的记录移到低端

            while (left < right && list[left] <= tmp) {//判断左边下标

                left++;

            }

            list[right] = list[left];   //比中轴大的记录移到高端

        }

        list[left] = tmp;              //中轴记录到尾

        return left;                   //返回中轴的位置
    }

}
