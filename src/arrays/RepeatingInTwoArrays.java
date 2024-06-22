package arrays;

import java.util.Scanner;

public class RepeatingInTwoArrays {
    public static void repeatingNum(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                j++;
            }
            else if(arr1[i]==arr2[j]){
                System.out.println(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }

        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no of elements of array 1");
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scan.nextInt();
        }
        System.out.println("enter the no of elements of array 2");
        int m = scan.nextInt();
        int[] arr2 = new int[m];
        for(int j=0;j<arr2.length;j++){
            arr2[j]=scan.nextInt();
        }
        repeatingNum(arr1, arr2);
      }
 }