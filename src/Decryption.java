import java.util.Scanner;

public class Decryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scnr = new Scanner(System.in);
		
		//Declare variables
				int fourDigit;
				int firstDigit;
				int secondDigit;
				int thirdDigit;
				int fourthDigit;
				int swap;
				boolean negative = false;
				String decrypt;

				
				
				//Scan integer to be decrypted
				System.out.println("Enter a four digit integer to decrypt.");
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
				if (firstDigit < 7) {
					firstDigit = firstDigit + 10 - 7;
				}
				else {firstDigit = firstDigit - 7;}
				
				
				secondDigit = (fourDigit / 100) % 10;
				if (secondDigit < 7) {
					secondDigit = secondDigit + 10 - 7;
				}
				else {secondDigit = secondDigit - 7;}
				
				thirdDigit = (fourDigit / 10) % 10;
				if (thirdDigit < 7) {
					thirdDigit = thirdDigit + 10 - 7;
				}
				else {thirdDigit = thirdDigit - 7;}
				
				fourthDigit = (fourDigit % 10);
				if (fourthDigit < 7) {
					fourthDigit = fourthDigit + 10 - 7;
				}
				else {fourthDigit = fourthDigit - 7;}
				
				
				//rearrange digits
				swap = firstDigit;
				firstDigit = thirdDigit;
				thirdDigit = swap;
				swap = secondDigit;
				secondDigit = fourthDigit;
				fourthDigit = swap;
				
				if (negative) {
					decrypt = "-" + firstDigit + secondDigit + thirdDigit + fourthDigit;
				}
				else { 
					decrypt = "" + firstDigit + secondDigit + thirdDigit + fourthDigit;
				}
				System.out.println(decrypt);
				
	}

}
