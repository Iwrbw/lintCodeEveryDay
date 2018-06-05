package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunfan 2018/5/9 20:18
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list.size());
        System.out.println(list.get(list.size() - 1));
    }
}
