package arrays;

import java.util.Scanner;

public class KLargestSubArray {
    public static void kSubArrays(int[] arr, int k) {
        for (int size = arr.length; size >= 1; size--) {
            for (int i = 0; i <= arr.length - size; i++) {
                int sum = 0;
                for (int j = i; j < i + size; j++) {
                    sum = sum + arr[j];
                }
                if (sum == k) {
                    for (int j = i; j < i + size; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the value of k");
        int k = scan.nextInt();
        kSubArrays(arr, k);
        scan.close();
    }
}
