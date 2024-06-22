package arrays;

import java.util.Scanner;

public class maxpairsum {
    public static int largest(int[] ar) {
        int a = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > a) {
                ar[i] = a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            ar[i] = scan.nextInt();
        }
        int res = largest(ar);
        System.out.println(res);
        scan.close();

    }

}
