package arrays;

import java.util.Scanner;

public class secondLargestArray {

    public static int secondlargest(int[] arr) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
                b = a;
                a = arr[i];
            } else if (arr[i] > b && arr[i] != a) {
                b = arr[i];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int res = secondlargest(arr);
        System.out.println(res);
        scan.close();

    }

}
