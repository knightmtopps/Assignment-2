import java.util.Scanner;

public class Polling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int [][] pollingArray = new int[5][10];
		String [] pollingIssues = new String[5];
		int i;
		int j;
		double [] averageArray = new double[5];
		double highestPoint;
		int highest;
		double lowestPoint;
		int lowest;
		
		pollingIssues[0] = "pizza";
		pollingIssues[1] = "tacos";
		pollingIssues[2] = "hamburgers";
		pollingIssues[3] = "beer";
		pollingIssues[4] = "Peace in the Middle East";
		
		//Question loop
		//person loop
		for (i=0; i < 10; i++) {
			//topic loop
			for (j=0; j < 5; j++) {
				System.out.println("Person " + i + ", on a scale of 1 to 10 how important is " + pollingIssues[j] + "?");
				pollingArray[j][i] = scnr.nextInt();
				averageArray[j] = averageArray[j] + pollingArray[j][i] / 10.0;
			}// end topic loop
		}// end person loop
		
		//Response Header
		System.out.printf("Topic\t\t\t\t");
		for (i=0; i < 10; i++) {
			System.out.printf("Person %d\t", i);
			
			
		}
		System.out.println("average response");
		//Issue 0
		System.out.printf(pollingIssues[0] + "\t\t\t\t");
		for (i=0; i < 10; i++) {
			
				System.out.printf("%d\t\t",pollingArray[0][i] );
			
	}
		System.out.printf("%.1f\n",averageArray[0]);
		
		//Issue 1
				System.out.printf(pollingIssues[1] + "\t\t\t\t");
				for (i=0; i < 10; i++) {
					
						System.out.printf("%d\t\t",pollingArray[1][i] );
					
			}
				System.out.printf("%.1f\n",averageArray[1]);
				
				//Issue 2
				System.out.printf(pollingIssues[2] + "\t\t\t");
				for (i=0; i < 10; i++) {
					
						System.out.printf("%d\t\t",pollingArray[2][i] );
					
			}
				System.out.printf("%.1f\n",averageArray[2]);
				
				//Issue 3
				System.out.printf(pollingIssues[3] + "\t\t\t\t");
				for (i=0; i < 10; i++) {
					
						System.out.printf("%d\t\t",pollingArray[3][i] );
					
			}
				System.out.printf("%.1f\n",averageArray[3]);
				
				//Issue 4
				System.out.printf(pollingIssues[4] + "\t");
				for (i=0; i < 10; i++) {
					
						System.out.printf("%d\t\t",pollingArray[4][i] );
					
			}
				System.out.printf("%.1f\n",averageArray[4]);
				
				//Highest Point
				highestPoint = 0;
				highest = 0;
				for (i=0; i<5; i++) {
					if (averageArray[i] > highestPoint) {
						highestPoint = averageArray[i];
						highest = i;
					}
					
				}
				System.out.printf(pollingIssues[highest] + " was most important to people with an average rating of %.1f.\n",highestPoint);
				//Lowest Point
				lowestPoint = 100;
				lowest = 0;
				for (i=0; i<5; i++) {
					if (averageArray[i] < lowestPoint) {
						lowestPoint = averageArray[i];
						lowest = i;
					}
					
				}
				System.out.printf(pollingIssues[lowest] + " was least important to people with an average rating of %.1f.\n",lowestPoint);
	}

}
