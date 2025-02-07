// Rules of Encapsulation in Java
// 1. Declare variables as private to prevent direct access.
// 2. Provide public getter and setter methods to access and update variables.
// 3. Use constructors to initialize objects if needed.
// 4. Implement validation inside setters to ensure data integrity.
// 5. Encapsulation improves security and maintainability.




// Simple Encapsulation Example
class SimpleExample {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}


// Encapsulation Example in Java
class Person {
    private String name;  // Private variable
    private int age;      // Private variable

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}






// Main class to test encapsulation
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Testing Simple Encapsulation Example
        SimpleExample simple = new SimpleExample();
        simple.setNumber(100);
        System.out.println("Simple Example Number: " + simple.getNumber());
        
        // Testing Person Class
        Person p = new Person("John", 25);
        
        // Accessing private variables via getter methods
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        
        // Modifying private variables via setter methods
        p.setName("Alice");
        p.setAge(30);
        
        System.out.println("Updated Name: " + p.getName());
        System.out.println("Updated Age: " + p.getAge());
    }
}
