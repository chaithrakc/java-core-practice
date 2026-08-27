package com.chay.corejava.collections.set;

import java.util.HashSet;

class EX00_HashSet {

    public static void main(String[] args) {
        HashSet h = new HashSet();

        h.add("B");
        h.add("C");
        h.add("D");
        h.add("Z");
        h.add(null);
        h.add(10);

        System.out.println(h.add("Z"));   // false
        System.out.println(h); // [null, B, C, D, Z, 10]
    }
}
