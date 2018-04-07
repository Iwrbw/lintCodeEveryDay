package com.test;

import java.util.HashMap;
import java.util.Map;

/**
 * Create by yangshunfan
 * 2018/4/7 15:49
 * 落单的数
 */
public class Test82 {
    public static void main(String[] args) {
        int[] a = {0,0,1};
        System.out.println(singleNumber(a));
    }
    public static int singleNumber(int[] A) {
        // write your code here
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < A.length; i++) {
            if (!map.containsKey(A[i])){
                map.put(A[i],1);
            } else {
                map.put(A[i],map.get(A[i])+1);
            }
        }
        int result = 0;
        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                result = m.getKey();
            }
        }
        return result;
    }
}
