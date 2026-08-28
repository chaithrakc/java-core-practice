package com.chay.corejava.collections.comparablecomparator;

import java.util.Comparator;
import java.util.TreeSet;

class DescStringComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1);
    }
}

public class EX04_DescendingStringTreeSet {

    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>(new DescStringComparator());
        t.add("A");
        t.add("Z");
        t.add("K");
        t.add("B");
        t.add("L");
        System.out.println(t);
    }
}
