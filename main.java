package ATMProject;

import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		// Polymorphism: parent reference, child object
		Account account = new SavingsAccount(10000, 1234);
		ATMService service = new ATMService();

		int attempts = 3;
		boolean authenticated = false;

		while (attempts > 0) {
			try {
				System.out.print("Enter PIN: ");
				int pin = sc.nextInt();

				if (account.validatePin(pin)) {
					authenticated = true;
					break;
				} else {
					attempts--;
					System.out.println("Wrong PIN. Attempts left: " + attempts);
				}
			} catch (Exception e) {
				System.out.println("Enter numbers only.");
				sc.next();
			}
		}

		if (!authenticated) {
			System.out.println("Card blocked.");
			return;
		}

		int choice = 0;

		while (choice != 5) {
			System.out.println("\n1. Balance\n2. Deposit\n3. Withdraw\n4. Mini Statement\n5. Exit");
			System.out.print("Choice: ");

			try {
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Balance: Rs." + account.getBalance());
					break;

				case 2:
					System.out.print("Amount: ");
					double dep = sc.nextDouble();
					if (dep > 0) {
						account.deposit(dep);
						service.addTransaction("Deposited Rs." + dep);
					} else {
						System.out.println("Invalid amount.");
					}
					break;

				case 3:
					System.out.print("Amount: ");
					double wd = sc.nextDouble();
					if (wd <= 0) {
						System.out.println("Invalid amount.");
					} else if (!account.withdraw(wd)) {
						System.out.println("Insufficient balance.");
					} else {
						service.addTransaction("Withdrawn Rs." + wd);
						System.out.println("Collect cash.");
					}
					break;

				case 4:
					service.showMiniStatement();
					break;

				case 5:
					System.out.println("Thank you.");
					break;

				default:
					System.out.println("Invalid choice.");
				}

			} catch (Exception e) {
				System.out.println("Invalid input.");
				sc.next();
			}
		}

		sc.close();

	}

}
