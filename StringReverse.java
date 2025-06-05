package kiran;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String input=sc.nextLine();
		char[] chars = input.toCharArray();
        String reversed = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i]; 
        }

        System.out.println("Reversed string: " + reversed);
	}

}
