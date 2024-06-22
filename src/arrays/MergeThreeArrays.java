package arrays;

import java.util.Scanner;

public class MergeThreeArrays {
    public static void mergeArrays(int[] arr1, int[] arr2, int[] arr3){
        int[] res= new int[arr1.length + arr2.length+ arr3.length];
        int i=0,k=0;
        while(k<res.length){
            if(i<arr1.length){
                res[k]= arr1[i];
                k++;
            }
            if(i<arr2.length){
                res[k]= arr2[i];
                k++;
            }
            if(i<arr3.length){
                res[k]=arr3[i];
                k++;
            }
            i++;
        }
        for (int n = 0; n < res.length; n++) {
            System.out.print(res[n] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the no of elements of array 1");
        int n = scan.nextInt();
        int[] arr1= new int[n];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=scan.nextInt();
        }
        System.out.println("enter the no of elements of array 2");
        int m = scan.nextInt();
        int[] arr2= new int[m];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=scan.nextInt();
        }
        System.out.println("enter the no of elements of array 3");
        int x = scan.nextInt();
        int[] arr3= new int[x];
        for(int i=0;i<arr3.length;i++){
            arr3[i]=scan.nextInt();
        }
        mergeArrays(arr1, arr2, arr3);
    }

}
