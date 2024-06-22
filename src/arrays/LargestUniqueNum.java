package arrays;

import java.util.Scanner;

public class LargestUniqueNum {
    public static void Largest(int[] arr) {
        int count = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1) {
                    System.out.println("The largest number among the unique elements in array is " + arr[i + 1]);
                    break;
                }
                count = 1;
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
