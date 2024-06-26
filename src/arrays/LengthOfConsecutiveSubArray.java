package arrays;

import java.util.Scanner;

public class LengthOfConsecutiveSubArray {

    public static void findConsecutiveSubArray(int[] arr) {
        System.out.println("The consecutive subarray are :");
        int count=1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                count++;
            } 
            else {
                System.out.println(count);
                count =1;
            }
        }
        System.out.println(count);
    }

    /*
     * 
     * This program prints all the 0 at the end
     * Input:
     * Enter the number of elements in array :
     * 10
     * Enter the elements of array :
     * 5 2 3 4 9 12 13 14 15 9
     * Output:
     * The consecutive subarray are :
     * 1
     * 3
     * 1
     * 4
     * 1
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        findConsecutiveSubArray(arr);
        scan.close();
    }
}
