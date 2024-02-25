/*Design a class to represent a Bank Account. Include the following things: 
Fields
● Name of the depositor
● Account number
● Type of account
● Balance amount in the account 
Methods
● To assign initial values
● To deposit an amount
● To withdraw an amount after checking balance
● To display the name and balance
*/
import java.util.Scanner;
class BankAccount {
	private String depositorName;
	private long accNum;
	private String accType;
	private double balance;
	//without constructor,initialization will be done by method only(question)
	void initialization(String depositorName,long accNum,String accType,double balance) {
		this.depositorName=depositorName;
		this.accNum=accNum;
		this.accType=accType;
		this.balance=balance;
	}
	void deposit(double balance) {
		this.balance+=balance;
	}
	double withdraw(double amount) {
		if(amount <= this.balance){
			this.balance -= amount;
			return amount;
		}
		else{
			System.out.println("Oppsss...your withdraw amount is unsufficient");
			return 0.0;
		}
	}
	void display() {
		System.out.println("Name              Acc.           AccType          Balance");
		System.out.println(this.depositorName+"   "+this.accNum+"   "+this.accType+"   "+this.balance);
	}
}

public class TestClass5 {
	public static void main(String[] args) {
		int input;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Depositor name: ");
		String name=sc.nextLine();
		System.out.print("Enter the Account no.: ");
		long accNum=sc.nextLong();
		sc.nextLine();
		System.out.print("Enter the Account type: ");
		String type=sc.next();
		System.out.print("Enter the Balance Amount: ");
		double bal=sc.nextDouble();
		
		BankAccount cust=new BankAccount();
		cust.initialization(name,accNum,type,bal);
		cust.display();
		
		System.out.print("Enter 1 for Deposit or 2 for Withdraw or press 0 for nothing: ");
		input=sc.nextInt();
		switch(input){
			case 1:
				System.out.print("Enter the Deposit balance: ");
				double dep=sc.nextDouble();
				cust.deposit(dep);
				cust.display();
				break;
			case 2:
				System.out.print("Enter the Withdraw amount: ");
				double withdrawAmaount=sc.nextDouble();
				cust.withdraw(withdrawAmaount);
				cust.display();
				break;
			case 0:
				System.out.println("Exit!!!");
				break;
			default:
				System.out.println("You entered invalid number!!!");
		}
		sc.close();
	}
}

/*output:
Enter the Depositor name: Raghab Ganguly
Enter the Account no.: 111111111111
Enter the Account type: personal
Enter the Balance Amount: 2000
Name              Acc.             AccType              Balance
Raghab Ganguly   111111111111   personal   2000.0
Enter 1 for Deposit or 2 for Withdraw or press 0 for nothing: 2
Enter the Withdraw amount: 1000
Name              Acc.             AccType              Balance
Raghab Ganguly   111111111111   personal   1000.0
*/
	
	
		