package Practice;

import java.util.Scanner;

public class Replace_given_string_from_string {
    public static void main(String[] args) {
        String sentence,replace_string,remove_string;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence :");
        sentence = sc.nextLine();
        System.out.print("Enter the remove string :");
        remove_string = sc.nextLine();
        System.out.print("Enter the replace string :");
        replace_string = sc.nextLine();

        System.out.println(sentence.replaceAll(remove_string,replace_string));
    }
}
