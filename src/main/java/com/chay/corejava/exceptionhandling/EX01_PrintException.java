package com.chay.corejava.exceptionhandling;

public class EX01_PrintException {
    public static void main(String[] args){
        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            e.printStackTrace(); // ArithmeticException: / by  zero
                                // at EX01_PrintException.main(EX01_PrintException.java:6)
            System.out.println(e); // ArithmeticException: / by zero
            System.out.println(e.getMessage()); // / by zero
        }
    }
}
