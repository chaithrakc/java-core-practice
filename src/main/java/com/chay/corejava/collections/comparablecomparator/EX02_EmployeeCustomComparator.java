package com.chay.corejava.collections.comparablecomparator;

import java.util.Comparator;
import java.util.TreeSet;

class EYEmployee{
    String emp_name;
    Integer age;
    EYEmployee(String emp_name, Integer age){
        this.emp_name = emp_name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "EmpName:" + emp_name + ", Age:" + age;
    }
}

class EYComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        EYEmployee e1 = (EYEmployee) o1;
        EYEmployee e2 = (EYEmployee) o2;

        int name_compare = e1.emp_name.compareTo(e2.emp_name);

        if(name_compare != 0)
            return name_compare; // alphabetical order of emp name

        return -e1.age.compareTo(e2.age); // descending age
    }
}

public class EX02_EmployeeCustomComparator {
    public static void main(String[] args) {
        EYEmployee e1 = new EYEmployee("Sai", 35);
        EYEmployee e2 = new EYEmployee("Chai", 34);
        EYEmployee e3 = new EYEmployee("Jake", 40);
        EYEmployee e4 = new EYEmployee("Jin", 32);
        EYEmployee e5 = new EYEmployee("Chai", 33);

        TreeSet t = new TreeSet(new EYComparator());
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);
        // [EmpName:Chai, Age:34,
        // EmpName:Chai, Age:33,
        // EmpName:Jake, Age:40,
        // EmpName:Jin, Age:32,
        // EmpName:Sai, Age:35]
    }
}
