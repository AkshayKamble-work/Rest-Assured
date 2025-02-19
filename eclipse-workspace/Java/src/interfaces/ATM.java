package interfaces;

public interface ATM 

{

	
	void generatePin();
    void cashWithdrawal(double amount);
    void cashDeposit(double amount);
    void setPin(int newPin);
    void resetPin();
    boolean validatePin(int enteredPin);
}
