package loops;
import java.util.Scanner;

public class MultiplesOfNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = scan.nextInt();
        System.out.println("enter the value of first number");
        int a=scan.nextInt();
        System.out.println("enter the value of second number");
        int b=scan.nextInt();
        for(int i=1;i<=n;i++){
            if(i%a==0 || i%b==0){
                System.out.println(i);
            }
        }

        
    }

}
