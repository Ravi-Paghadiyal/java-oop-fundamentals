public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) return -1; // Not enough elements

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 25};
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}
