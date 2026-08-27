package com.chay.corejava.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo{
    public static void main(String[] args){
        Collection<String> str_arr0 = new ArrayList<>();

        // 1. boolean add(Object o)
        str_arr0.add("DataHiding");
        str_arr0.add("Abstraction");
        System.out.println(str_arr0);

        //2. boolean addAll(Collection c)
        Collection<String> str_arr1 = new ArrayList<>();
        str_arr1.add("Encapsulation");
        str_arr1.add("Inheritance");
        str_arr0.addAll(str_arr1);
        System.out.println(str_arr0);

        //3. boolean remove(Object o)
        str_arr0.remove("Encapsulation");
        System.out.println(str_arr0);

        //4. boolean removeAll(Collection c)
        Collection<String> str_arr2 = new ArrayList<>();
        str_arr2.add("Abstraction");
        str_arr2.add("Inheritance");
        str_arr0.removeAll(str_arr2);
        System.out.println(str_arr0);

        //5. boolean retainAll(Collection c)
        str_arr0.add("Abstraction");
        str_arr0.add("Encapsulation");
        str_arr0.add("Inheritance");

        Collection<String> str_arr3 = new ArrayList<>();
        str_arr3.add("Encapsulation");
        str_arr3.add("Inheritance");
        str_arr0.retainAll(str_arr3);
        System.out.println(str_arr0);

        //6. void clear()
        str_arr0.clear();
        System.out.println(str_arr0);

        //7. boolean isEmpty()
        System.out.println(str_arr0.isEmpty());

        //8. int size()
        System.out.println(str_arr1.size());

        //9. boolean contains(Object o)
        System.out.println(str_arr1.contains("Encapsulation"));
        System.out.println(str_arr1.contains("DataHiding"));

        //10. boolean containsAll(Collection c)


        //11. Object[] toArray()
        Object[] obj_arr = str_arr1.toArray();
        System.out.println(Arrays.toString(obj_arr));

        //12. Iterator Iterator()
        Iterator<String> itr = str_arr1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
