public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("=== Exception Handling Demo ===\n");
        
        // a) ArithmeticException
        try {
            int x = 10 / 0;
        } catch(ArithmeticException e) {
            System.out.println("1. ArithmeticException: Division by zero!");
        }
        
        // b) NumberFormatException
        try {
            int num = Integer.parseInt("abc");
        } catch(NumberFormatException e) {
            System.out.println("2. NumberFormatException: Invalid number format!");
        }
        
        // c) ArrayIndexOutOfBoundsException
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("3. ArrayIndexOutOfBounds: Invalid index!");
        }
        
        // d) NegativeArraySizeException
        try {
            int[] negArr = new int[-5];
        } catch(NegativeArraySizeException e) {
            System.out.println("4. NegativeArraySize: Array size cannot be negative!");
        }
        
        System.out.println("\nAll exceptions handled successfully!");
    }
}