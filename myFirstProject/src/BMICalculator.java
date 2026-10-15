import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        printIntroduction();
        Scanner scanner = new Scanner(System.in);
        double bmi = getBMI(scanner);
        String status = getStatus(bmi);
        reportResults(1,bmi, status );

    }

    public static void printIntroduction(){
        System.out.println("Hi! Enter your weight and your height and we will calculate your BMI!");
    }

    public static double getBMI(Scanner scanner)
    {
        System.out.println("Enter your height (in inches): ");
        double h = scanner.nextDouble();
        System.out.println("Enter your weight (in pounds): ");
        double w = scanner.nextDouble();
        return BMIFor(h,w);

    }

    public static double BMIFor(double height, double weight){
        return weight*703/ (height*height);
    }

    public static String getStatus(double index){
        if(index<18.5)
        {
            return "underweight";
        }
        else if(index<25)
        {
            return "normal";
        }
        else if(index<30)
        {
            return "overweight";
        }
        else return "obese";
    }

    public static void reportResults(int num, double bmi, String status)
    {
        bmi = Math.round(bmi);
        System.out.println("the person " + num +" has BMI=" + bmi+ " ,status: " + status);
    }
}
