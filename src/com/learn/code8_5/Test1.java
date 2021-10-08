package com.learn.code8_5;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author pengg
 * @date 2021/9/28 10:28
 */
public class Test1 {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue();
        queue.add(1);
        queue.add(21);
        queue.add(13);
        queue.add(-1);
        queue.add(122);
        System.out.println(queue);
        System.out.println("------------");
        while (queue.peek() != null) {
            System.out.print("element:" + queue.element() + "   ");
            System.out.print("peek:" + queue.peek() + "   ");
            System.out.println(queue.poll());
            System.out.println(queue);
        }

        System.out.println("----------");
        Queue queue1 = new PriorityQueue<Integer>((a, b) -> {
            int a1 = (Integer) a;
            int b1 = (Integer) b;
            return -(a1 > b1 ? 1 : a1 == b1 ? 0 : -1);
//            return -(((Integer) a)-((Integer)b));
        });
        queue1.add(21);
        queue1.add(-221);
        queue1.add(121);
        queue1.add(-21);
        System.out.println(queue1);

        PriorityQueue queue2 = new PriorityQueue();
        queue2.add(new A(1));
        queue2.add(new A(12));
        queue2.add(new A(31));
        System.out.println("****************");
        System.out.println(queue2.peek());
    }

}

class A implements Comparable {
    int a;

    public A(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        A a = (A) o;
        int a1 = this.a;
        int b1 = a.a;
        return -(a1 > b1 ? 1 : a1 == b1 ? 0 : -1);
    }
}
