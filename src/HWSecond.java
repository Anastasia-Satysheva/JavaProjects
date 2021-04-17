import java.util.Scanner;

public class HWSecond {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a;
		int b;
		int c;
		int largest;
		
		System.out.println("Please, provide 3 numbers");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		if (a>b && a>c) {
			largest = a;
		} else if (b>c && b>a) {
			largest = b;
		}else largest = c;
				System.out.println(largest);
	}

}
