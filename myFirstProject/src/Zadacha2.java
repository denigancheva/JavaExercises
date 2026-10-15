import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First side: ");
        int s1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Second side: ");
        int s2 = scanner.nextInt();
        scanner.nextLine();

        int area = s1*s2;
        System.out.println("the area is " + area);
    }
}
