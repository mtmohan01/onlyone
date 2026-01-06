Program:

import java.util.Scanner ;
public class Text {
    static int characters(String a) {
        return a.length();
    }

    static int Lines(String a) {
        String[] lines = a.split("\r\n|\r|\n");
        return lines.length;
    }

    static int Words(String a) {
        String[] Words = a.split("\\s+");
        return Words.length;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter some text:");
        String inputText = s.nextLine();

        int d = characters(inputText);
        int e = Lines(inputText);
        int f = Words(inputText);

        System.out.println("\nAnalysis Result:");
        System.out.println("Number of characters: " + d);
        System.out.println("Number of lines: " + e);
        System.out.println("Number of words: " + f);
    }
}
