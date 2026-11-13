//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.io.File;
import java.io.IOException;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        String input="";
        //StringBuilder str = new StringBuilder();
        String EMAIL_PATTERN =

                "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"

                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        //String WORD_PATTERN = "^word$";
        int emailsCount = 0;
        int wordCount = 0;
        ArrayList<String> text = new ArrayList<>();
        ArrayList<Email> emails = new ArrayList<>();
        System.out.println("0: exit, 1:Add text to file, 2:Read from file");
        int choice;
        choice = scanner.nextInt();
        while (choice!=0)
        {
            switch(choice)
            {
                case(1):
                    try {
                        File file = new File("text.txt");
                        boolean isCreated = file.createNewFile();
                        if (isCreated){
                            System.out.println("File has been created successfully");
                        }
                        else{
                            System.out.println("File already present at the specified location");
                        }
                    }
                    catch (IOException e)
                    {
                        System.out.println("Exception Occurred:");
                        e.printStackTrace();
                    }
                    FileOutputStream out = null;
                    out = new FileOutputStream("text.txt", true);
                    System.out.println("Enter emails, enter 0 to end");
                    while(!input.equals("0")) {
                        input = scanner.nextLine();
                        text.add(input);
                        if(input.matches(EMAIL_PATTERN))
                        {
                            Email email = new Email(input);
                            emails.add(email);
                            emailsCount++;
                        }
                    }
                    for(String item: text){
                        out.write((item + "\n").getBytes());
                    }
                    out.close();
                    System.out.println("The information has been successfully added to the file!");
                    try (ObjectOutputStream oos = new ObjectOutputStream(
                            Files.newOutputStream(Paths.get("emails.bin")))){
                        oos.writeObject(emails);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("0: exit, 1:Add text to file, 2:Read from file");
                    choice=scanner.nextInt();
                    continue;
                case 2:
                    try (ObjectInputStream in = new ObjectInputStream(
                            new FileInputStream("emails.bin"))) {

                        for (Email email : emails) {
                            System.out.println(email.getName());
                        }
                    } catch (IOException  e) {
                        e.printStackTrace();
                    }
                    System.out.println("0: exit, 1:Add text to file, 2:Read from file");
                    choice=scanner.nextInt();
                    continue;

                default:
                    return;

            }
            //str.append(input+" ");
        }

        //System.out.println(str);
        System.out.println("Emails count: " + emailsCount);
        System.out.println("Word count: " + wordCount);
        //String[] words = str.toString().trim().split(" ");
        //StringBuilder result = new StringBuilder();
        //for (int i = words.length - 1; i >= 0; i--) {
        //    result.append(words[i] + " ");
        //}

        //System.out.println(result);
    }
}
class Email implements Serializable
{
    private String name;
    public Email(String name)
    {
        this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
}
