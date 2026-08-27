package com.chay.corejava.oops.inheritance;

/**
 * Concept: Inheritance lets a subclass reuse fields/methods of a superclass
 * via `extends`, and override behavior where needed.
 */
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // calling the parent constructor
    }

    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }
}

public class EX00_BasicInheritance {
    public static void main(String[] args) {
        Animal a = new Animal("Generic Animal");
        Animal d = new Dog("Rex"); // upcasting - reference type Animal, object type Dog

        a.makeSound();
        d.makeSound(); // runtime polymorphism: Dog's version runs, not Animal's
    }
}

/*
Sample output:
Generic Animal makes a sound
Rex barks
*/
