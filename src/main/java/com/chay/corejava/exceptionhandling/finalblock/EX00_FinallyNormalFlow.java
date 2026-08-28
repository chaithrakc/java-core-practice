package com.chay.corejava.exceptionhandling.finalblock;

public class EX00_FinallyNormalFlow {
    public static void main(String[] args){
        try{
            System.out.println("try-block");
        }catch (ArithmeticException ae){
            System.out.println("catch-block");
        }finally {
            System.out.println("finally-block");
        }
    }
}
