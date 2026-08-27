package com.chay.corejava.collections.list;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] asgs) {
        Vector vector = new Vector();
        System.out.println(vector.capacity()); // 10

        for (int i = 1; i <= 10; i++) {
            vector.addElement(i);
        }
        System.out.println(vector.capacity()); // 10

        vector.addElement("C");
        System.out.println(vector.capacity()); // 20
        System.out.println(vector.size()); // 11
        System.out.println(vector); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, C]

        vector.removeElement(9);
        System.out.println(vector); // [1, 2, 3, 4, 5, 6, 7, 8, 10, C]

        vector.removeElementAt(3);
        System.out.println(vector); // [1, 2, 3, 5, 6, 7, 8, 10, C]

        vector.removeAllElements();
        System.out.println(vector); // []
    }
}
