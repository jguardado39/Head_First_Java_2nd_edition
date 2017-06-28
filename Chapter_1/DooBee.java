// Given the output:
// % java DooBee
// DooBeeDooBeeDo

public class DooBee {
	public static void main(String[] args) {
		int x = 1;
		while (x <  3) {
			System.out.print("Doo");
			System.out.print("Bee");
			x += 1; // Same as x = x + 1
		}
		if (x == 3) {
			System.out.println("Do."); // Adjust so that creates new line for astetic purposes
		}
	}
}