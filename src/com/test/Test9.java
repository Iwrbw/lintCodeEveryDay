package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz 问题
 * Create by yangshunfan
 * 2018/3/25 22:27
 */
public class Test9 {

    public List<String> fizzBuzz(int n) {
        // write your code here
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("fizz buzz");
            } else if (i % 3 == 0) {
                list.add("fizz");
            } else if (i % 5 == 0) {
                list.add("buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
