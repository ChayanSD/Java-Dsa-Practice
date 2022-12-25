package StackAndQueuse;

import java.util.*;
public class QueuseExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);//element inserted.
        queue.add(5);
        System.out.println(queue.peek());//first item will be show.
        System.out.println(queue.remove());//first item will be remove.

    }
}
