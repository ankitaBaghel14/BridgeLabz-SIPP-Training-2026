
import java.util.*;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();

        double[][] marks = new double[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < students; i++) {
            double percentage = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            char grade;

            if (percentage >= 90) grade = 'A';
            else if (percentage >= 75) grade = 'B';
            else if (percentage >= 60) grade = 'C';
            else grade = 'D';

            System.out.println(percentage + " " + grade);
        }
    }
}
