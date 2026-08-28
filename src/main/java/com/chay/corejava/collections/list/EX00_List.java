package com.chay.corejava.collections.list;

import java.util.LinkedList;

public class EX00_List {

    public static void main(String[] args) {
        LinkedList<Object> l = new LinkedList<>();
        l.add("durga");
        l.add(30);
        l.add(null);
        l.add("durga");
        System.out.println(l); // [durga, 30, null, durga]

        l.set(0, "software");
        System.out.println(l); // [software, 30, null, durga]

        l.add(0, "sainadh");
        System.out.println(l); // [sainadh, software, 30, null, durga]

        l.removeLast();
        System.out.println(l); // [sainadh, software, 30, null]

        l.addFirst("casey");
        System.out.println(l); // [casey, sainadh, software, 30, null]
    }
}
