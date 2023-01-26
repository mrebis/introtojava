package introtojava;
import java.util.*; 

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		      String userInput, reverse = ""; // Objects of String class  
		      Scanner in = new Scanner(System.in);   
		      System.out.println("Enter a string/number to check if it is a palindrome");  
		      userInput = in.nextLine();   
		      int length = userInput.length();   
		      for ( int i = length - 1; i >= 0; i-- )  
		         reverse = reverse + userInput.charAt(i);  
		      if (userInput.equals(reverse))  
		         System.out.println("Entered string/number is a palindrome.");  
		      else  
		         System.out.println("Entered string/number isn't a palindrome.");   
		      
	}  
	
}
