public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static int subtractProductAndSum(int n) {
        int a = product(n);
        int b = sum(n);
        return a - b;
    }

    public static int product(int n) {
        int pro = 1;

        while (n != 0) {
            int digit = n % 10;
            pro = pro * digit;
            n = n / 10;
        }

        return pro;
    }

    public static int sum(int n) {
        int s = 0;

        while (n != 0) {
            int digit = n % 10;
            s = s + digit;
            n = n / 10;
        }

        return s;
    }

    public static void main(String[] args) {
        int n = 234;

        System.out.println("Result = " + subtractProductAndSum(n));
    }
}