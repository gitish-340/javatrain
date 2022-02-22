package threads;

import java.util.Scanner;

class Account1 {
	private int bal;

	public Account1(int bal) {
		this.bal = bal;
	}

	public boolean isSufficient(int w) {
		if (bal > w) {
			return (true);
		} else {
			return (false);
		}
	}

	public void withdraw(int amt) {
		bal = bal - amt;
		System.out.println("Withdrawl money is :" + amt);
		System.out.println("Your current balance is :" + bal);
	}

	class Customer1 implements Runnable {
		private Account account;
		private String name;

		public Customer1(Account account, String n) {
			this.account = account;
			name = n;
		}

		public void run() {
			Scanner sc = new Scanner(System.in);

			synchronized (account) {
				System.out.println(name + ",Enter amount to withdraw");
				int amt = sc.nextInt();
				if (account.isSufficient(amt)) {
					System.out.println(name);
					account.withdraw(amt);
				} else {
					System.out.println("Insufficient balance");
				}
			}

		}
	}
}

public class Banking {

	public static void main(String[] args) {
		Account1 a1 = new Account1(1000);
		Customer1 c1 = new Customer1(a1, "Raj"), c2 = new Customer1(a1, "Simran");
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}
}