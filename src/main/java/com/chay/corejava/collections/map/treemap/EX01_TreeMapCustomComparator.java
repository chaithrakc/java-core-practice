package com.chay.corejava.collections.map.treemap;

import java.util.TreeMap;
import java.util.Comparator;

class StrDescComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1); // reverse order
    }
}

public class EX01_TreeMapCustomComparator {
    public static void main(String[] args) {
        TreeMap<String, Integer> t = new TreeMap<>(new StrDescComparator());
        t.put("XXX", 10);
        t.put("AAA", 20);
        t.put("ZZZ", 30);
        t.put("LLL", 40);

        System.out.println(t); // {ZZZ=30, XXX=10, LLL=40, AAA=20} - keys sorted in descending order

    }
}
