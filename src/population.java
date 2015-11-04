import java.util.Scanner;
public class population {

	// Declare a function/formula to calculate the new population: F(P,r) := P * (1+ r/100)
	public static double newPop(double p, double r)
	{
		return p * (1.0 + r/100.0);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare initial population (2014) and growth rate
		double pop = 123.8;
		double rate = 0.5;

		// prompt to ask user to input the target population (in double)
		Scanner kboard = new Scanner(System.in);

		System.out.print("Enter your target population (in millions): ");
		double tgtPop = Double.parseDouble(kboard.nextLine());
		// make a while loop, check if current populat exceed target population
		int year = 2014;
		while (pop <= tgtPop)
		{
			// if not, update the new population and increment year

			pop = newPop(pop,rate);
			year++;

			System.out.print("Year: " + year + "  ");
			System.out.println("Population: " + pop + " millions");

		
		}
		// after while loop break => population > target population
		// print out the year (year) and the current population
		System.out.println("At year " + year + ", Population is " + pop + " millions; exceed target population " + tgtPop);
	}

}
