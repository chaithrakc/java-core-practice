package com.chay.corejava.collections.sorting;

import java.util.Comparator;

public class DescNumComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer num1, Integer num2) {
        return num2.compareTo(num1);
    }
}
