package com.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangshunfan on 2018/7/6
 * 生成括号
 */
public class Test427 {
    /**
     * 给定数字n，生成括号组合
     * @param n: n pairs
     * @return: All combinations of well-formed parentheses
     */
    public List<String> generateParenthesis(int n) {
        // write your code here
        ArrayList<String> result = new ArrayList<String>();
        getParenthesis(result, "", n, n);
        return result;
    }

    private void getParenthesis(ArrayList<String> result, String paren, int left, int right) {
        if (left == 0 && right == 0) {
            result.add(paren);
            return;
        }

        if (left > 0) {
            getParenthesis(result, paren + "(", left - 1, right);
        }
        if (right > 0 && left < right) {
            getParenthesis(result, paren + ")", left, right - 1);
        }
    }
}
