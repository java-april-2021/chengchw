
import Bank.BankAccount;

class BankTest{

    public static void main(String[]args){

        BankAccount B1 = new BankAccount();
        B1.getTotalAccountNum();
        BankAccount B2 = new BankAccount();
        BankAccount B3 = new BankAccount();
        B1.getTotalBankMoney();
        B3.getTotalBankMoney();
        B1.getCheckBal();
        B1.getSaveBal();
        B1.depCheck(500.5);
        B1.depSave(40.6);
        B1.getCheckBal();
        B1.getSaveBal();
        B1.totalBalance();
        B1.withdrawCheck(210.5);
        B1.withdrawSave(50);        
        B1.getCheckBal();
        B1.totalBalance();
        B3.getTotalBankMoney();
        B3.getTotalAccountNum();
        
    }
}