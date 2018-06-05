package com.test;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author yangshunfan 2018/4/30 13:31
 * 带最小值操作的栈
 * test12
 */
public class MinStack {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(5);
        minStack.push(4);
        minStack.push(4);
        System.out.println(minStack.min());
        System.out.println(minStack.pop());
        System.out.println(minStack.pop());
        minStack.push(3);
        System.out.println(minStack.min());
        minStack.push(3);
        System.out.println(minStack.min());
        System.out.println(minStack.pop());
        minStack.push(2);
        minStack.push(2);
        minStack.push(1);
        minStack.push(1);
        System.out.println(minStack.min());
        System.out.println(minStack.pop());
        System.out.println(minStack.min());
        System.out.println(minStack.pop());
    }

    Stack<Integer> stack = new Stack<Integer>();
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    public MinStack() {
        // do intialization if necessary

    }

    /**
     * @param number: An integer
     * @return: nothing
     */
    public void push(int number) {
        // write your code here
        stack.push(number);
        if (number <= min() && !linkedList.isEmpty()) {
            linkedList.add(0, number);
        } else {
            linkedList.add(number);
        }
    }

    /**
     * @return: An integer
     */
    public int pop() {
        // write your code here
        linkedList.remove(stack.peek());
        return stack.pop();
    }

    /**
     * @return: An integer
     */
    public int min() {
        // write your code here
        if (linkedList.isEmpty()) {
            return 0;
        }
        return linkedList.get(0);
    }
}
