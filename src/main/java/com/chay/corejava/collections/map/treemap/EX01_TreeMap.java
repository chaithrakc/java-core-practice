package com.chay.corejava.collections.map.treemap;

import java.util.TreeMap;

public class EX01_TreeMap {
    public static void main(String[] args) {
        // TreeMap is a sorted map, it sorts the keys in natural order.
        // It does not allow null keys but allows null values.

        TreeMap<Object, Object> sortedMap = new TreeMap<>();
        sortedMap.put(100, "zzz");
        sortedMap.put(103, "yyy");
        sortedMap.put(101, "xxx");
        sortedMap.put(104, 106);
        sortedMap.put(107, null);
        System.out.println(sortedMap); // {101=xxx, 100=zzz, 103=yyy, 104=106, 107=null}

        // sortedMap.put("FFF", "xxx"); // ClassCastException (CCE) - because we are
        // trying to add a String key to a
        // TreeMap that already has Integer keys. TreeMap cannot compare Integer and
        // String keys.

        // sortedMap.put(null, "xxx"); // NullPointerException (NPE) - because TreeMap
        // does not allow null keys on
        // non-empty TreeMaps.

        System.out.println(sortedMap); // {100=zzz, 101=xxx, 103=yyy, 104=106, 107=null}
    }
}
