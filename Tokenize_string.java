package Practice;

import java.util.StringTokenizer;

public class Tokenize_string {
    public static void main(String[] args) {
        StringTokenizer sentence = new StringTokenizer("Hai siva, how are you. Are you /Practice java",".,/");

        while(sentence.hasMoreTokens())
        {
            System.out.println(sentence.nextToken());
        }
    }
}
