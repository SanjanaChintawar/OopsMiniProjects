

//An e-commerce website supports multiple payment methods

// Interface
interface Payment{
    void pay(double amount);
}

// class
class CreditCardPayment implements Payment{
    double cardNumber;
    String cardHolder;

    public CreditCardPayment(double cardNumber, String cardHolder) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    
    public void pay(double amount){
        System.out.println();
        System.out.println("Payment Successfull");
        System.out.println("Method: Credit Card Payment");
        System.out.println("Amount: "+ amount);    
        System.out.println("Card Holder: "+ cardHolder);
        System.out.println("Card Number: "+ cardNumber);  
    }
    
}
class UPIPayment implements Payment{

    String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount){
        System.out.println();
        System.out.println("Payment Successfull");
        System.out.println("Method: UPI");
        System.out.println("ID: "+ upiId);
        System.out.println("Amount: "+ amount); 
    }

    

}
class NetBankingPayment implements Payment{
    String bankName;

    public NetBankingPayment(String bankName) {
        this.bankName = bankName;
    }

    public void pay(double amount){
        System.out.println();
        System.out.println("Payment Successfull");
        System.out.println("Method: Net Banking");
        System.out.println("Bank: "+ bankName);
        System.out.println("Amount: "+ amount); 
    }
}
public class pay {
    public static void main(String[] args) {

        Payment[] pay1 = {
            new CreditCardPayment(101011, "Sanjana"),
            new UPIPayment("7038upi@upi"),
            new NetBankingPayment("BOB")
        };

        for(Payment pay: pay1){
            pay.pay(2500);
        }
        
    }
}
