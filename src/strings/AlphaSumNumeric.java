package strings;

import java.util.Scanner;

public class AlphaSumNumeric {

    public static void countAll(String s) {
        String t = "";
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ) {
                t = t + s.charAt(i);
        }
        else if(ch>='0' && ch<='9'){
            sum=sum+ch-48;
        }
    }
        System.out.println(t+sum);
 }

    /*
     * Input:
     * Enter the string :
     * he##o
     * Output:
     * The new string : heo
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        countAll(s);
        scan.close();
    }
}

