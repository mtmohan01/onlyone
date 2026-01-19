import java.util.*;

public class Str {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String s1 = s.nextLine();

        System.out.println("Enter the second string:");
        String s2 = s.nextLine();

        String s3 = s1.concat(s2);
        System.out.println("Concatenated String: " + s3);

        System.out.println("Main string: " + s1);

        System.out.println("Enter the substring:");
        String s4 = s.nextLine();

        boolean s5 = s3.contains(s4);
        System.out.println("Substring found? " + s5);

        System.out.println("Main string for substring extraction: " + s1);

        System.out.println("Enter the starting index:");
        int start = s.nextInt();

        System.out.println("Enter the ending index:");
        int end = s.nextInt();

        if (start >= 0 && end <= s1.length() && start < end) {
            String s6 = s1.substring(start, end);
            System.out.println("Extracted Substring: " + s6);
        } else {
            System.out.println("Invalid index values.");
        }

        s.close();
    }
}
