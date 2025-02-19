public class Bank{
	
	double amount;
	double rate;
	int time;
	
	public Bank(double amount, double rate, int time){
		this.amount = amount;
		this.rate = rate;
		this.time = time;
	}
	double interestCal(){
		return (amount *rate * time) / 100;  // 6.5 * 5 = 32.5 / 100 = 0.325
	}
	
	public static void main(String[] args){
		double amount = 5000;
		double rate = 6.5; // 6.5 [ 0.65 * 5 = 0.325 ]
		int time = 5;
		
		Bank obj = new Bank(amount,rate,time);
		
		double intersstOfyears = obj.interestCal(); // 5 Years Interest
		double finalAmount = amount + intersstOfyears;
		
		System.out.println("Final amount of "+time+" Years Rs : "+finalAmount);
	}
}