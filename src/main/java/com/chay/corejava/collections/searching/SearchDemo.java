package com.chay.corejava.collections.searching;

import java.util.ArrayList;
import java.util.Collections;

public class SearchDemo {

    public static void main(String[] args) {
        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add("z");
        strArrList.add("A");
        strArrList.add("m");
        strArrList.add("k");
        strArrList.add("a");

        System.out.println(strArrList); // [z, A, m, k, a]

        Collections.sort(strArrList);
        System.out.println(strArrList); // [A, a, k, m, z]

        System.out.println(Collections.binarySearch(strArrList, "z")); // 4
        System.out.println(Collections.binarySearch(strArrList, "j")); // -3

    }
}
