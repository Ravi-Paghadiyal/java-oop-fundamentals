import java.util.HashSet;

public class SubsetCheck {
    public static boolean isSubset(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            if (!set.contains(num)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 6, 8, 10};
        int[] arr2 = {4, 8, 10};

        if (isSubset(arr1, arr2)) {
            System.out.println("Yes, arr2 is a subset of arr1.");
        } else {
            System.out.println("No, arr2 is not a subset of arr1.");
        }
    }
}
