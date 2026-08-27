package com.chay.corejava.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(15);
        arrList.add(0);
        arrList.add(20);
        arrList.add(10);
        arrList.add(5);
        System.out.println(arrList); // [15, 0, 20, 10, 5]

        Collections.reverse(arrList);
        System.out.println(arrList); // [15, 0, 20, 10, 5]
    }
}
