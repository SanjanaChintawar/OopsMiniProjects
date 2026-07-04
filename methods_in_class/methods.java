
class Bank{
    double balance;
    String name;
    String account;

    void showAccount(){
        System.out.println("Name of Account holder: "+ name);
        System.out.println("Account type: "+ account);
        System.out.println("Current Balance: "+ balance);
    }

    void viewBalance(){
        System.out.println("Balance: "+ balance);
    }

    void withdraw(double amount){
        if(balance > amount){
            balance = balance - amount;
            System.out.println("Amount successfully withdrawed!");
        }
        else System.out.println("Not enough balance!!");
        
    }
     
    void deposit(double money){
        balance = balance + money;
        System.out.println("Amount Successfully deposited in your current bank account!!");
    }

    

}

public class methods{
    public static void main(String[] args){
        
        Bank b1 = new Bank();
        b1.account = "Saving";
        b1.balance = 1000;
        b1.name = "Sanjana Chintawar";

        Bank b2 = new Bank();
        b2.account = "Saving";
        b2.balance = 2000;
        b2.name = "Harsh Mahajan";

        b1.showAccount();
        b1.deposit(200);
        b1.viewBalance();
        b1.withdraw(300);
        b1.viewBalance();

        b2.showAccount();
        b2.withdraw(3000);

        

    }
}