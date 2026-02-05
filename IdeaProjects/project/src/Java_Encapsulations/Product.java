package Java_Encapsulations;

class Product {
    private int productID;
    private String name;
    private double price;
    private int quantity;


//     Using Constructors;
    Product(int productID,String name,double price,int quantity){
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

//     Using getter methods ;

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

    public void setPrice(double price){
        if(price >= 0){
            this.price = price;
        }
         else{
             System.out.println("Price Cannot be negative");
        }
    }

    public void addStock(int amount){
        quantity += amount;
    }

    public void sellProduct(int amount){
       if(amount >0 && amount <=  quantity){
           quantity -= amount;
       }
        else{
            System.out.println("Sufficient Stock");
       }
    }

    public double getTotalValue(){
        return price*quantity;
    }

    public boolean isInStock(){
        return quantity > 0;
    }

    public static void main(String[] args){
        Product pp = new Product(104,"Milk",100,50);
        pp.addStock(100);
        pp.sellProduct(150);
        pp.setPrice(200);

        System.out.println("----------------------:Product - Bill:-----------------------------");
        System.out.println("Product ID:- " +pp.getProductID());
        System.out.println("Product name:- " +pp.getName());
        System.out.println("Price:- " +pp.getPrice());
        System.out.println("Quantity:- " +pp.getQuantity());
        System.out.println("Total Value:- " +pp.getTotalValue());
        System.out.println("Stock:- " +pp.isInStock());

    }
}
