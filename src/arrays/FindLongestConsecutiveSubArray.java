package arrays;

// Given an array of integers, write a program to print the length consecutive subarrays

import java.util.Scanner;

public class FindLongestConsecutiveSubArray {
    public static void LongestConsecutiveSubArray(int[] arr) {
        System.out.println("The consecutive subarray are :");
        int count = 1, max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        if (count > max) {
            max = count;
        }
        System.out.println(arr);
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
     * The Longest consecutive subarray are :
     * 4
     */
    void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        LongestConsecutiveSubArray(arr);
        scan.close();
    }
}
