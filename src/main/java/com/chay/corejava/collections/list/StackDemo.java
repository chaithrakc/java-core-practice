package com.chay.corejava.collections.list;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack); // [A, B, C]

        System.out.println(stack.search("A")); // 3
        System.out.println(stack.search("B")); // 2
        System.out.println(stack.search("C")); // 1
        System.out.println(stack.search("Z")); // -1
    }
}
