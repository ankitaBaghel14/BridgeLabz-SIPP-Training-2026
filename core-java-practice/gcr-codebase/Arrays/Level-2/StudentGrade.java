
import java.util.*;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();

        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            double physics = sc.nextDouble();
            double chemistry = sc.nextDouble();
            double maths = sc.nextDouble();

            percentage[i] = (physics + chemistry + maths) / 3;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else grade[i] = 'D';
        }

        for (int i = 0; i < students; i++) {
            System.out.println(percentage[i] + " " + grade[i]);
        }
    }
}
