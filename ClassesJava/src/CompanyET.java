public class CompanyET extends Company{
    private String fullName;
    private double startingCapital;
    private double actCapital;

    public CompanyET(String name, String date, String bulstat, String fullName, double startingCapital, double actCapital){
        super(name, date, bulstat);
        this.fullName = fullName;
        this.startingCapital = startingCapital;
        this.actCapital=actCapital;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getStartingCapital() {
        return startingCapital;
    }

    public void setStartingCapital(double startingCapital) {
        this.startingCapital = startingCapital;
    }

    public double getActCapital() {
        return actCapital;
    }

    public void setActCapital(double actCapital) {
        this.actCapital = actCapital;
    }

    public double calculateProfit()
    {
        return this.getActCapital() - this.getStartingCapital();
    }



}
