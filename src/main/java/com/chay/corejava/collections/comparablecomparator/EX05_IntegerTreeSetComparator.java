package com.chay.corejava.collections.comparablecomparator;

import java.util.Comparator;
import java.util.TreeSet;

class DescIntegerComparator implements Comparator<Integer>{
   public int compare(Integer new_obj, Integer existing_obj){
       // return new_obj.compareTo(existing_obj); // [0, 5, 10, 15, 20]
       // return -new_obj.compareTo(existing_obj); // [20, 15, 10, 5, 0]
       // return existing_obj.compareTo(new_obj); // [20, 15, 10, 5, 0]
       // return -existing_obj.compareTo(new_obj); // [0, 5, 10, 15, 20]
       // return -1; // [10, 5, 15, 0, 20]
       // return +1; // [20, 0, 15, 5, 10]
       return 0; // [20]
   }
}

public class EX05_IntegerTreeSetComparator {
    public static void main(String[] args){
        TreeSet<Integer> t = new TreeSet<>(new DescIntegerComparator());
        t.add(20);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(10);
        System.out.println(t); // [20, 15, 10, 5, 0]
    }
}
