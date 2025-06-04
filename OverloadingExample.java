package kiran;

class Calculaator{
	int calculate(int a, int b) {
		return a+b;
	}
	double calculate(double a,double b) {
		return a*b;
	}
	double calculate(double a,double b,double c) {
		return a*b*c;
	}
}
public class OverloadingExample{
	public static void main(String[] args) {
		Calculaator obj=new Calculaator();
		System.out.println(obj.calculate(2,3));
		System.out.println(obj.calculate(20,25));
		System.out.println(obj.calculate(20,30,40));
	}
}