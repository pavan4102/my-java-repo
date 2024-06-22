package arrays;

import java.util.Scanner;

public class PrintAllSubArray {
    public static void printSubArrays(int[] arr, int size) {
        for (int i = 0; i <= arr.length - size; i++) {
            for (int j = i; j < i + size; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int size = 1; size <= arr.length; size++) {
            printSubArrays(arr, size);
        }
        scan.close();
    }

}
