public class StringManipulation {
public static void main(String[] args) 
{ System.out.println("STRING MANIPULATION"); System.out.println("\n*********************"); char[] s1 = "hello".toCharArray();
char[] s2 = "World".toCharArray(); int l1 = s1.length;
int l2 = s2.length; System.out.println("String1 length: " + l1); System.out.println("String2 length: " + l2); int 
p = 2;
char a = s1[p];
System.out.println("Character at position " + p + " in String 1: " + a); char[] result = new char[l1 + l2];
System.arraycopy(s1, 0, result, 0, l1); System.arraycopy(s2, 0, result, l1, l2);
System.out.println("Concatenated string: " + new String(result));
}
}
