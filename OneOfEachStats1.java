/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]); //gets number of trials from user
		double r1 = 0; //establishes a variable for random chance of getting boy or girl
		double avg = 0; //establishes a variable for average of children
		int fam2 = 0; //establishes a variable for amount of families that had 2 kids
		int fam3 = 0; //establishes a variable for amount of families that had 3 kids
		int fam4 = 0; //establishes a variable for amount of families that had 4 kids
		String msg = "The most common number of children is "; //establishes a variable for the last message
		for(int i = 0; i < t; i++){ //runs the OneOfEach program for each number of trials
			int boys = 0;
		    int girls = 0;
			int sum = 0;
			while(boys < 1 || girls < 1){ //runs the OneOfEach program
				r1 = Math.random();
				if(r1 <= 0.4){
					boys += 1;
				}else{
					girls += 1;
				}			
			}
			sum = boys + girls; //sums amount of kids in each trial
			avg += (double) sum; //adds each sum to a total of kids in all trials
			if(sum == 2) fam2++; //adds to number of families with 2 kids
			else if(sum == 3) fam3++; //adds to number of families with 3 kids
			else fam4++; //adds to number of families with 4 or more kids
		}
		avg = avg / t; //gets an average amount of kids from the total amount of trials
		System.out.println("Average: " + avg + " children to get at least one of each gender."); //prints the info
		System.out.println("Number of families with 2 children: " + fam2);
		System.out.println("Number of families with 3 children: " + fam3);
		System.out.println("Number of families with 4 or more children: " + fam4);
		if(fam2 >= fam3){ //calculates the last message based on how many families had how many kids
			if(fam2 >= fam4) msg += "2";
			else msg += "4 or more";
		}else if(fam3 >= fam4){
			msg += "3";
		}else msg += "4 or more";
		System.out.println(msg + ".");
	}
}
