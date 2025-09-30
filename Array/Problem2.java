import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // input array elements
        System.out.print("Input array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                ascending = false;

            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false;

            }
        }

       

        if (ascending) {
            System.out.println("Array is sorted in Ascending Order!");
        } else if (descending) {
            System.out.println("Array is sorted in Descending Order!");
        } else {
            System.out.println("Array not sorted !");
        }
    }
}
