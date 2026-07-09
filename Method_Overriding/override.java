

// parent class
class FoodItem{
    String foodName;
    double price;

    void Prepare(){
        System.out.println("Food is preparing ....");
    }
}

// child 1
class Pizza extends FoodItem{
    String crustType;

    Pizza(String foodName, double price, String crust){
        this.foodName = foodName;
        this.price = price;
        crustType = crust;
    }

    @Override // annotation
    void Prepare(){
       
        System.out.println("Preparing Pizza...");
        System.out.println("Food Item: "+ foodName);
        System.out.println("Price: "+ price);
        System.out.println("Crust: " + crustType);
        System.out.println();
    }

}

// child 2
class Burger extends FoodItem{
    String isVeg;

    Burger(String foodName, double price, String isVeg){
        this.foodName = foodName;
        this.price = price;
        this.isVeg = isVeg;
    }

    @Override
    void Prepare(){
        System.out.println("Preparing Burger...");
        System.out.println("Food Item: "+ foodName);
        System.out.println("Price: "+ price);
        System.out.println("Veg: " + isVeg);
        System.out.println();
    }

}

// child 3
class Biryani extends FoodItem{
    String spiceLevel;

    Biryani(String foodName, double price, String spiceLevel){
        this.foodName = foodName;
        this.price = price;
        this.spiceLevel = spiceLevel;
    }

    @Override
    void Prepare(){
        System.out.println("Preparing Biryani....");
        System.out.println("Food Item: "+ foodName);
        System.out.println("Price: "+ price);
        System.out.println("Spice Level: "+ spiceLevel);
        System.out.println();
    }
}


public class override{
    public static void main(String[] args){
        Pizza p1 = new Pizza("Margherita", 299, "Cheese Brust");
        Burger b1 = new Burger("Veg Aalu tikki Burger", 120, "Yes");
        Biryani bi1 = new Biryani("Chicken Biryani", 430, "High");

        p1.Prepare();
        b1.Prepare();
        bi1.Prepare();
    }
}