package com.learn.code8_5;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author pengg
 * @date 2021/9/29 18:03
 */
public class Test2 {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque<Integer>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(3);
        deque.addLast(4);
        deque.addFirst(5);
        deque.addLast(6);
        System.out.println(deque);
        System.out.println("*****");
        deque.push(7);
        deque.push(8);
        System.out.println(deque);
        deque.pop();
        deque.pop();
        System.out.println(deque);
        System.out.println("-----------");
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        Integer pop = (Integer) deque.pop();

    }
}

