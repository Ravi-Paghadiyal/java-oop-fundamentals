public class ComplexNumber {
    private double real;
    private double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Add method
    ComplexNumber add(ComplexNumber other) {  
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Subtract method
    ComplexNumber sub(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Multiply method
    ComplexNumber mul(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Override toString method
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
    
    // Display method
    public void display() {
        System.out.println(this);  // Uses toString method
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(5, 4);
        ComplexNumber c2 = new ComplexNumber(2, 2);

        ComplexNumber sum = c1.add(c2);
        ComplexNumber sub = c1.sub(c2);
        ComplexNumber multi = c1.mul(c2);

        // String first =  c1.toString();
        // String second = c2.toString();
        // System.out.println(first);
        // System.out.println(second);

        c1.display();
        c2.display();
        System.out.println("Addition : " + sum);
        System.out.println("Subtraction : " + sub);
        System.out.println("Multiplication : " + multi);
    }
}
