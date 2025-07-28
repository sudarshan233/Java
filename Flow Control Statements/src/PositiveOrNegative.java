import java.util.*;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the number: ");
        int n = sc.nextInt();

        if(n > 0) System.out.printf("%d is a positive number", n);

        else if (n < 0) System.out.printf("%d is a negative number", n);

        else System.out.printf("%d is zero", n);
    }
}