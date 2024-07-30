//Input: Take marks obtained (out of 100) in each subject.
// 1. English: 70/100 ; 2. Maths: 45/100 ; 3.Science: 50/100 ; 4. Geography: 67/100 ; 5. Hindi: 100/100
//Calculate Total Marks: Sum up the marks obtained in all subjects.
// 70 + 45 + 50 + 67 + 100 = 332 / 500
//Calculate Average Percentage: Divide the total marks by the total number of subjects to get the average percentage.
// Average Percentage : 66.4
//Grade Calculation: Assign grades based on the average percentage achieved.
// A , B , C , D , Pass(P) , Fail(F)
//Display Results: Show the total marks, average percentage, and the corresponding grade to the user

import java.util.Scanner;

class student {
    Scanner sc = new Scanner(System.in);
    public void result() {
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Student Roll No.: ");
        int rollNo = sc.nextInt();

        System.out.println("Enter The Marks out of 100 in Each Subject - ");

        System.out.println("\tEnglish: ");
        int marksEnglish = sc.nextInt();

        System.out.println("\tMathematics: ");
        int marksMathematics = sc.nextInt();

        System.out.println("\tScience: ");
        int marksScience = sc.nextInt();

        System.out.println("\tGeography: ");
        int marksGeography = sc.nextInt();

        System.out.println("\tHindi: ");
        int marksHindi = sc.nextInt();

        int totalMarks = marksEnglish + marksMathematics + marksScience + marksGeography + marksHindi;

        double averagePercentage = ((double)totalMarks / 500) * 100;

        String grade;
        if(averagePercentage <= 100 && averagePercentage >= 80) {
            grade = "A";
        } else if (averagePercentage <= 79 && averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage <= 59 && averagePercentage >= 45) {
            grade = "C";
        } else if (averagePercentage <= 44 && averagePercentage >= 32) {
            grade = "D";
        } else {
            grade = "F"; // Fail
        }

        System.out.println("Student Details - ");
        System.out.println("\tName : " + name);
        System.out.println("\tRoll No : " + rollNo);
        System.out.println("\tTotal Marks : " + totalMarks);
        System.out.println("\tPersentage : " + averagePercentage +"%");

        if(grade.equals("F")) {
            System.out.println("\tGrade : "+grade);
            System.out.println("\t\t\t"+name +" is Fail the Exam");
        } else {
            System.out.println("\tGrade : "+grade);
            System.out.println("\t\t\t"+name+" is Pass the Exam");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        student s = new student();

        s.result();

    }
}