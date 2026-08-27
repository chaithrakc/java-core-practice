package com.chay.corejava.collections.iteration;

import java.util.Enumeration;
import java.util.Vector;

public class EX00_Enumeration {

    public static void main(String[] args) {
        Vector<Integer> v_int = new Vector<>();

        // initializing the vector
        for (int i = 0; i <= 10; i++) {
            v_int.addElement(i);
        }

        //traversing the vector - log even numbers only
        Enumeration<Integer> e_int = v_int.elements();
        while (e_int.hasMoreElements()) {
            Integer the_int = e_int.nextElement();
            if (the_int % 2 == 0) {
                System.out.println(the_int); // 0 2 4 6 8 10
            }
        }

        System.out.println(v_int); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}
