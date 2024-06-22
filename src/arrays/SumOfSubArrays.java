package arrays;

import java.util.Scanner;

public class SumOfSubArrays {
    public static void sumSubArrays(int[] arr, int size){
        for(int i=0;i<=arr.length-size;i++){
            int sum=0;
            for(int j=i;j<i+size;j++){
                sum = sum+arr[j];
            }
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= scan.nextInt();
        }
        int size= scan.nextInt();
        sumSubArrays(arr,size);
    }

}
