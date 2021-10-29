package Practice;

import java.util.Scanner;

public class Split_string {
    public static void main(String[] args) {
        String sentence;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence :");
        sentence=sc.nextLine();

        String s[] = sentence.split(" ");

        for(String c:s)
        {
            System.out.println(c);
        }
    }
}
