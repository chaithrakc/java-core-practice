package com.chay.corejava.collections.comparablecomparator;

import java.util.TreeSet;

class CastEmployee implements Comparable<CastEmployee> {
    String ename;
    Integer salary;

    CastEmployee(String ename, Integer salary) {
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public int compareTo(CastEmployee obj) {
        CastEmployee e2 = (CastEmployee) obj;
        Integer sal1 = this.salary;
        Integer sal2 = e2.salary;
        String ename1 = this.ename;
        String ename2 = e2.ename;

        if (sal1 < sal2)
            return -1;
        else if (sal1 > sal2)
            return +1;
        else
            return ename1.compareTo(ename2);
    }

    @Override
    public String toString() {
        return "Ename:" + ename + ", Salary:" + salary;
    }
}

public class EX01_EmployeeNaturalOrder {
    public static void main(String[] args) {
        CastEmployee e1 = new CastEmployee("Sai", 50_000);
        CastEmployee e2 = new CastEmployee("Chai", 40_000);
        CastEmployee e3 = new CastEmployee("Jake", 50_000);
        CastEmployee e4 = new CastEmployee("Jin", 60_000);
        CastEmployee e5 = new CastEmployee("Sandra", 100_000);

        TreeSet<CastEmployee> t = new TreeSet<>();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        System.out.println(t);
        // [Ename:Chai, Salary:40000,
        // Ename:Jake, Salary:50000,
        // Ename:Sai, Salary:50000,
        // Ename:Jin, Salary:60000,
        // Ename:Sandra, Salary:100000]
    }
}
