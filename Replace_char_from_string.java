package Practice;

import java.util.Scanner;

public class Replace_char_from_string {
    public static void main(String[] args) {
        String s;
        char c1,c2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string :");
        s=sc.next();
        System.out.print("Enter the remove char c1 :");
        c1=sc.next().charAt(0);
        System.out.print("Enter the replace char c1 :");
        c2=sc.next().charAt(0);

        System.out.println(s.replace(c1,c2));
    }
}
