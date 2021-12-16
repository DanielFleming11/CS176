import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankTester {

//Throw Exception
	public static void main(String[] args) throws FileNotFoundException {
		
//Try Block
				try {
					
//Variables
		int tranType = 0;
		int accountNumber = 0;
		String accountName = "";
		double amount = 0;
		
//Create Savings Account Array
		SavingsAccount [ ] slist;
		slist = new SavingsAccount[10];
		

//Open Text	
			Scanner scan = new Scanner(new File("transactions.txt"));
			
			while(tranType != '2') {
				int ctr = 0;
				int a = 0;
				int b = 1;
				int c = 2;
				int d = 3;
//Read File
				String trans = scan.nextLine();
				
//Split Into Fields
				String [ ] fields= trans.split(",");
				tranType = Integer.parseInt(fields[a]);
//Break if 2
				if(tranType == 2) {
					break;
				}
				
				accountNumber = Integer.parseInt(fields[b]);
				accountName = fields[c];
				amount = Double.parseDouble(fields[d]);
				
//Add Object into Array
				slist[ctr] = new SavingsAccount(accountNumber, accountName, amount);
				System.out.println("Savings account " + accountNumber + " created for " + accountName + " with opening balance of " + amount);
				
//Counters
				a = a + 4;
				b = b + 4;
				c = c + 4;
				d = d + 4;
				ctr++;
			}
			
			while(tranType != '9') {
				int i = 0;
				double bal = 0;
				int acc = 0;
				
				String trans = scan.nextLine();
				String [ ] fields= trans.split(",");
				tranType = Integer.parseInt(fields[i]);
//Break if 9
				if(tranType == 9) {
					break;
				}
				
//Find Account in slist
				for (SavingsAccount account : slist) {
					acc = account.getAccount();
//Deposit
					if(tranType == '3') {
						account.deposit(amount);
						System.out.println("Deposit of " + amount + " to account " + acc);
					}
//Withdraw
					if(tranType == '4') {
						bal = account.getBalance();
//Cannot Withdraw
						if(bal < amount) {
							System.out.println("Cannot withdraw " + amount + " from account " + acc);
						}
//Can Withdraw
						else {
							account.withdraw(amount);
							System.out.println("Withdrawal of " + amount + " to account " + acc);
						}
					}
					i = i + 4;
				}
//Get Balance
				for(SavingsAccount account : slist) {
					bal = account.getBalance();
				}
//Print Balance
				System.out.println("Balance for account " + acc + " is " + bal);
			}		
		} 
				catch(FileNotFoundException e) {
					System.out.println("Error Occured.");
				}
		}
}
