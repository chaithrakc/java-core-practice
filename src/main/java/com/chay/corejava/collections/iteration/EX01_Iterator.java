package com.chay.corejava.collections.iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class EX01_Iterator {

    public static void main(String[] args) {
        ArrayList<Integer> arr_list_int = new ArrayList<>();

        //initializing the arraylist
        for (int i = 0; i <= 10; i++) {
            arr_list_int.add(i);
        }
        System.out.println(arr_list_int); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        Iterator<Integer> itr = arr_list_int.iterator();
        while (itr.hasNext()) {
            Integer the_num = itr.next();
            if (the_num % 2 == 0) {
                System.out.println(the_num); // 0 2 4 6 8 10
            } else {
                itr.remove(); // remove odd numbers
            }
        }
        System.out.println(arr_list_int); // [0, 2, 4 6, 8, 10]
    }
}
