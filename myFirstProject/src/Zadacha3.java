import  java.util.Scanner;
public class Zadacha3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 words: ");
        String w1, w2, w3, w4, w5;
        String[] words= new String[5];
        for(int i=1; i<=5; i++)
        {
            words[i-1] = scanner.next();
        }
        for(int i=1; i<=5; i++)
        {
            System.out.println(words[i-1]);
        }
    }
}
