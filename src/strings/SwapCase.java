package strings;

import java.util.Scanner;

public class SwapCase {
    public static void swap(String s) {
        String t = "";
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (ch >= 'a' && ch <= 'z') {
                t = t + (char) (ch - 32);
            } 
            else if(ch >= 'A' && ch <= 'Z'){
                t = t + (char)(ch+32);
            }
            else{
                t=t+ch;
            }
        }
        System.out.println("The Swap Case string is :");
        System.out.println(t);
    }

    /*
     * Input:
     * Enter the string :
     * hElLo
     * Output:
     * The Uppercase string is :
     * HeLlO
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        swap(s);
        scan.close();
    }

}
