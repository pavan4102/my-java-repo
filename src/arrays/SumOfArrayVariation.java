package arrays;

import java.util.Scanner;

public class SumOfArrayVariation {
    public static int largestnum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }    
    public static int smallestnum(int[] arr){
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }    
    public static int sum(int[] arr){
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
    int max = largestnum(arr);
    int min = smallestnum(arr);
    int sum = sum(arr);
    System.out.println(sum-max);
    System.out.println(sum-min);
    scan.close();
    }
}
