package kiran;
import java.util.Scanner;
public class Calender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day:");
		String Day=sc.nextLine().toLowerCase();
		switch(Day) {
		case "Monday":
			System.out.println("Lets learn python");
			break;
		case "tuesday":
			System.out.println("lets learn java");
			break;
		case "wednesday":
			System.out.println("lets laern ruby");
			break;
		case "thursday":
			System.out.println("lets learn springboot");
			break;
		case "friday":
			System.out.println("lets learn nodejs");
			break;
		case "saturday":
			System.out.println("lets learn Angular js");
			break;
		case "sunday":
			System.out.println("lets play Cricket");
			break;
		default:
			System.out.println("don't get struck do hardwork");
			}
	}

}
