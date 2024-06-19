package arrays;

import java.util.Scanner;

public class FindKInArrayPair {
    public static void findSum(int[] arr, int k){
        int sum;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum = arr[i] + arr[j];
                if(sum == k){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
         }
        findSum(arr,k);
    }

}
