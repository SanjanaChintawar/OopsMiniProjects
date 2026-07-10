
// class
class ShoppingCart{
    // overloaded method
    double calculateTotal(double price){
        return price;
    }

    double calculateTotal(double price, int quantity){
        return price*quantity;
    }

    double calculateTotal(double price, int quantity, double discount){
        return (price * quantity) - discount;
    }

    double calculateTotal(double price, int quantity, double discount, double tax){
        return ((price * quantity) - discount) + tax;
    }

    double calculateTotal(double[] prices){
        double total = 0;
        for(int i = 0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }

}


public class overloading {
    public static void main(String[] args){
       
        ShoppingCart sc = new ShoppingCart();
        double[] prices = {100,200,300,400};

        System.out.println(sc.calculateTotal(500));
        System.out.println(sc.calculateTotal(500,2));
        System.out.println(sc.calculateTotal(500,2,100)); 
        System.out.println(sc.calculateTotal(500,2,100,50));
        System.out.println(sc.calculateTotal(prices));
        
    }
}
