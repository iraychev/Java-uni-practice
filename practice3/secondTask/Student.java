package secondTask;

import java.util.Scanner;

public class Student extends People{

    private String facultyNumber;
    private double scorePPE;
    private double scorePIK;
    private double scoreTE;

    public Student(String name, String birthdate, String facultyNumber, double scorePIK, double scoreTE, double scorePPE) {
        super(name, birthdate);
        setFacultyNumber(facultyNumber);
        setScorePIK(scorePIK);
        setScoreTE(scoreTE);
        setScorePPE(scorePPE);
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public double getScorePPE() {
        return scorePPE;
    }

    public double getScorePIK() {
        return scorePIK;
    }

    public double getScoreTE() {
        return scoreTE;
    }

    public void setFacultyNumber(String facultyNumber) {
        this.facultyNumber = facultyNumber;
    }

    public void setScorePPE(double scorePPE) {
        this.scorePPE = scorePPE;
    }

    public void setScorePIK(double scorePIK) {
        this.scorePIK = scorePIK;
    }

    public void setScoreTE(double scoreTE) {
        this.scoreTE = scoreTE;
    }

    public void examinePPE() {

        Scanner scan = new Scanner(System.in);
        System.out.print("\nCurrent score in PPE: "+getScorePPE()+" Enter new score: ");
        setScorePPE(scan.nextDouble());
        System.out.println("Score changed. New score: "+getScorePPE());
    }
    public void examinePIK() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nCurrent score in PIK: "+getScorePIK()+" Enter new score: ");
        setScorePIK(scan.nextDouble());
        System.out.println("Score changed. New score: "+getScorePIK());
    }

    public void examineTE() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Current score in TE: "+getScoreTE()+" Enter new score: ");
        setScoreTE(scan.nextDouble());
        System.out.println("Score changed. New score: "+getScoreTE());
    }
}
