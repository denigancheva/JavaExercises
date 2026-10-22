class Housemaid extends Employee
{
    private int shifts;
    private int[] rooms;
    private int roomsDone;
    public Housemaid(String name, int age, float startingSalary, String hireDate,int shifts, int[] rooms, int roomsDone )
    {
        super(name, age, startingSalary, hireDate);
        this.shifts = shifts;
        this.rooms = rooms;
        this.roomsDone = roomsDone;

    }

    public int getShifts() {
        return shifts;
    }

    public int[] getRooms() {
        return rooms;
    }

    public int getRoomsDone() {
        return roomsDone;
    }

    public void setRooms(int[] rooms) {
        if (rooms != null) {
            this.rooms = rooms.clone();
        }
    }
    public void setShifts(int shifts) {
        if (shifts >= 0) {
            this.shifts = shifts;
        }
    }
    public void setRoomsDone(int roomsDone) {
        if (roomsDone >= 0) {
            this.roomsDone = roomsDone;
        }
    }
    public void doRooms(int count)
    {
        this.roomsDone+=count;
    }

    @Override
    public int calculateWorkingHours() {
        return shifts*8;
    }

    @Override
    public float calculateSalary() {
        return this.getStartingSalary() + addBonus();
    }

    @Override
    public float addBonus() {
        if(roomsDone>rooms.length) return 100;
        else return 0;
    }

    @Override
    public void changeShifts() {

    }

    @Override
    public int calculateRemainingLeavedays() {
        return 0;
    }
}
