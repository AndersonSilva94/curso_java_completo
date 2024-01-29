package entities;

public class BankAccount {
	private String holder;
	private int account;
	private double value;
	
	public BankAccount(String holder, int account) {
		this.holder = holder;
		this.account = account;
	}
	
	public BankAccount(String holder, int account, double value) {
		this.holder = holder;
		this.account = account;
		deposit(value);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		if(!(this.account != 0)) {
			this.account = account;
		}
	}

	public double getValue() {
		return value;
	}
	
	public void deposit(double value) {
		this.value += value;
	}
	
	public void withdraw(double value) {
		this.value -= value + 5.00;
	}
	
	public String toString() {
		return "Account " + account +
				", Holder: " + holder +
				", Balance: $ " + String.format("%.2f", value);
				
	}
}
