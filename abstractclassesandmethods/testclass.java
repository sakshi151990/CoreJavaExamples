package abstractclassesandmethods;

public class testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditCardPayment cc=new CreditCardPayment(10000.23, 5001);
		
		cc.payBill(0);
		
		System.out.println("*************************************************");
		System.out.println("CustomerId : "+ cc.getCustomerId());
		System.out.println("PaymentID: "+ cc.getPaymentId());
		System.out.println("Previous Due :" + cc.getBalanceDue());
		System.out.println("CashBack: "+ cc.getCashBack());
		
	

	
	ShoppingPayment  sp=new ShoppingPayment(5000, 5678);
	sp.payBill(4000);
}
}