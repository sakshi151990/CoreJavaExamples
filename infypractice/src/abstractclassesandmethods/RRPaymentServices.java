package abstractclassesandmethods;

public abstract class RRPaymentServices {
	
	private double balance;
	private int customerId;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public RRPaymentServices(double balance, int customerId) {
		super();
		this.balance = balance;
		this.customerId = customerId;
	}
	
	
	public abstract void payBill(double amount);
	
}
