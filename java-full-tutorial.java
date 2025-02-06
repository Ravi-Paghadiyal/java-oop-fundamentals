/*
Java Object-Oriented Programming (OOP) Details
==============================================

1. Object-Oriented Programming (OOP) Principles:
   - Encapsulation
   - Inheritance
   - Polymorphism
   - Abstraction

2. Primitive and Non-Primitive Data Types in Java:

   - Primitive Data Types (Store simple values, predefined by Java):
     - byte (1 byte, range: -128 to 127)
     - short (2 bytes, range: -32,768 to 32,767)
     - int (4 bytes, range: -2^31 to 2^31-1)
     - long (8 bytes, range: -2^63 to 2^63-1)
     - float (4 bytes, decimal numbers, less precision)
     - double (8 bytes, decimal numbers, higher precision)
     - char (2 bytes, stores a single character)
     - boolean (1 bit, stores true or false)

   Example:
*/
class PrimitiveExample {
    public static void main(String[] args) {
        int num = 10;
        double price = 99.99;
        char letter = 'A';
        boolean isJavaFun = true;
        
        System.out.println("Integer: " + num);
        System.out.println("Double: " + price);
        System.out.println("Char: " + letter);
        System.out.println("Boolean: " + isJavaFun);
    }
}

/*
   - Non-Primitive Data Types (Reference types, user-defined, or built-in objects):
     - String (Stores a sequence of characters)
     - Arrays (Collection of similar data types)
     - Classes (User-defined data types)
     - Interfaces (Abstract types for defining contracts)
     - Collections (ArrayList, HashMap, LinkedList, etc.)

   Example:
*/
class NonPrimitiveExample {
    public static void main(String[] args) {
        String message = "Hello, Java!";
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.println("String: " + message);
        System.out.println("Array Element: " + numbers[2]);
    }
}

/*
3. Object and Class in Java:
   - Object: An instance of a class.
   - Class: A blueprint for objects.

Example:
*/
class Car {
    String brand;
    int speed;

    // Constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 120);
        car1.display();
    }
}

/*
4. Inheritance in Java:
   - Allows a class to inherit properties from another class.
*/
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Example Usage
class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Inherited method
        dog.bark();
    }
}

/*
5. Polymorphism in Java:
   - Method Overloading
   - Method Overriding
*/
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}

// Usage
class PolyTest {
    public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        System.out.println(obj.add(5, 10)); // Calls int version
        System.out.println(obj.add(5.5, 2.3)); // Calls double version
    }
}

/*
6. Abstraction in Java:
   - Abstract Classes
   - Interfaces
*/
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Usage
class AbstractionTest {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}

/*
7. Packages in Java:
   - Used to organize classes.
   - Example: `import java.util.*;`
*/
import java.util.ArrayList;

class PackageExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        System.out.println(list.get(0));
    }
}

/*
8. User-Defined Packages:
   - Custom packages to organize code.
*/
package mypackage;

public class MyClass {
    public void display() {
        System.out.println("User-defined package example");
    }
}

// Usage
import mypackage.MyClass;

class PackageTest {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}

/*
9. Constructors in Java:
   - Special method used to initialize objects.
*/
class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Usage
class ConstructorExample {
    public static void main(String[] args) {
        Person p = new Person("John", 25);
        p.show();
    }
}
