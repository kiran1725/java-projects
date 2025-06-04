package javaproject;

interface message
{
	void say();
}

public class lambdaExample {

	public static void main(String[] args) {
		message hellomessage=() -> System.out.println("this is lambda Expression");
				hellomessage.say();

	}

}
