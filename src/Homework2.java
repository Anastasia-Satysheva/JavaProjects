import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
	
		Scanner scan;
		int balance;
		boolean hasCard;
		
		
		
		
	 scan=new Scanner(System.in);
		
		System.out.println("Do u have a CC? Please, say TRUE or FALSE");
	 hasCard = scan.nextBoolean();
		System.out.println(hasCard);
		
		if (hasCard) {
			System.out.println("What's the balance on it?");
			balance = scan.nextInt();
			System.out.println(balance);
			
			if (balance>1000) {
				System.out.println("You have to pay it off immediatly");
			}else {
				System.out.println("You can spend more if you want to.");
			}
		}else {
			System.out.println("Do you want to have one? Lets go for it.");
		

	}
		
		
		
		
		
	}
}

