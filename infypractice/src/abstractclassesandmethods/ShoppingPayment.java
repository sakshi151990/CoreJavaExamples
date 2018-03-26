package abstractclassesandmethods;

import java.util.Random;

public class ShoppingPayment extends RRPaymentServices{

	private static int counter;
	private String paymentId;
	
	public String getPaymentId() {
		return paymentId;
	}

	public ShoppingPayment(double balance, int customerId) {
		super(balance, customerId);
		this.counter = counter;
		this.paymentId = paymentId;
	}

	@Override
	public void payBill(double amount) {
		// TODO Auto-generated method stub
		
	
				if(amount != getBalance() )
					System.out.println("Error amount entered is wrong");
				else
				{Random random=new Random();
					paymentId="S"+counter+random.nextInt(1000);
			}
		}
		
	}


