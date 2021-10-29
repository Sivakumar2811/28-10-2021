package Practice;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class tocompare_2_string {
    public static void main(String[] args) {

        String s1,s2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string s1 :");
        s1 = sc.nextLine();
        System.out.print("Enter the string s2 :");
        s2 = sc.nextLine();

        System.out.println("With Ignore Case Stings\ns1 :"+s1+" and s2 :"+s2+" :"+s1.equalsIgnoreCase(s2));
        System.out.println("\nWith out Ignore case Stings\ns1 :"+s1+" and s2 :"+s2+" :"+s1.equals(s2));
    }
}
