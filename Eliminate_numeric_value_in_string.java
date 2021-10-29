package Practice;

import java.util.Scanner;

public class Eliminate_numeric_value_in_string {
    public static void main(String[] args) {
        String s,replace="";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string :");
        s=sc.next();

        for(char c:s.toCharArray())
        {
            if(!(c>=48 && c<=57))
            {
                replace +=c;
            }
        }
        System.out.println(replace);

    }
}
