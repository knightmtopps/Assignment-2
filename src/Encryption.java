import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set up Scanner
				Scanner scnr = new Scanner(System.in);
				
				//Declare variables
				int fourDigit;
				int firstDigit;
				int secondDigit;
				int thirdDigit;
				int fourthDigit;
				int swap;
				boolean negative = false;
				String encrypt;
				
				//Scan in integer
				System.out.println("Enter a four digit integer to encrypt.");
				fourDigit = scnr.nextInt();
				if (fourDigit > 9999|| fourDigit <-9999) {
					System.out.print("That is not a valid integer.  Please enter a four digit integer.");
					fourDigit = scnr.nextInt();
				}
				if (fourDigit < 0) {
				fourDigit = -fourDigit;
				negative = true;
				}
				
				// break down digits + math function digits
				firstDigit = (fourDigit / 1000) % 10;
				firstDigit = ((firstDigit + 7) % 10);
				
				secondDigit = (fourDigit / 100) % 10;
				secondDigit = ((secondDigit + 7) % 10);
				
				thirdDigit = (fourDigit / 10) % 10;
				thirdDigit = ((thirdDigit + 7) % 10);
				
				fourthDigit = (fourDigit % 10);
				fourthDigit = ((fourthDigit + 7) % 10);
				
				//rearrange digits
				swap = firstDigit;
				firstDigit = thirdDigit;
				thirdDigit = swap;
				swap = secondDigit;
				secondDigit = fourthDigit;
				fourthDigit = swap;
			

				//if negative
				if (negative) {
					encrypt = "-" + firstDigit + secondDigit + thirdDigit + fourthDigit;
				}
				else { 
					encrypt = "" + firstDigit + secondDigit + thirdDigit + fourthDigit;
				}
				System.out.println(encrypt);
	}

}
