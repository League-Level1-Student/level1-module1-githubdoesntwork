import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int a;
String b;
System.out.println("Type a 8 digit binary number :)");
b = scan.nextLine();
a=0;
a=a+(b.charAt(0)-'0')*128;
a=a+(b.charAt(1)-'0')*64;
a=a+(b.charAt(2)-'0')*32;
a=a+(b.charAt(3)-'0')*16;
a=a+(b.charAt(4)-'0')*8;
a=a+(b.charAt(5)-'0')*4;
a=a+(b.charAt(6)-'0')*2;
a=a+(b.charAt(7)-'0');
System.out.println(a);
	}
}
