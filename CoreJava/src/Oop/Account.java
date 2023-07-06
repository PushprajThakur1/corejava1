package Oop;

public class Account {
	private String name = null;
	private String account = null;
	private double balance = 10;
	private String accountType;
	private int deposit;
	private int Withdraw;
	private int fundtransfer;
	private int paybill;

	public void setname(String n) {
		name = n;

	}

	public String getname() {
		return name;

	}

	public void setAccountType(String a) {
		accountType = a;

	}

	public String getAccountType() {
		return accountType;

	}

	public void setBalance(double b) {
		balance = b;

	}

	public double getbalance() {
		return balance;

	}

	public void setDeposit(int d) {
		deposit = d;

	}

	public int getDeposit() {
		return deposit;

	}

	public void setWithdraw(int w) {
		Withdraw = w;

	}

	public int getWithdraw() {
		return Withdraw;

	}

	public void setfundtransfer(int f) {
		fundtransfer = f;

	}

	public int getfundtransfer() {
		return fundtransfer;

	}

	public void settpaybill(int pb) {
		paybill = pb ;
		
	}
	
	public int getpaybill () {
		return paybill;
		
	}
}
