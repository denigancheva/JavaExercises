import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int number=0;
        ArrayList<User> users= new ArrayList<User>();
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.println("1:Enter new user , 2: Show all users, 3:Exit");

                number = scanner.nextInt();
                scanner.nextLine();

                switch (number)
                {
                    case 1:
                        while (true) {
                            System.out.print("Enter email: ");
                            String email = scanner.nextLine();

                            System.out.print("Enter password: ");
                            String password = scanner.nextLine();

                            try {
                                User user = createUser(email, password);
                                users.add(user);

                                System.out.println("User added successfully!");
                                break;
                            }
                            catch (InvalidEmailException | InvalidPasswordException e) {
                                System.out.println(e.getMessage());
                                System.out.println("Please enter the details again.");
                            }
                        }
                        break;
                    case 2:
                        for(User user: users)
                        {
                            System.out.println(user.ShowUser());
                        }

                        break;
                }
            }
            catch (InputMismatchException e) {

                System.out.println("You didn’t enter integer.");
            }
            catch (Exception e) {

                e.printStackTrace();
            }
        }
        while(number!=3);
    }

    public static User createUser(String email, String password) throws InvalidPasswordException, InvalidEmailException {

        return new User(email, password);
    }
}
