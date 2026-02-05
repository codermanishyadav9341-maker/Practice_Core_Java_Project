package Encapsulations_Practice;

 class Product {
     private int productID;
     private String name;
     private double price;
     private int quantity;

//      Using Constructors;

     Product(int productID,String name,double price,int quantity){
         this.productID = productID;
         this.name = name;
         this.price = price;
         this.quantity = quantity;
     }

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


     public void setPrice(double newPrice){
         if(newPrice > 0){
             price += newPrice;
             System.out.println("Price:- " +price+ " | New Price:- " +newPrice);
         }
          else{
              System.out.println("Price is not negative");
         }
     }

     public void addStock(int amount){
         if(amount > 0){
             quantity += amount;

             System.out.println("Add items:- " +quantity+ " | Amount:- " +price);
         }
          else{
              System.out.println("No Stock");
         }
     }
     public void sellProduct(int amount){
       if(amount > 0  && amount <= quantity){
           quantity -= amount;
       }
        else{
            System.out.println("Not enough sell to Stock");
       }

     }

     public double getTotalValue(){
         return price*quantity;
     }

     public boolean getIsInStock(){
        return quantity > 0;
     }

     public static void main(String[] args){

         Product so = new Product(104,"Biscuits",50,500);
         so.setPrice(60);
         so.addStock(40);
         so.sellProduct(60);


         System.out.println("-------:Products Bill:----------");
         System.out.println("Product ID:- " +so.getProductID());
         System.out.println("Product Name:- " +so.getName());
         System.out.println("Price:- " +so.getPrice());
         System.out.println("Quantity:- " +so.getQuantity());
         System.out.println("Stock:- " +so.getIsInStock());




     }
}
