import java.util.*;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num > 0) {
                System.out.println(num % 2 == 0 ? num + " is Positive Even" : num + " is Positive Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (arr[0] == arr[4]) System.out.println("First and Last are Equal");
        else if (arr[0] > arr[4]) System.out.println("First is Greater");
        else System.out.println("First is Less");
    }
}