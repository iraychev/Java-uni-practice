import java.util.*;

public class BMICalculator {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        printIntroduction();
        double bmi = getBMI(scn);
        String status = getStatus(bmi);

        ReportResults(911, bmi, status);
    }

    static void printIntroduction() {
        System.out.println("Hello. This is a Body Mass Index (BMI) Calculator.");

    }

    static double getBMI(Scanner scan) {
        System.out.println("Enter your weight (in pounds): ");
        double weight = scan.nextDouble();

        System.out.println("Enter your height (in inches): ");
        double height = scan.nextDouble();

        return bmiFor(weight, height);
    }

    static double bmiFor(double weight, double height) {
        return weight*703/ (height*height);
    }

    static String getStatus(double bmi) {
        String status;

        if(bmi< 18.5) status = "underweight";
        else if(bmi< 25) status = "normal";
        else if(bmi< 30) status = "overweight";
        else if(bmi> 30) status = "obese";
        else status = "Error";

        return status;
    }

    static void ReportResults (int resultNumber, double BMI, String status) {

        System.out.println("Number: \""+resultNumber+"\" has a BMI of: \""+BMI+"\" and is "+ status);
    }
}
