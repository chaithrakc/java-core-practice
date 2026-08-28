package com.chay.corejava.exceptionhandling.finalblock;

public class EX01_FinallyExceptionMatched {
    public static void main(String[] args){
        try{
            System.out.println("try-block");
            System.out.println(10/0); // Arithmetic Exception
        }catch (ArithmeticException ae){
            System.out.println("catch-block");
        }finally {
            System.out.println("finally-block");
        }
    }
}
