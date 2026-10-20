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
                        System.out.println(waiter.ShowBasicInfo());
                    }
                    break;
                case 2:
                    for(Employee housemaid :housemaids){
                        System.out.println(housemaid.ShowBasicInfo());
                    }
                    break;
            }
        }
        while(answer!=3);


    }
}



 interface Paid {
    public abstract float CalculateSalary();
    public abstract boolean AddBonus();

}

 interface Working{
    public abstract void ChangeShifts();
    public abstract int CalculateRemainingLeavedays();
}

 abstract class Employee implements Paid,Working
{
    public String name;
    public int age;
    public float startingSalary;
    public String hireDate;

    public Employee(String name, int age, float startingSalary, String hireDate)
    {
        this.name = name;
        this.age = age;
        this.startingSalary=startingSalary;
        this.hireDate=hireDate;
    }

    public abstract int CalculateWorkingHours();

    public String ShowBasicInfo()
    {
        return "Name: " + name + ", age: " + age +", hireDate: " + hireDate;
    }


}

 class Waiter extends Employee
{
    public float tips;
    public int shifts;
    public int shiftLength;
    public int shiftsToDo;


    public Waiter(String name, int age, float startingSalary, String hireDate, float tips, int shifts, int shiftLength, int shiftsToDo )
    {
        super(name, age, startingSalary, hireDate);
        this.tips= tips;
        this.shifts = shifts;
        this.shiftLength=shiftLength;
        this.shiftsToDo = shiftsToDo;

    }

    public void ServeShifts(int shifts)
    {
        this.shifts+=shifts;
    }

    @Override
    public int CalculateWorkingHours() {
        return shifts*shiftLength;

    }

    @Override
    public float CalculateSalary() {
        return startingSalary + tips;
    }

    @Override
    public boolean AddBonus() {
        if (this.shiftsToDo>=this.shifts){
            return false;
        }
        else return true;

    }

    @Override
    public void ChangeShifts() {

    }

    @Override
    public int CalculateRemainingLeavedays() {
        return 0;
    }
}

class Housemaid extends Employee
{
    public int shifts;
    public int[] rooms;
    public int roomsDone;
    public Housemaid(String name, int age, float startingSalary, String hireDate,int shifts, int[] rooms, int roomsDone )
    {
        super(name, age, startingSalary, hireDate);
        this.shifts = shifts;
        this.rooms = rooms;
        this.roomsDone = roomsDone;

    }
    public void DoRooms(int count)
    {
        this.roomsDone+=count;
    }

    @Override
    public int CalculateWorkingHours() {
        return shifts*8;
    }

    @Override
    public float CalculateSalary() {
        return startingSalary;
    }

    @Override
    public boolean AddBonus() {
        if(roomsDone>rooms.length) return true;
        else return false;
    }

    @Override
    public void ChangeShifts() {

    }

    @Override
    public int CalculateRemainingLeavedays() {
        return 0;
    }
}