// % java Shuffle1
// a-b c-d

class Shuffle1 {
	public static void main(String[] args) {
		int x = 3;
		while (x > 0) {
			if (x > 2) {
				System.out.print("a");
			}
			if (x == 2) {
				System.out.print("b c");
			}
			if (x == 1) {
				System.out.println("d"); // creates new line at the end of the code
				x -= 1; // Equivalent to x = x - 1
				return; // used to supersede the added "-" below this code.
			}
			x -= 1;
			System.out.print("-");
		}
	}
}