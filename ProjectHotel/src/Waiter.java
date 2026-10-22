class Waiter extends Employee
{
    private float tips;
    private int shifts;
    private int shiftLength;
    private int shiftsToDo;


    public Waiter(String name, int age, float startingSalary, String hireDate, float tips, int shifts, int shiftLength, int shiftsToDo )
    {
        super(name, age, startingSalary, hireDate);
        this.tips= tips;
        this.shifts = shifts;
        this.shiftLength=shiftLength;
        this.shiftsToDo = shiftsToDo;

    }

    public float getTips() {
        return tips;
    }

    public int getShifts() {
        return shifts;
    }

    public int getShiftLength() {
        return shiftLength;
    }

    public int getShiftsToDo() {
        return shiftsToDo;
    }

    public void setTips(float tips) {
        if (tips >= 0) {
            this.tips = tips;
        }
    }

    public void setShiftLength(int shiftLength) {
        if (shiftLength > 0) {
            this.shiftLength = shiftLength;
        }
    }

    public void setShiftsToDo(int shiftsToDo) {
        if (shiftsToDo >= 0) {
            this.shiftsToDo = shiftsToDo;
        }
    }

    public void ServeShifts(int shifts)
    {
        this.shifts+=shifts;
    }

    @Override
    public int calculateWorkingHours() {
        return shifts*shiftLength;
    }

    @Override
    public float calculateSalary() {
        return this.getStartingSalary() + tips+ addBonus();
    }

    @Override
    public float addBonus() {
        if (this.shiftsToDo>=this.shifts){
            return 0;
        }
        else return 100;

    }

    @Override
    public void changeShifts() {

    }

    @Override
    public int calculateRemainingLeavedays() {
        return 0;
    }
}
