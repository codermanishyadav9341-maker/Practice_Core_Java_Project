package Java_POLYMORPHISM;

 class Shape1 {
     public void printShape(){
         System.out.println("This is a Shape");
     }
}

class Square extends Shape1{
     public void printShape(){
         System.out.println("This is a Square");
     }
}

class Triangle extends Shape1{
     public void printShape(){
         System.out.println("This is a triangle");
     }

     public static void main(String[] args){

         Shape1 so = new Shape1();
         so.printShape();

         Square sq = new Square();
         sq.printShape();

         Triangle tt = new Triangle();
         tt.printShape();
         
     }
}
