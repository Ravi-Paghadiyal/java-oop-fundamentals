public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] mergedArray = new int[length1 + length2];

        // Copying elements of first array
        for (int i = 0; i < length1; i++) {
            mergedArray[i] = arr1[i];
        }

        // Copying elements of second array
        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = arr2[i];
        }

        // Printing the merged array
        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
}
