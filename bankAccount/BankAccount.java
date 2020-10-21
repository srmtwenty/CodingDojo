import java.util.Random;

public class BankAccount {
	private String accountNumber = ""; 
	private double checkingBalance;
	private double savingBalance;
	
	private static int accountCount = 0;
	
	private static double totalAmount = 0;
	
	private String makeAccountNumber() {
		Random r = new Random();
		for(int i = 0; i< 10; i++) {
			accountNumber += Integer.toString(r.nextInt(10));
		}
		return accountNumber;
	}
	
	public BankAccount() {
        makeAccountNumber();
        accountCount++;
    }

    // getter
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;    
    }

    public void addCheckingBalance(double amount){
        checkingBalance += amount;
        totalAmount += amount;
    }

    public void addSavingBalance(double amount){
        savingBalance += amount;
        totalAmount += amount;
    }

	public void withdrawCheckingBalance(double amount){
        if (amount > checkingBalance){
            System.out.println("Insufficient money");
        }
        else {
            checkingBalance -= amount;
        }
    }

    public void withdrawSavingBalance(double amount){
        if (amount > savingBalance){
            System.out.println("Insufficient money");
        }
        else{
            savingBalance -= amount;
        }
    }

    public void displayTotalBalance(){
        System.out.println(String.format("Checking: %s \nSavings: %s", getCheckingBalance(), getSavingBalance()));
    }

}