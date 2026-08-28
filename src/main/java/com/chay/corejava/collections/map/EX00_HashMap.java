package com.chay.corejava.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EX00_HashMap {

    public static void main(String[] args) {
        HashMap<String, Integer> theHashmap = new HashMap<>();
        theHashmap.put("Windows", 11);
        theHashmap.put("Macintosh", 25);
        theHashmap.put("Linux", 12);
        theHashmap.put("Android", 200);
        System.out.println(theHashmap); // {Linux=12, Macintosh=25, Windows=11, Android=200}

        // hash collision
        System.out.println(theHashmap.put("Windows", 12)); // 11 - old value 11 is returned and replaced by 12.

        Set<String> theKeys = theHashmap.keySet();
        System.out.println(theKeys); // [Linux, Macintosh, Windows, Android]

        Collection<Integer> theValues = theHashmap.values();
        System.out.println(theValues); // [12, 25, 12, 200]

        Set<Map.Entry<String, Integer>> entrySet = theHashmap.entrySet();
        Iterator<Map.Entry<String, Integer>> itr = entrySet.iterator();

        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println(entry.getKey() + "----" + entry.getValue());
            // Linux----12
            // Macintosh----25
            // Windows----12
            // Android----200

            if (entry.getKey().equals("Macintosh")) {
                entry.setValue(10); // Macintosh values becomes 10

            }
        }
        System.out.println(theHashmap); // {Linux=12, Macintosh=10, Windows=12, Android=200}
    }
}
