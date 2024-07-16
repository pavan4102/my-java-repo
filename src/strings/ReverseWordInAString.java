package strings;

// Write a program to print string in reversed manner
import java.util.Scanner;

public class ReverseWordInAString {

    public static int countWords(String s) {
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static String[] split(String s, int size) {
        int j = 0;
        String t = "";
        String[] arr = new String[size];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                t = t + s.charAt(i);
            } else if (t.length() > 0) {
                arr[j] = t;
                j++;
                t = "";
            }
        }
        if (t.length() > 0) {
            arr[j] = t;
        }
        return arr;
    }

    /*
     * Input:
     * Enter the string :
     * india is my country
     * Output:
     * country my is india
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = scan.nextLine();
        String res[] = split(s, countWords(s));
        for (int i = res.length - 1; i >= 0; i--) {
            if (res[i] != null) {
                System.out.print(res[i] + " ");
            }
        }
        scan.close();
    }
}