package com.chay.corejava.basics.datatypes;

/**
 * Concept: Local variables do NOT get default values like instance/static
 * variables do. They must be explicitly initialized before use, otherwise
 * the compiler throws an error.

 * Best practice: initialize local variables at the point of declaration,
 * at least with a sensible default, since there's no guarantee every
 * branch of an if/else (or other block) will execute at runtime.
 */

public class EX00_LocalVariableInit {

    public static void main(String[] args){
        int x; // not yet initialized - fine, as long as we assign before reading

        if(args.length > 0){
            x = 10;
        }else{
            x = 20;
        }
        System.out.println(x);
    }
}
