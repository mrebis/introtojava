package introtojava;
import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a;
		Scanner scanner = new Scanner(System.in); // Scanner object created
		System.out.println("Enter a number:");
		int userInput = scanner.nextInt();
		
		if (userInput >= 0){
			System.out.println("Number is positive");
		}else {
			System.out.println("Number is negative");
		}
		scanner.close();

	}

}
