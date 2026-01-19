import java.util.Scanner;
public class buffer {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter a String: ");
String input = s.nextLine();
StringBuffer sb = new StringBuffer(input);
int length = sb.length();
System.out.println("Length of the string: " + length);
sb.reverse();
System.out.println("Reversed string: " + sb); sb = new StringBuffer(input);
System.out.print("Enter a substring to delete: ");
String s1 = s.nextLine();
int start = sb.indexOf(s1);
if (start != -1) {
int end = start + s1.length();
sb.delete(start, end);
System.out.println("String after deleting the substring: " + sb);
} else {
System.out.println("Substring not found in the given string.");
}
s.close();
}
} 
