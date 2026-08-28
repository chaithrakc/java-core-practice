package com.chay.corejava.collections.map.hashtable;

import java.util.Hashtable;

class Temp {
    Integer i;

    Temp(Integer i) {
        this.i = i;
    }

    public int hashCode() {
        return i;
    }

    public String toString() {
        return i + "";
    }
}

public class EX00_HashTable {
    public static void main(String[] args) {
        Hashtable<Object, Object> h = new Hashtable<>();

        h.put(new Temp(5), "A");
        h.put(new Temp(2), "B");
        h.put(new Temp(6), "C");
        h.put(new Temp(15), "D");
        h.put(new Temp(23), "E");
        h.put(new Temp(16), "F");
        System.out.println(h); // {5=A, 2=B, 6=C, 15=D, 23=E, 16=F} - order is not guaranteed

        h.put("Naviga", null); // NullPointerException (NPE) - because Hashtable does not allow null values.
    }

}
