// Grade Program
// Wednesday, June 12, 2024 8:00:00 AM EAT
    //Assignment: Grade Program
    // Java

import java.util.Scanner;

public class GradeCalculator {

    public static String getGrade(int score) {
        if (score >= 90) return "A";
        else if (score >= 87) return "A (minus)";
        else if (score >= 84) return "B (plus)";
        else if (score >= 80) return "B";
        else if (score >= 77) return "B (minus)";
        else if (score >= 74) return "C (plus)";
        else if (score >= 70) return "C";
        else if (score >= 67) return "C (minus)";
        else if (score >= 64) return "D (plus)";
        else if (score >= 62) return "D";
        else if (score >= 60) return "D (minus)";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        String cont;

        do {
            System.out.print("Enter your score (0-100): ");
            score = scanner.nextInt();

            while (score < 0 || score > 100) {
                System.out.print("Invalid score. Please enter a score between 0 and 100: ");
                score = scanner.nextInt();
            }

            String grade = getGrade(score);
            String status = (!grade.equals("F")) ? "passed" : "failed";

            System.out.println("Your score: " + score + ", Grade: " + grade + ", You have " + status + ".");
            System.out.print("Do you want to enter another score? (yes/no): ");
            cont = scanner.next().toLowerCase();
        } while (cont.equals("yes"));

        scanner.close();
    }
}
