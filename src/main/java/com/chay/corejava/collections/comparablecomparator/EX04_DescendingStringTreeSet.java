package com.chay.corejava.collections.comparablecomparator;

import java.util.Comparator;
import java.util.TreeSet;

class DescStringComparator implements Comparator{
    public int compare(Object obj1, Object obj2){
        String s1 = (String)obj1;
        String s2 = obj2.toString();
        return s2.compareTo(s1);
    }
}

public class EX04_DescendingStringTreeSet {
    public static void main(String[] args){
        TreeSet t = new TreeSet(new DescStringComparator());
        t.add("A");
        t.add("Z");
        t.add("K");
        t.add("B");
        t.add("L");
        System.out.println(t);
    }
}
