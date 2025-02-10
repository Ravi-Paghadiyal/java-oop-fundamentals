/**
 * Definition: 
 * Polymorphism in Java allows a single interface to be used for different data types.
 * It enables code reusability and flexibility by allowing a method or operator to perform differently based on the context.
 *
 
 * There are two types of polymorphism:
 * 1. Compile-time polymorphism (Method Overloading)
 * 2. Runtime polymorphism (Method Overriding)
 *
 
 * Rules of Polymorphism:
 * 1. Method Overloading:
 *    - Methods must have the same name but different parameter lists.
 *    - Can have different return types, but the parameter list must differ.
 *
 * 2. Method Overriding:
 *    - The method signature in the subclass must be the same as in the parent class.
 *    - The method in the child class should have the same return type (or covariant return type).
 *    - The method in the child class cannot have a weaker access modifier.
 *    - The method in the child class should not throw a broader exception than the parent class.
 */


// Example 1: Method Overloading (Compile-time Polymorphism)
class MathOperations {
    // Overloaded method with two int parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}



// Example 2: Method Overriding (Runtime Polymorphism)
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Demonstrating method overloading
        MathOperations math = new MathOperations();
        System.out.println("Sum of 2 numbers: " + math.add(5, 10));
        System.out.println("Sum of 3 numbers: " + math.add(5, 10, 15));

        // Demonstrating method overriding
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls Animal's method
        
        Animal myDog = new Dog(); // Upcasting
        myDog.makeSound(); // Calls Dog's overridden method
    }
}
