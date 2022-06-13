package maths;
class Calculator{
	static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
		}
	static double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}
}

public class Test {

	public static void main(String[] args) {
		
		System.out.println("the int value of 2,6 is"+Calculator.powerInt(2,6));
		System.out.println("the double value of 2,8 is"+Calculator.powerInt(2,8));
	}

}
