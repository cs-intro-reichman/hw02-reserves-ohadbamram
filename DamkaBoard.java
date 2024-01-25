/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]); //gets an int from the user
		for(int i = 0; i < n ; i++){ //a loop that makes n rows
			if(i % 2 != 0){ //if the row is odd, adds a space
					System.out.print(" ");
				}
			for(int j = 0; j < n ; j++){ //prints a * for every number until n
				System.out.print("* ");
			}
			System.out.println(); //prints the board
		}
	}
}
