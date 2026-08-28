package com.chay.corejava.exceptionhandling;

 public class EX00_TryCatch {
     public static void main(String[] args) {
         System.out.println("statement...1");
         try {
             System.out.println(10 / 0); // ArithmeticException
         }catch(ArithmeticException ae){
             System.out.println(10/2);
         }
         System.out.println("statement...3");
    }
 }


