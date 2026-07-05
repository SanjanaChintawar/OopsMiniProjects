
class library{
    String bookName;
    String author;
    int price;

    library(String bookName, String author, int price){
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    void display(){
        System.out.println("Book Name: "+ bookName);
        System.out.println("Book Author: "+ author);
        System.out.println("Book Price: "+ price);
        System.out.println();
    }
}

public class book {
    public static void main(String[] args){
        library book1 = new library("It Ends With Us", "Colleen Hoover", 550);
        library book2 = new library("Fault in our stars", "Jhon Green", 650);

        book1.display();
        book2.display();


    } 
}
