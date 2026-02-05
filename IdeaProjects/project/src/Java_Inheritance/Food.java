package Java_Inheritance;

 class Food {
     String foodName;

     Food(String foodName){
         this.foodName = foodName;
     }

     public void display(){
         System.out.println("Food Name:- " +foodName);
     }
}
class Desert extends Food{
     String sweetnessLevel;

     Desert(String foodName,String sweetnessLevel){
         super(foodName);
         this.sweetnessLevel = sweetnessLevel;
     }

     public void display(){
         System.out.println("FoodName:- " +foodName);
         System.out.println("SweetnessLevel:- " +sweetnessLevel);
     }

     public static void main(String[] args){

         Desert so = new Desert("Mango","High");
         so.display();
     }
}
