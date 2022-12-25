package StackAndQueuse;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(4);
        stack.push(3544);
        System.out.println(stack.pop());
        //basically which item inserted last this will remove first.
        System.out.println(stack.peek());
        //peek shows the last item.

    }
}
