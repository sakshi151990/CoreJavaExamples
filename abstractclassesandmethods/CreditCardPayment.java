package abstractclassesandmethods;

import java.util.Random;

public class CreditCardPayment extends RRPaymentServices{

	
	public CreditCardPayment(double balance, int customerId) {
		super(balance, customerId);
		// TODO Auto-generated constructor stub
	}
	private static int  counter;
	private String paymentId;
	private double cashBack;
	private double balanceDue;
	public String getPaymentId() {
		return paymentId;
	}
	public double getCashBack() {
		return cashBack;
	}
	public double getBalanceDue() {
		return balanceDue;
	}
	@Override
	public void payBill(double amount) {
		if(amount > getBalance())
		{
			cashBack=amount-getBalance();
			
		}
		
		else {
			balanceDue=getBalance()-amount;
		}
		
		Random random=new Random();
		paymentId="C"+counter+random.nextInt(1000);
	}
	
	
	
}
