package com.chay.corejava.collections.array;

import java.util.Arrays;
import java.util.List;

public class EX01_ArrayToList {

    public static void main(String[] args) {
        String[] the_strings = { "A", "Z", "B" }; // object-type array
        List<String> strList = Arrays.asList(the_strings);
        System.out.println(strList); // [A, Z, B]

        the_strings[0] = "K"; // Array becomes [K, Z, B] , List also becomes [K, Z, B]
        System.out.println(strList);

        strList.set(1, "L"); // List becomes [K, L, B] , Array also becomes [K, L, B]
        System.out.println(Arrays.toString(the_strings));

        // strList.add("Sai"); // USOE : UnsupportedOperationException
        // strList.remove(2); // USOE : UnsupportedOperationException
        strList.set(1, "S"); // [K, L, B] → [K, S, B]
        System.out.println(Arrays.toString(the_strings));

        // strList.set(1, 10); // RuntimeException: ArrayStoreException
    }
}
