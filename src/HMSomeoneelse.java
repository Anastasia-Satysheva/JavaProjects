import java.util.Scanner;

public class HMSomeoneelse {

		public static void main(String[] args) {
			double num1, num2, num3, largest;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter first number");
			num1 = s.nextDouble();
			System.out.println("Enter second number");
			num2 = s.nextDouble();
			System.out.println("Enter third number");
			num3 = s.nextDouble();
			if (num1 > num2) {
				if (num1 > num3) {
					largest = num1;
				} else {
					largest = num3;
				}
			} else if (num2 > num1) {
				if (num2 > num3) {
					largest = num2;
				} else {
					largest = num3;
				}
			} else {
				largest = num2;
			}
			System.out.println("The largest number is " + largest);
		}
	}