package com.chay.corejava.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EX01_ReverseOrder {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);

        System.out.println(l);  // [15, 0, 20, 10, 5]

        Collections.sort(l, new DescNumComparator()); // descending order
        System.out.println(l);  // [20, 15, 10, 5, 0]

        Comparator<Integer> reverseComparator = Collections.reverseOrder(new DescNumComparator());
        Collections.sort(l, reverseComparator); // ascending order
        System.out.println(l);  // [0, 5, 10, 15, 20]
    }
}
