import java.util.Random;

public class RanNumGenerator {
    public static void main(String[] args) {
        int lower = 10;
        int upper = 50;
        Random r = new Random();
        int n = r.nextInt(upper - lower + 1) + lower;
        
        System.out.println("Generated Random Number: " + n);
        
        if (n < 20) {
            System.out.println("The generated number is less than 20.");
        } else if (n >= 20 && n <= 30) {
            System.out.println("The generated number is between 20 and 30 (inclusive).");
        } else {
            System.out.println("The generated number is greater than 30.");
        }
    }
}
