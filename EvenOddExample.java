package kiran;
import java.util.Scanner;
public class EvenOddExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the number");
		if(n%2==0) {
			System.out.println("It is a Even Number : ");
		}
		else {
				System.out.println("It is a odd number: ");
		}

	}

}
