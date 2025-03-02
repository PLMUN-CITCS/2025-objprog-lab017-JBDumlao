import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        int SCORES = getStudentscore();
        String GRADES = calculateGrade(SCORES);
        System.out.println("Your Grade is: " + GRADES);
    }

    public static int getStudentscore() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your SCORES: ");
        int SCORES = input.nextInt();
        input.close();
        return SCORES;
    }

    public static String calculateGrade(int SCORES) {
        if (SCORES >= 90) {
            return "A";
        } else if (SCORES >= 80) {
            return "B";
        } else if (SCORES >= 70) {
            return "C";
        } else if (SCORES >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}