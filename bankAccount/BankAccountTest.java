import java.util.Random;

public class BankAccountTest{
    public static void main(String [] args){
        BankAccount iD = new BankAccount();
        BankAccount iD2 = new BankAccount();

        iD.addCheckingBalance(100.99);
        iD.addSavingBalance(50.00);
        iD.withdrawCheckingBalance(50.58);
        iD.withdrawCheckingBalance(60.99);
        iD.displayTotalBalance();
    }
}