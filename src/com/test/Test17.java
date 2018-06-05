package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yangshunfan 2018/5/2 12:08
 * 返回数组的所有子集（数组里面的数都不相同）
 */
public class Test17 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subsets(arr));
    }
    /**
     * @param nums: A set of numbers
     * @return: A list of lists
     */
    public static List<List<Integer>> subsets(int[] nums) {
        // write your code here
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(nums == null ){
            return res;
        }
        res.add(list);
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j < Math.pow(2,i);j++){
                //每一层的个数都是2的n次方
                List<Integer> temp = res.get(0);
                //把第一个取出来
                res.remove(0);
                ArrayList<Integer> temp2 = new ArrayList<Integer>(temp);
                temp2.add(temp2.size(), nums[i]);
                //加入一个数，放进去
                res.add(temp2);
                //不加数，放进去
                res.add(temp);
            }
        }
        return res;
    }
}
