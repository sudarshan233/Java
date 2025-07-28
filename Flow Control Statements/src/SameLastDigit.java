import java.util.Scanner;

public class SameLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.printf("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println(lastDigit(num1, num2));
    }
    public static boolean lastDigit(int num1, int num2) {
        if (num1 % 10 == num2 % 10) return true;
        return false;
    }
}
