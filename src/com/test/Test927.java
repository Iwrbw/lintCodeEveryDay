package com.test;

import java.util.Stack;

/**
 * @author yangshunfan on 2018/7/10
 */
public class Test927 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        char[] c = s.toCharArray();
        char[] result = reverseWords(c);
        for (Character i : result) {
            System.out.print(i);
        }
    }
    /**
     * @param str: a string
     * @return: return a string
     */
    public static char[] reverseWords(char[] str) {
        // write your code here
        Stack<String> stack = new Stack<>();
        StringBuilder s = new StringBuilder(" ");
        for (Character character : str) {
            if (character != null && character != ' ') {
                s.append(character);
            } else {
                stack.push(s.toString());
                s = new StringBuilder(" ");
            }
        }
        stack.push(s.toString());
        StringBuilder tmp = new StringBuilder();
        while (!stack.empty()) {
            tmp.append(stack.pop());
        }

        return tmp.substring(1).toCharArray();
    }
}
