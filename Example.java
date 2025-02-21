class Example{
	public static void main(String args[]){
		if(args.length != 1){
			System.out.printf("Enter First Amount :");
			return;
		}
		double amountX = Double.parseDouble(args [0]);
		
		double rateOfInteres = 5.2;
		
		double totalAmount = amountX * (1 + rateOfInteres /100);
		
		// 60 mothns [5 years]
		double EMI = totalAmount / 60;
		
		System.out.printf("Fianl EMI is : "+EMI);
	}
}