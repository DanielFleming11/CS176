import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
// Creates new Cash Register
		CashRegister newCashregister = new CashRegister();
	
	
// Loop for purchase amount
	int x = 0;
	
	while(x != -1) {
		System.out.println("Enter a purchase amount, or -1 to stop: ");
		
		double purch = scan.nextDouble();
		
// Ends Loop if -1
		if(purch == -1) {
			x = -1;
		}
// Records Purchase
		else {
			newCashregister.recordPurchase(purch);
		}
		
	}
// Take Payment
	System.out.println("Enter a payment: ");
	double pay = scan.nextDouble();
	newCashregister.recievePayment(pay);

// Print Change
	System.out.println("Your change is: " + newCashregister.giveChange());
	
	

}
}


