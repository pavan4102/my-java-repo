package arrays;

import java.util.Scanner;

public class LargestRepeatingNum {
    public static void Largest(int[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Largest(arr);
        scan.close();
    }
}
