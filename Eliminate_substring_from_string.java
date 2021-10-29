package Practice;

import java.util.Scanner;

public class Eliminate_substring_from_string {
    public static void main(String[] args) {
        String s,sub;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string s :");
        s = sc.nextLine();
        System.out.print("Enter the sub-string sub :");
        sub = sc.nextLine();

        s = s.replace(sub,"");
        System.out.println(s);
    }
}
