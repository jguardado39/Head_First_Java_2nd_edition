public class RyanAndMonicaJob implements Runnable {

	private BankAccount account = new BankAccount();

	public static void main(String[] args) {
		RyanAndMonicaJob theJob = new RyanAndMonicaJob();
		Thread one = new Thread(theJob);
		Thread two = new Thread(theJob);
		one.setName("Ryan");
		one.setName("Monica");
		one.start();
		two.start();
	}

	private void makeWithdrawal (int amount) {
		if (account.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw");
			try {
				System.out.println(Thread.currentThread().getName() + " is going to sleep");
				Thread.sleep(500);
			} catch (InterruptedException ex) {ex.printStackTrace(); }
			System.out.println(Thread.currentThread().getName() + " woke up.");
			account.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawl");
		} else {
			System.out.println("Sorry, not enough for " + Thread.currentThread().getName());
		}
	}
}