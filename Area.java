class Area{
	 public int area(int l){
		return l * l;
	}
	public int area(int l , int b){
		return l * b;
	}
	public static void main(String args[])
	{
		Area ans = new Area();
		
		int AreaofSquare = ans.area(4);
		int AreaofRactangle = ans.area(4,5);
		
		System.out.println("Area of Square: "+AreaofSquare);
		System.out.println("Area of Rectangle: "+AreaofRactangle);
	}
}