package com.chay.corejava.oops.inheritance;

class EX01_ParentChildInitialization
{
    // (3)
    int x=10; // (16)

    // (4)
    {
        m1(); // (17)
        System.out.println("parent"); // (19)
    }

    // (5)
    EX01_ParentChildInitialization()
    {
        System.out.println("parent Constructor: " + y); // (21)
    }

    // (1)
    public static void main(String[] args)
    {
        // (2)
        EX01_ParentChildInitialization p = new EX01_ParentChildInitialization();
        System.out.println("parent main");
    }

    // (6)
    public void m1()
    {
        System.out.println(y);  // (18)
    }

    // (7)
    int y=20;  // (20)
}

class Child extends EX01_ParentChildInitialization
{
    // (10)
    int i=100; // (22)

    // (11)
    {
        m2(); // (23)
        System.out.println("C IIB"); // (25)
    }

    // (12)
    Child()
    {
        System.out.println("child Constructor: " + j); // 28)
    }

    // (8)
    public static void main(String[] args)
    {
        // (9)
        Child c = new Child();
        System.out.println("child main"); // (29)
    }

    // (13)
    public void m2()
    {
        System.out.println(i); // (24)
    }

    // (14)
    {
        System.out.println("C S IIB"); // (26)
    }

    // (15)
    int j=200; // (27)
}
