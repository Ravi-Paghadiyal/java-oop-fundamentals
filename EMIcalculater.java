class EMIcalculater{
	
	public static void main(String args[]){
		if(args.length != 1){
			System.out.println("Please Enter First Price [X]");
			return;
		}
		else{
			
			//Principal Amount of Loan
			double Principal = Double.parseDouble(args [0]);
			
			// Rate of Interest of Loan
			double RateOfInterest = 0.10; // 10%
			int years = 5;
			
			double interstAmount = Principal * (RateOfInterest * years) ;
			
			// TotalAmount 
			double totalAmount = Principal + interstAmount;
			
	 		// EMI 5 Years [60 months]
			double EMI = totalAmount / 60;
			System.out.println("Principal Amount : "+Principal+"   "+"EMI : "+EMI);
		}
	}
}