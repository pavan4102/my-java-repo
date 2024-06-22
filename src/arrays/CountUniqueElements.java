package arrays;

import java.util.Scanner;

public class CountUniqueElements {
    public static void Unique(int[] arr) {
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count == 1)
                    count2++;
                count = 1;
            }
        }
        if (count == 1) {
            count2++;
        }
        System.out.println(count2);
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
