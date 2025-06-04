package xyz;
import java.util.Scanner;
public class RainUmbrella {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("It is Raining(yes/no)");
		String answer=sc.next();
		if(answer.equals("yes"))
		{
			System.out.println("Take an umbrella");
		}
		else {
			System.out.println("no need an umbrella");
		}

	}

}
