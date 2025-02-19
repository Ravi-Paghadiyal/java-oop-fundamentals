import java.util.*;

public class Billcalculater{
    public static void main(String[] args) {
		
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter the number of items
        System.out.println("Enter Number of Items:");
        int numItems = sc.nextInt();
        
        double totalBill = 0.0;
        
        // Process each item
        for (int i = 1; i <= numItems; i++) {
			

            System.out.println("Enter Product Code (1-4 for specific items, 5 or more for others):");
            int productCode = sc.nextInt();
            
            System.out.println("Enter Product Price:");
            double price = sc.nextDouble();
            
            double taxRate = 0.0;
            
            // Determine the tax rate based on the product code
            switch (productCode) {
                case 1:
                    taxRate = 0.02; // 2% for seat covers
                    break;
                case 2:
                    taxRate = 0.03; // 3% for steering wheel covers
                    break;
                case 3:
                    taxRate = 0.04; // 4% for car lighting
                    break;
                case 4:
                    taxRate = 0.025; // 2.5% for air purifiers
                    break;
                default:
                    taxRate = 0.012; // 1.2% for all other items
                    break;
            }
            
            // Calculate the total cost of the item including tax
            double totalPrice = price + (price * taxRate);
            
            // Print the item details
            System.out.printf("Product Code : %d\n",productCode);
            System.out.printf("Product Price : %.2f\n",price);
            System.out.printf("Tax Rate : %.2f%%\n", taxRate * 100);
            System.out.printf("Total Price (including tax) : %.2f\n", totalPrice);
            System.out.println("--------------------------------------");
            
            // Add to the total bill
            totalBill = totalBill + totalPrice;
        }
        
        // Print the final bill
        System.out.printf("Total Bill (including tax for all items) : %.2f\n", totalBill);
        
        // Close the Scanner object
        sc.close();
    }
}
