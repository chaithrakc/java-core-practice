package com.chay.corejava.collections.searching;

import java.util.ArrayList;
import java.util.Collections;

import com.chay.corejava.collections.sorting.DescNumComparator;

public class SearchDemo02 {

    public static void main(String[] args) {
        ArrayList<Integer> intArrL = new ArrayList<>();
        intArrL.add(15);
        intArrL.add(0);
        intArrL.add(20);
        intArrL.add(10);
        intArrL.add(5);

        System.out.println(intArrL); // [15, 0, 20, 10, 5]

        Collections.sort(intArrL, new DescNumComparator());
        System.out.println(intArrL); // [20, 15, 10, 5, 0]

        System.out.println(Collections.binarySearch(intArrL, 10, new DescNumComparator())); // 2
        System.out.println(Collections.binarySearch(intArrL, 13, new DescNumComparator())); // -3
        System.out.println(Collections.binarySearch(intArrL, 25, new DescNumComparator())); // -1
        System.out.println(Collections.binarySearch(intArrL, -1, new DescNumComparator())); // -6
        System.out.println(Collections.binarySearch(intArrL, 17)); // -6 unpredictable

    }
}
