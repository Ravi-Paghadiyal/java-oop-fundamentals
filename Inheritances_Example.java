// This is a simple example of inheritance
// In Java, there are different types of inheritance:
// 1. Single Inheritance
// 2. Multilevel Inheritance
// 3. Hierarchical Inheritance
// Note: Java does not support Multiple Inheritance with classes to avoid ambiguity.

// Rules of Inheritance in Java:
// 1. A subclass inherits all non-private members (fields and methods) from its superclass.
// 2. A subclass can override inherited methods to provide specific behavior.
// 3. Java does not support multiple inheritance with classes to prevent ambiguity, but it supports multiple inheritance with interfaces.
// 4. The "super" keyword can be used to call parent class methods and constructors.
// 5. A subclass constructor must call the superclass constructor explicitly using "super()" if the superclass has a parameterized constructor.
// 6. Java follows a hierarchical inheritance model where multiple subclasses can inherit from a single superclass.

// 1. Single Inheritance Example
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

// 2. Multilevel Inheritance Example
class Mammal extends Animal {
    public void walk() {
        System.out.println("Mammals walk on land");
    }
}

class Human extends Mammal {
    public void speak() {
        System.out.println("Humans can speak");
    }
}

// 3. Hierarchical Inheritance Example
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat says Meow Meow !!");
    }
}

// This is our main method
public class InheritanceExample {
    public static void main(String[] args) {
        // Single Inheritance
        Dog obj1 = new Dog();
        obj1.eat();
        obj1.bark();

        // Multilevel Inheritance
        Human obj2 = new Human();
        obj2.eat();
        obj2.walk();
        obj2.speak();

        // Hierarchical Inheritance
        Cat obj3 = new Cat();
        obj3.eat();
        obj3.meow();
    }
}
