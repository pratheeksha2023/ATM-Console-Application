package ATMProject;

public class ATMService {

	private String[] transactions = new String[5];
	private int count = 0;

	public void addTransaction(String msg) {
		if (count < transactions.length) {
			transactions[count++] = msg;
		} else {
			for (int i = 0; i < transactions.length - 1; i++) {
				transactions[i] = transactions[i + 1];
			}
			transactions[transactions.length - 1] = msg;
		}
	}

	public void showMiniStatement() {
		System.out.println("\n--- Mini Statement ---");
		if (count == 0) {
			System.out.println("No transactions available.");
		} else {
			for (int i = 0; i < count; i++) {
				System.out.println(transactions[i]);
			}
		}
	}

}
