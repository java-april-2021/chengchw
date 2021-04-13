
package Bank;
import java.util.Random;

public class BankAccount{

    private String AccountName;
    private double CheckingBalance;
    private double SavingBalance;

    public static int NumberOfAccount = 0;
    public static double TotalMoney = 0;

    public BankAccount(){

        this.AccountName = this.createAccount();
        NumberOfAccount += 1;
    }

    

    private String createAccount(){

        String ActNum ="";
        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            ActNum += rand.nextInt(10);
        }
        return ActNum;
    }

    public static void getTotalBankMoney(){

        System.out.println("Total Money in Bank is: " + TotalMoney+ "\n");
    }

    public static void getTotalAccountNum(){

        System.out.println("Total Accounts in Bank are: " + NumberOfAccount+ "\n");
    }

    public double getCheckBal(){

        System.out.print("Account Name: " + this.AccountName + "\n");
        System.out.print("Checking Balance is: " + this.CheckingBalance+ "\n");
        return this.CheckingBalance;

    }

    public double getSaveBal(){

        System.out.print("Account Name: " + this.AccountName + "\n");
        System.out.print("Saving Balance is: " + this.SavingBalance+ "\n");
        return this.SavingBalance;

    }

    public void depCheck(double money){

        this.CheckingBalance += money;
        System.out.print("Account Name: " + this.AccountName +  "\n");
        System.out.print("Checking Balance after deposit is: " + this.CheckingBalance+ "\n");
        this.TotalMoney += money;
        
    }

    public void depSave(double money){

        this.SavingBalance += money;
        System.out.print("Account Name: " + this.AccountName +  "\n");
        System.out.print("Saving Balance after deposit is: " + this.SavingBalance+ "\n");
        this.TotalMoney += money;
        
    }

    public void withdrawCheck(double money){

        if (money < this.CheckingBalance){

            this.CheckingBalance -= money;
            System.out.print("Account Name: " + this.AccountName +"\n");
            System.out.print("Checking Balance after withdraw is: " + this.CheckingBalance+ "\n");
            this.TotalMoney -= money;
        }
        else{
            
            System.out.print("Account Name: " + this.AccountName + "\n");
            System.out.print("You don't have enough money." + "\n");

        }
                
    }

    public void withdrawSave(double money){

        if (money < this.SavingBalance){

            System.out.print("Account Name: " + this.AccountName + "\n");
            System.out.print("Saving Balance after withdraw is: " + this.SavingBalance+ "\n");
            this.TotalMoney -= money;
        }
        else{
            
            System.out.print("Account Name: " + this.AccountName + "\n");
            System.out.print("You don't have enough money." + "\n");

        }
                
    }

    public double totalBalance(){

        double Total = this.CheckingBalance + this.SavingBalance;
        System.out.println("Your Total Balance is: " + Total + "\n");
        return Total;       
    }
}