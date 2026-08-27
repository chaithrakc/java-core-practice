package com.chay.corejava.collections.array;

import java.util.Arrays;

class ArraySortDemo {

    public static void main(String[] args) {
        int[] a = {10, 5, 20, 1, 6};
        System.out.println("primitive Array before Sorting:" + Arrays.toString(a)); // [10, 5, 20, 1, 6]

        Arrays.sort(a);
        System.out.println("primitive Array After Sorting: " + Arrays.toString(a)); //[1, 5, 6, 10, 20]

        String[] s = {"A", "Z", "B"};
        System.out.println("Object Array before Sorting: " + Arrays.toString(s)); // [A, Z, B]

        Arrays.sort(s);
        System.out.println("Object Array After Sorting: " + Arrays.toString(s)); //  [A, B, Z]

    }
}
