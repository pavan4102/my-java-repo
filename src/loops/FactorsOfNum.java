package loops;

import java.util.Scanner;

public class FactorsOfNum {
    public static void printFactors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n= scan.nextInt();
        printFactors(n);
    }
}
