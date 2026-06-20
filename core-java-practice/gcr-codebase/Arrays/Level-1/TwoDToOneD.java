import java.util.*;

public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] arr = new int[rows * cols];
        int index = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                arr[index++] = value;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}