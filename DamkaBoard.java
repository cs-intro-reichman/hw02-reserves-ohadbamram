/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String display = "";
		for(int i = 0; i < n ; i++){
			if(i == n - 1) display += "*";
			else display += "* ";
		}
		for(int j = 0; j < n ; j++){
			if((j == 0) || (j % 2 == 0)) System.out.println(display + " ");
			else System.out.println(" " + display);
		}
	}
}
