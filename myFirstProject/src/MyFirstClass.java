//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.time.LocalDate;
public class MyFirstClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("name: ");
        String name = scanner.nextLine();

        System.out.print("age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your birthday (YYYY-MM-DD) :");
        String date = scanner.nextLine();
        LocalDate birthday = LocalDate.parse(date);

        System.out.println("age: " + age);
        System.out.println("name: "+ name);
        System.out.println("birthday: " + birthday);
        }
    }
