package com.chay.corejava.exceptionhandling.finalblock;

public class EX02_FinallyExceptionNotMatched {
    public static void main(String[] args) {
        try {
            System.out.println("try-block");
            System.out.println(10 / 0); // Arithmetic Exception
        } catch (NullPointerException ne) {
            System.out.println("catch-block");
        } finally {
            System.out.println("finally-block");
        }
    }
}
