package arrays;

import java.util.Scanner;

public class FindKInSubArray {
    public static void kSubArrays(int[] arr, int size, int k) {
        int count = 0;
        for (int i = 0; i <= arr.length - size; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                sum = sum + arr[j];
            }
            if (sum == k) {
                count++;
            }
        }
        System.out.println(count);
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
        System.out.println("enter the size of sub array");
        int size = scan.nextInt();
        System.out.println("enter the value of k");
        int k = scan.nextInt();
        kSubArrays(arr, size, k);
        scan.close();
    }
}
