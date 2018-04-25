package com.test.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunfan 2018/4/25 19:45
 */
public class Test407 {

    public static void main(String[] args) {
        int[] digits = {8, 9, 9, 9};
        int[] result = plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
    /**
     * @param digits: a number represented as an array of digits
     * @return: the result
     */
    public static int[] plusOne(int[] digits) {
        // write your code here
        if (digits == null) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        int add = 1;

        for (int i = digits.length - 1; i >= 0; i--) {

            int conditions = digits[i] + add;

            if (conditions == 10) {
                list.add(0);
            } else {
                add = 0;
                list.add(conditions);
            }
        }
        int[] result = new int[0];
        if (list.get(list.size() - 1) == 0) {
            result = new int[list.size() + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = list.get(list.size() - i);
            }
        } else {
            result = new int[list.size()];
            for (int i = 0; i < result.length; i++) {
                result[i] = list.get(list.size() - i - 1);
            }
        }

        return result;
    }
}
