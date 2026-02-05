package Java_Encapsulations;

 class ShoppingItem {
     private String itemName;
     private double price;
     private int quantity;
     private String category;

//      Using Constructors;

     ShoppingItem(String itemName,double price,int quantity,String category){
         this.itemName = itemName;
         this.price = price;
         this.quantity = quantity;
         this.category = category;
     }

     public String getItemName(){
         return itemName;
     }

     public double getPrice(){
         return price;
     }

     public int getQuantity(){
         return quantity;
     }

     public String getCategory(){
         return category;
     }

     public void setQuantity(int newQuantity){
         if(newQuantity > 0){
             this.quantity = newQuantity;
         }
          else{
              System.out.println("Insufficient Quantity");
         }
     }

     public void updateQuantity(double newPrice){
         if(newPrice > 0){
             price += newPrice;
         }
          else{
              System.out.println("Price Cannot be Negative");
         }
     }

     public double getTotalCost(){
         return price*quantity;
     }

     public void applyDiscount(double percentage){
         if(percentage >= 0 && percentage < 100){
             price = price - (price * percentage / 100);
         }
          else{
              System.out.println("Invalid Discount Percentage");
         }

     }

     public String getItemSummary(){
         return "Item Name:- " +itemName+
                 "\nPrice:- " +price+
                 "\nQuantity:- " +quantity+
                 "\nCategory:- " +category;

     }

     public static void main(String[] args){
         ShoppingItem so = new ShoppingItem("Milk",100,10,"White");
         so.setQuantity(20);
         so.updateQuantity(60);
         so.applyDiscount(10);

         System.out.println("------------------------:Product - Bill:---------------------------------");
         System.out.println("Item Name:- " +so.getItemName());
         System.out.println("Price:- " +so.getPrice());
         System.out.println("Quantity:- " +so.getQuantity() +" Litres");
         System.out.println("Total Price:- " +so.getTotalCost());
         System.out.println("Category:- " +so.getCategory());


     }
}
