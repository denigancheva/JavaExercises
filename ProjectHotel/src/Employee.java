public abstract class Employee implements Paid,Working {

        private String name;
        private int age;
        private float startingSalary;
        private String hireDate;

        public Employee(String name, int age, float startingSalary, String hireDate)
        {
            setName(name);
            setAge(age);
            setStartingSalary(startingSalary);
            setHireDate(hireDate);
        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be positive.");
        }
        this.age = age;
    }

    public void setStartingSalary(float startingSalary) {
        if (startingSalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.startingSalary = startingSalary;
    }

    public void setHireDate(String hireDate) {
        if (hireDate == null || hireDate.trim().isEmpty()) {
            throw new IllegalArgumentException("Hire date cannot be empty.");
        }
        this.hireDate = hireDate;
    }

    public float getStartingSalary() {
        return startingSalary;
    }

        public abstract int calculateWorkingHours();

        public String showBasicInfo()
        {
            return "Name: " + name
                    + ", Age: " + age
                    + ", Hire date: " + hireDate
                    + ", Starting salary: " + startingSalary
                    + ", Total salary: " + calculateSalary();
        }

}
