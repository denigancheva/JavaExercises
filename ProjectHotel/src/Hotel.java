import java.util.ArrayList;
public class Hotel {
    private ArrayList<Employee> employees;

    public Hotel() {
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void showAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees.");
            return;
        }

        for (Employee employee : employees) {
            System.out.println(employee.showBasicInfo());
        }
    }

    public void showWaiters() {
        for (Employee employee : employees) {
            if (employee instanceof Waiter) {
                System.out.println(employee.showBasicInfo());
            }
        }
    }

    public void showHousemaids() {
        for (Employee employee : employees) {
            if (employee instanceof Housemaid) {
                System.out.println(employee.showBasicInfo());
            }
        }
    }
}
