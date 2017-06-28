// % java TestArrays
// island = Fiji
// island = Cozumel
// island = Bermuda
// island = Azores

class TestArrays {
	public static void main(String[] args) {
		int [] index = new int[4];
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		String [] island = new String[4];
		island[0] = "Bermuda";
		island[1] = "Fiji";
		island[2] = "Azores";
		island[3] = "Conzumel";
		int y = 0;
		int ref;
		while (y < 4) {
			ref = index[y];
			System.out.print("island = ");
			System.out.println(island[ref]);
			y += 1; // same as y = y + 1
		}
	}	
}