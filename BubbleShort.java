class BubbleShort{
	public static void printNum(int[]arr){
		System.out.println("Shorted array is :");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args){
		int[] arr = {7,8,3,2,1};
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-i-1; j++){
				// swap
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		// call the method
		printNum(arr);
	}
}