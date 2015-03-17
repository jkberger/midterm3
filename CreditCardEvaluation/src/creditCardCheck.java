import java.util.Scanner;


public class creditCardCheck {
	public static boolean CardNumber(int[] numbers) {
		System.out.println("Enter the credit card number: ");
		numbers = input.nextInt();
		int sum = 0;
		int length = numbers.length;
		for (int x = 0; x < length; x++) {
			int number = numbers[length-x-1];
			if (x%2 == 1) {
				number *= 2;
			}
				if (number <= 9) {
					sum += number;
			
			}
				else
					 sum += (number - 9);
			
				if (x%2 == 0) {
					sum += number;
			}
		if (sum%10 == 0) {
			System.out.println("The card is valid");
					}
		else 
			System.out.println("the card is invalid");
			
		
		}
	}
}

