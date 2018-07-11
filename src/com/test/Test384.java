package com.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author yangshunfan on 2018/7/11
 * 最长无重复字符的子串
 * 给定一个字符串，请找出其中无重复字符的最长子字符串。
 */
public class Test384 {
    public static void main(String[] args) {
        String s = "gehmbfqmozbpripibusbezagafqtypz";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }
    /**
     * @param s: a string
     * @return: an integer
     */
    public static int lengthOfLongestSubstring(String s) {
        // write your code here
        if (s.isEmpty() || "".equals(s)) {
            return 0;
        }
        char[] c = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int value = 0, max = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < c.length; j++) {
            if (!set.contains(c[j])) {
                set.add(c[j]);
                map.put(c[j], j);
                value++;
                max = Math.max(value, max);
            } else {
                value = 0;
                set.clear();
                j = map.get(c[j]);
                map.put(c[j], j);
            }
        }
        return max;
    }
}
