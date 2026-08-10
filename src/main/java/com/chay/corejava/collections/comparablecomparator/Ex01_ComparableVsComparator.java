package com.chay.corejava.collections.comparablecomparator;

import java.util.*;

/**
 * Concept:
 * - Comparable (compareTo): defines the DEFAULT natural sorting order for a
 *   class. You implement it inside the class itself. Only one natural order
 *   is possible per class.
 * - Comparator (compare): defines a CUSTOM sorting order, written as a
 *   separate object. You can create as many Comparators as you like for the
 *   same class, to sort by different fields.
 */
class Employee implements Comparable<Employee> {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Natural order: by name
    @Override
    public int compareTo(Employee other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }
}

public class Ex01_ComparableVsComparator {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Chaithra", 25),
                new Employee("Amit", 30),
                new Employee("Bala", 22)
        ));

        Collections.sort(employees); // uses Comparable -> natural order (by name)
        System.out.println("Sorted by name (Comparable): " + employees);

        employees.sort(Comparator.comparingInt(e -> e.age)); // custom order (by age)
        System.out.println("Sorted by age (Comparator): " + employees);
    }
}

/*
Sample output:
Sorted by name (Comparable): [Amit(30), Bala(22), Chaithra(25)]
Sorted by age (Comparator): [Bala(22), Chaithra(25), Amit(30)]
*/
