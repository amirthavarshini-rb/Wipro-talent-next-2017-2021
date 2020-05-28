import java.util.Scanner;
public class prog7 { 
public static void main(String[] args) { 
	Scanner s=new Scanner(System.in); 
	char ch=s.next().charAt(0);
	if (Character.isLowerCase(ch)) {
		System.out.println(ch+"->"+Character.toUpperCase(ch)); }
	else {
		System.out.println(ch+"->"+Character.toLowerCase(ch)); }
       }
}
