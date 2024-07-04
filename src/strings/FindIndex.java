package strings;

import java.util.Scanner;

public class FindIndex {
    public static int findIndex(String s, char k) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == k) {
                return i;
            }
        }
        return -1;
    }

    /*
     * Input:
     * Enter the string :
     * banana
     * Output:
     * The altered string is :
     * b*an*an*a
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = scan.nextLine();
        char k = scan.next().charAt(0);
        int res=findIndex(s,k);
        if(res>0){
            System.out.println(res);
        }
        else{
            System.out.println("Not found");
        }
        
        scan.close();
    }
}
