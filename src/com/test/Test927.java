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
        String s = " ";
        for (Character character : str) {
            if (character != null && character != ' ') {
                s += character;
            } else {
                stack.push(s);
                s = " ";
            }
        }
        stack.push(s);
        String tmp = "";
        while (!stack.empty()) {
            tmp += stack.pop();
        }
        char[] result = tmp.substring(1).toCharArray();

        return result;
    }
}
