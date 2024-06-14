package arrays;

import java.util.Scanner;

public class SumOfElements {
    public static int findSum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of array.");
    for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
    }

    //SumOfElements se = new SumOfElements();
    int res = findSum(arr);
    System.out.println(res);
    }

    }

