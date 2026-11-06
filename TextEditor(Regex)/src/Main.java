import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input="";
        StringBuilder str = new StringBuilder();
        System.out.println("Enter your strings, enter 0 to exit");
        String EMAIL_PATTERN =

                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"

                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        String WORD_PATTERN = "^word$";
        int emailsCount = 0;
        int wordCount = 0;
        while (!input.equals("0"))
        {
            input = scanner.nextLine();
            str.append(input+" ");
            if(input.matches(EMAIL_PATTERN))
            {
                emailsCount++;
            }
            if(input.matches(WORD_PATTERN))
            {
                wordCount++;
            }


        }
        System.out.println(str);
        System.out.println("Emails count: " + emailsCount);
        System.out.println("Word count: " + wordCount);
        String[] words = str.toString().trim().split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i] + " ");
        }

        System.out.println(result);
    }
}
