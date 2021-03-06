/**
	* A cash register totals up sales and computes change due.
	*/
public class CashRegister {

	/**
	 * Instance variables go here
	 */ 
	
	private double purchase;
	private double payment;

	/**
	* Constructs a cash register with no money in it.
	*/
	
	public CashRegister(){
		payment = 0;
		purchase = 0;
	}

	/**
	* Records the sale of an item.
	* @param amount the price of the item
	*/
	
	public void recordPurchase(double cost) {
		purchase = purchase + cost;
	}

	/**
	* Processes a payment received from the customer.
	* @param amount the amount of the payment
	*/
	
	public void recievePayment(double amount) {
		payment = payment + amount;
	}

	/**
	* Computes the change due and resets the machine for the next customer.
	* @return the change due to the customer
	*/
	public double giveChange() {
		return (payment - purchase);
	}
	
}
