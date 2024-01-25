/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]); //gets number of trials from user
		double bigSum = 0; //establishes a variable for average of children
		int fam2 = 0; //establishes a variable for amount of families that had 2 kids
		int fam3 = 0; //establishes a variable for amount of families that had 3 kids
		int fam4 = 0; //establishes a variable for amount of families that had 4 kids
		String msg = "The most common number of children is "; //establishes a variable for the last message
		for(int i = 0; i < t; i++){ //runs the OneOfEach program for each number of trials
			boolean boys = false;
		    boolean girls = false;
			int sum = 0;
			while(!(boys && girls)){ //runs the OneOfEach program
				double r1 = Math.random();
				if(r1 <= 0.4){
					boys = true;
				}else{
					girls = true;
				}
				sum++; //sums amount of kids in each trial					
			}
			
		bigSum += sum; //adds each sum to a total of kids in all trials
		if (sum == 2) {
			fam2++;
		} else {
		    if (sum == 3) {
		    	fam3++;
				} else {
					fam4++;
				}
			}
		}
		double avg = bigSum / t; //gets an average amount of kids from the total amount of trials
		System.out.println("Average: " + avg + " children to get at least one of each gender."); //prints the info
		System.out.println("Number of families with 2 children: " + fam2);
		System.out.println("Number of families with 3 children: " + fam3);
		System.out.println("Number of families with 4 or more children: " + fam4);
		String common = "The most common number of children is ";
		int max = Math.max(Math.max(fam2, fam3), fam4);
		if (max == fam2) {
			common += "2.";
		} else {
			if (max == fam3) {
				common+= "3.";
			} else {
			    common+= "4 or more.";
			}
		}
		System.out.println(common);
	}
}
