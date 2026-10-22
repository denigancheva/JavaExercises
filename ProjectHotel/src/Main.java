import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Waiter w1 = new Waiter("petar", 27, 1200, "12.07.2019", 120, 9, 8, 20);
        Waiter w2 = new Waiter("ivan", 35, 1350, "12.07.2016", 120, 21, 8, 20);
        ArrayList<Employee> waiters = new ArrayList<Employee>();
        waiters.add(w1);
        waiters.add(w2);
        int[] rooms1 = {506, 708, 210, 306, 101, 603, 201};
        Housemaid h1 = new Housemaid("ivana", 53, 1780, "15.04.2009", 23, rooms1, 5);
        int[] rooms2 = {507, 709, 211, 308, 112, 605, 204};
        Housemaid h2 = new Housemaid("ivanka", 54, 1780, "15.04.2009", 23, rooms1, 9);
        ArrayList<Employee> housemaids = new ArrayList<Employee>();
        housemaids.add(h1);
        housemaids.add(h2);
        System.out.println("1: Print waiters, 2: Print housemaids, 3: Break");
        int answer;
        Scanner scanner = new Scanner(System.in);
        do{
            answer = scanner.nextInt();
            switch(answer){
                case 1:
                    for(Employee waiter :waiters){
                        System.out.println(waiter.showBasicInfo());
                    }
                    break;
                case 2:
                    for(Employee housemaid :housemaids){
                        System.out.println(housemaid.showBasicInfo());
                    }
                    break;
            }
        }
        while(answer!=3);


    }
}



