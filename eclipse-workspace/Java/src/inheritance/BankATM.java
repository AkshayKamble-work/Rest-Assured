package inheritance;

import interfaces.ATM;

public class BankATM implements ATM
{
    private int pin;
    private double balance;

    public BankATM() {
        generatePin();
        this.balance = 0.0;
    }

    @Override
    public void generatePin() {
        this.pin = (int) (Math.random() * 9000) + 1000; // Generates a random 4-digit PIN
        System.out.println("Your new PIN is: " + this.pin);
    }

    @Override
    public void setPin(int newPin) {
        if (newPin >= 1000 && newPin <= 9999) {
            this.pin = newPin;
            System.out.println("PIN set successfully.");
        } else {
            System.out.println("Invalid PIN. Please enter a 4-digit PIN.");
        }
    }

    @Override
    public void resetPin() {
        generatePin();
    }

    @Override
    public void cashDeposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Successfully deposited: $" + amount);
            System.out.println("Current balance: $" + this.balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive amount.");
        }
    }

    @Override
    public void cashWithdrawal(double amount) {
        if (amount > 0 && amount <= this.balance) 
        {
            this.balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
            System.out.println("Current balance: $" + this.balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    @Override
    public boolean validatePin(int enteredPin) {
        return this.pin == enteredPin;
    }
	
	public static void main(String[] args) 
	{
		BankATM atm = new BankATM();

        // Simulating operations without user input
        int enteredPin = atm.pin; // Using the generated PIN for validation

        if (atm.validatePin(enteredPin)) {
            System.out.println("PIN validated successfully.");
            atm.cashDeposit(1000);
            atm.cashWithdrawal(500);
            atm.setPin(1234);
            atm.resetPin();
        } else {
            System.out.println("Invalid PIN. Access denied.");
        }
	}
	
}
