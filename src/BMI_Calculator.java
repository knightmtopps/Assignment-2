import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scnr = new Scanner(System.in);
		
		//Variable Assignment
		boolean measureType;
		int choice;
		double height;
		double weight;
		double BMI;
		
		
		
		System.out.println("This BMI calculator can except metric or standard units which typ would you like to use?");
		System.out.println("Type 1 for metric or 2 for standard.");
		choice = scnr.nextInt();
		
		measureType = (choice ==1);
		
		//if tree for measurement units
		if (measureType) {//metric
			System.out.println("Please enter your height in meters.");
			height = scnr.nextDouble();
			
			System.out.println("Please enter your weight in kilograms.");
			weight = scnr.nextDouble();
			BMI = weight / (height * height);
			
		}
		else {//standard
			System.out.println("Please enter your height in inches.");
			height = scnr.nextDouble();
			
			System.out.println("Please enter your weight in pounds.");
			weight = scnr.nextDouble();
			BMI = 703* weight / (height * height);
			
		}
		//Print BMI and categories
		System.out.printf("Your BMI is %.2f\n", BMI);
		System.out.println("The National Heart Lung and Blood Institute places BMIs into distinct catergories");
		System.out.println("These categories are:");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = 30 or greater");
	}

}
