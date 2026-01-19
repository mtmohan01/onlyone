import java.util.*;

public class Prime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = s.nextInt();
        s.close();

        System.out.println("Prime numbers up to " + a + ":");
        display(a);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void display(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}