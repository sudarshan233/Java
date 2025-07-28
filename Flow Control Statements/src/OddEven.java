import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        int n = sc.nextInt();

        if(n % 2 == 0) System.out.printf("%d is an even number", n);

        else System.out.printf("%d is an odd number", n);
    }
}
