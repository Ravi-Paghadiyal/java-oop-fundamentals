class Hypoten{
	public static void main(String args[])
	{
		if(args.length != 2)
		{
			System.out.println("First Enter Value`s");
			return;
		}
		double x = Double.parseDouble(args [0]);
		double y = Double.parseDouble(args [1]);
		
		double Result = Math.sqrt(x * x + y * y);
		
			System.out.println("Hypotens Ans is : "+Result);
	}
}