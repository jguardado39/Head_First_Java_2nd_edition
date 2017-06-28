class DungeonTest {
	public static void main(String[] args) {
		DungeonGame d = new DungeonGame();
		System.out.println(d.getX() + d.getY() + d.getZ());
		try {
			FileOutputStream fos = new FileOutputStream("dg.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			oos.close();
			FileInputStream fs = new FileInputStream("dg.ser");
			ObjectInputStream ois = new ObjectInputStream(fs);
			d = (DungeonGame) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(d.getX() + d.getY() + d.getZ());
	}
}