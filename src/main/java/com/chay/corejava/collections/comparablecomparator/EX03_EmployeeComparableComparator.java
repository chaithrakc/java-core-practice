package com.chay.corejava.collections.comparablecomparator;

import java.util.Comparator;
import java.util.TreeSet;

class StateFarmEmployee implements Comparable{
    Integer emp_id;
    StateFarmEmployee(Integer emp_id){
        this.emp_id = emp_id;
    }
    @Override
    public int compareTo(Object obj) {
        StateFarmEmployee e2 = (StateFarmEmployee) obj;
        Integer eid1 = this.emp_id;
        Integer eid2 = e2.emp_id;
        return eid1.compareTo(eid2);
    }

    @Override
    public String toString() {
        return "SF-" + emp_id;
    }
}

class DescEmpIdCompartor implements Comparator{
    public int compare(Object o1, Object o2){
        StateFarmEmployee e1 = (StateFarmEmployee) o1;
        StateFarmEmployee e2 = (StateFarmEmployee) o2;
        return e2.compareTo(e1); // return -e1.compareTo(e2);
    }
}

public class EX03_EmployeeComparableComparator {
    public static void main(String[] args){
        StateFarmEmployee e1 = new StateFarmEmployee(200);
        StateFarmEmployee e2 = new StateFarmEmployee(100);
        StateFarmEmployee e3 = new StateFarmEmployee(500);
        StateFarmEmployee e4 = new StateFarmEmployee(500);
        StateFarmEmployee e5 = new StateFarmEmployee(700);

        TreeSet t1 = new TreeSet();
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);

        System.out.println(t1); // [SF-100, SF-200, SF-500, SF-700]

        TreeSet t2 = new TreeSet(new DescEmpIdCompartor());
        t2.add(e1);
        t2.add(e2);
        t2.add(e3);
        t2.add(e4);
        t2.add(e5);
        System.out.println(t2); // [SF-700, SF-500, SF-200, SF-100]

    }
}
