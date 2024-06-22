package arrays;

import java.util.Scanner;

public class PrintUnique {
    public static void Unique(int[] arr) {
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1)
                    System.out.println(arr[i]);
                count = 1;
            }
        }
        if (count == 1) {
            System.out.println(arr[arr.length - 1]);
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
        Unique(arr);
        scan.close();
    }
}
