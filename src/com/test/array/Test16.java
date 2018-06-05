package com.test.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunfan 2018/5/1 14:52
 */
public class Test16 {
    /**
     * @param :  A list of integers
     * @return: A list of unique permutations
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        // write your code here
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            result.add(list);
            return result;
        }
        list.add(nums[0]);
        result.add(new ArrayList<Integer>(list));
        for (int i = 1; i < nums.length; i++) {
            int size = result.size();
            for (int j = 0; j < size; j++) {
                for (int k = 0; k <= result.get(0).size(); k++) {
                    List<Integer> tmp = new ArrayList<Integer>(result.get(0));
                    tmp.add(k, nums[i]);
                    if (!result.contains(tmp)) {
                        result.add(tmp);

                    }
                }
                result.remove(0);
            }
        }
        return result;
    }
}
