package arrays;

import java.util.Scanner;

public class ArrayPairs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of array.");
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }
    for(int i=0;i<n;i++){
        for(int j= i+1;j<n;j++){
            System.out.println(arr[i] + " " + arr[j]);
        }
    }
    }
}
