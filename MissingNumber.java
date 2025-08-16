import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array (n): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Missing numbers in the range " + min + " to " + max + ":");
        boolean missingFound = false;
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
                missingFound = true;
            }
        }

        if (!missingFound) {
            System.out.println("No missing numbers.");
        }
    }
}
