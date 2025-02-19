class BankInterest{
	//instancs variable
	private double principal;
	private double rate;
	private double time;
	
	// cunstructor 
	public BankInterest(double principal, double rate, double time){
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}
	
	// methods 
	public double calculateAmount(){
		return principal * Math.pow(1 + rate / 100 , time);
	}
		
class Main{
		// Main Program
		public static void main(String args[]){
			
			double principal = 5000; // Principal Amount
			double rate = 0.065; // Rate of Interest 
			double time =  5; // years
			
			BankInterest obj = new BankInterest(principal,rate,time);
			
			double totalAmount = obj.calculateAmount();
			
			System.out.println("Total Amount after "+time+ " years : %.2f"+totalAmount);
		}
	
}
}