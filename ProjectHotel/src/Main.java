import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();


        Waiter w1 = new Waiter("petar", 27, 1200, "12.07.2019", 120, 9, 8, 20);
        Waiter w2 = new Waiter("ivan", 35, 1350, "12.07.2016", 120, 21, 8, 20);
        int[] rooms1 = {506, 708, 210, 306, 101, 603, 201};
        Housemaid h1 = new Housemaid("ivana", 53, 1780, "15.04.2009", 23, rooms1, 5);
        int[] rooms2 = {507, 709, 211, 308, 112, 605, 204};
        Housemaid h2 = new Housemaid("ivanka", 54, 1780, "15.04.2009", 23, rooms1, 9);
        hotel.addEmployee(w1);
        hotel.addEmployee(h1);
        hotel.addEmployee(w2);
        hotel.addEmployee(h2);
        System.out.println("1: Print all employees, 2: Print waiters, 3: Print housemaids, 4: Add employee, 5: Exit");
        int answer;
        Scanner scanner = new Scanner(System.in);
        do{
            answer = scanner.nextInt();
            switch(answer){
                case 1:
                    hotel.showAllEmployees();
                    break;
                case 2:
                    hotel.showWaiters();
                    break;
                case 3:
                    hotel.showHousemaids();
                    break;
                case 4:
                    addEmployee(hotel, scanner);
                    break;
                default:
                    break;
            }
        }
        while(answer!=5);
    }
    public static void addWaiter(Hotel hotel, Scanner scanner) {
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Enter starting salary:");
        float salary = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("Enter hire date (DD.MM.YYYY):");
        String hireDate = scanner.nextLine();

        System.out.println("Enter tips:");
        float tips = scanner.nextFloat();

        System.out.println("Enter completed shifts:");
        int shifts = scanner.nextInt();

        System.out.println("Enter shift length in hours:");
        int shiftLength = scanner.nextInt();

        System.out.println("Enter required shifts:");
        int shiftsToDo = scanner.nextInt();

        Waiter waiter = new Waiter(name, age, salary, hireDate, tips, shifts, shiftLength, shiftsToDo);

        hotel.addEmployee(waiter);
        System.out.println("Waiter added successfully. ID: " + waiter.getId());
    }
    public static void addHousemaid(Hotel hotel, Scanner scanner) {
        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Enter starting salary:");
        float salary = scanner.nextFloat();

        scanner.nextLine();

        System.out.println("Enter hire date (DD.MM.YYYY):");
        String hireDate = scanner.nextLine();

        System.out.println("Enter completed shifts:");
        int shifts = scanner.nextInt();

        System.out.println("How many rooms are assigned?");
        int roomCount = scanner.nextInt();

        int[] rooms = new int[roomCount];

        for (int i = 0; i < roomCount; i++) {
            System.out.println("Enter room number " + (i + 1) + ":");
            rooms[i] = scanner.nextInt();
        }

        System.out.println("Enter rooms already cleaned:");
        int roomsDone = scanner.nextInt();

        Housemaid housemaid = new Housemaid(name, age, salary, hireDate, shifts, rooms, roomsDone);

        hotel.addEmployee(housemaid);

        System.out.println("Housemaid added successfully. ID: " + housemaid.getId()
        );
    }

    public static void addEmployee(Hotel hotel, Scanner scanner) {
        System.out.println("Choose employee type:");
        System.out.println("1: Waiter");
        System.out.println("2: Housemaid");

        int type = scanner.nextInt();
        scanner.nextLine();

        if (type == 1) {
            addWaiter(hotel, scanner);
        } else if (type == 2) {
            addHousemaid(hotel, scanner);
        } else {
            System.out.println("Invalid employee type.");
        }
    }
    }



