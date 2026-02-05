package Roof_Encapsulation;

public class Product {
    private int productID;
    private String name;
    private double price;
    private int quantity;


    Product(int productID,String name,double price,int quantity){
             this.productID = productID;
             this.name = name;
             this.price = price;
             this.quantity = quantity;
            }

//            Getter Methods;

    public int getProductID(){
        return productID;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

//     Setter

    public void setPrice(double price){
        if(price >= 0){
            this.price = price;
        }
         else{
             System.out.println("Price Cannot be Negative");
        }
    }

    public void addStock(int amount){
        if(amount > 0){
            quantity += amount;
        }
         else{
             System.out.println("Insufficient Stock");
        }
    }

    public void sellProduct(int amount){
        if(amount > 0) {
            quantity -= amount;
        }
         else{
             System.out.println("Amount will be Positive");
        }
    }

    public double getTotalValue(){
        return price *quantity;
    }

       public boolean getIsInStock(){
        return quantity > 0;
       }

       public static void main(String[] args){

        Product pp = new Product(104,"Kurkure",5.0,10);

        System.out.println("----------------=:Product Details:=------------------");
        System.out.println("Product ID:- " +pp.getProductID());
        System.out.println("Product Name:- " +pp.getName());
        System.out.println("Price:- " +pp.getPrice());
        System.out.println("Quantity:- " +pp.getQuantity());
        System.out.println("Total Value:- " +pp.getTotalValue());
        System.out.println("Stock:- " +pp.getIsInStock()) ;

       }

}
