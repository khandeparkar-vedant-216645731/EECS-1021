package graded_tasks;

public class Account {
	
	Account acc1;
	Account acc2;
	Account acc3;
	Account acc4;
	String name;
	char type;
	double initialBalance;
	
	Account(String name, char type, double initialBalance) {
        this.name = name;
        this.type = type;
        this.initialBalance = initialBalance;
	}
	
	Account(String name, char type) {
		this.name = name;
		this.type = type;
	}
	
	double getBalance() {
		double balance = 0.0;
		balance = this.initialBalance;
		return balance;
	}
	
	double setBalance(double amount) {
		double balance = 0.0;
		this.initialBalance = this.initialBalance + amount;
		return balance;
	}
	
	String getDescription() {
		String description = "";
		
		if (type == 'i') {
			description = "International account with owner " + this.name + " has current balance $" + this.initialBalance;
		}
		else  {
			description = "Domestic account with owner " + this.name + " has current balance $" + this.initialBalance;
		}
		
		return description;
	}
	
	void deposit(double amount) {
		if (type == 'i') {
			this.initialBalance = this.initialBalance + (0.9*amount);
		}
		else {
			this.initialBalance = this.initialBalance + amount;
		}
	}
	
    void withdraw(double amount) {
    	if (type == 'i') {
			this.initialBalance = this.initialBalance - (1.1*amount);
		}
		else {
			this.initialBalance = this.initialBalance - amount;
		}
	}
    
    void transferTo(Account name, double amount) {
    	if (type == 'i') {
			this.initialBalance = this.initialBalance - (1.1*amount);
		}
		else {
			this.initialBalance = this.initialBalance - amount;
		}
		name.deposit(amount);
    }
}
