package Practice;

import java.util.Scanner;

public class Find_numbebs_of_occurence_of_sub_string {
    public static void main(String[] args) {
        String s1,s2;
        int count=0,strat=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string s1 :");
        s1 = sc.nextLine();
        System.out.print("Enter the sub-string s2 :");
        s2 = sc.nextLine();

        while(true)
        {
            int index=s1.indexOf(s2,strat);

            if(index>=0){
                count++;
                strat=index+1;
            }
            else{
                break;
            }
        }
        System.out.println("In the String: "+ s1);
        System.out.println("The "+ s2 +" sub-string has come = "+ count + " times");
    }
}
