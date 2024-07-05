package strings;

import java.util.Scanner;

public class FindSubString {
    public static String FindString(String s, String t){
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return j==t.length() ? "Yes" : "No";

    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s=scan.nextLine();
        String t=scan.nextLine();
        String res=FindString(s,t);
        System.out.print(res);
    }
}
