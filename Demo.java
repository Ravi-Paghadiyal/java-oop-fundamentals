import java.util.*;
import mypackage.MaxNumber;

class Demo{
	public static void main(String args[]){
		
		Scanner obj1 = new Scanner(System.in);
		
		System.out.println("Enter first number ");
		int n1 = obj1.nextInt();
		
		System.out.println("Enter Second number ");
		int n2 = obj1.nextInt();
		
		System.out.println("Enter last number ");
		int n3 = obj1.nextInt();
		
		MaxNumber obj = new MaxNumber();
		
		int Max = obj.getMax(n1,n2,n3);
		
		// print the maximum numbers 
		System.out.println(Max);
		
	}
}