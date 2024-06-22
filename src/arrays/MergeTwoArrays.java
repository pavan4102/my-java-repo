package arrays;

import java.util.Scanner;

public class MergeTwoArrays {
    public static void mergeSortedArrays(int[] arr1,int[] arr2){
        int[] res= new int[arr1.length + arr2.length];
        int i=0, j=0, k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr2[j]<=arr1[i]){
                res[k++]= arr2[j++];
            }
            else{
                res[k++]=arr1[i++];
            }
        }
            while(j<arr2.length){
                res[k++]= arr2[j++];
            }
            while(i<arr1.length){
                res[k++]= arr1[i++];
            }
        for (int n = 0; n < res.length; n++) {
            System.out.print(res[n] + " ");
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
        mergeSortedArrays(arr1, arr2);
        scan.close();
        }
}
