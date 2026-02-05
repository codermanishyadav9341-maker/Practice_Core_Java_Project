package POLYMORPHISM;

class SHAPE {
    void print_Shape(){
        System.out.println("This is a Shape");
    }

}

class Square extends SHAPE{
    void print_Shape(){
        System.out.println("This is a Square");
    }
}
 class triangle extends SHAPE{
    void print_Shape(){
        System.out.println("This is a triangle");
    }

     public static void main(String[] args) {
         triangle t = new triangle();
         t.print_Shape();

         Square s = new Square();
         s.print_Shape();

         SHAPE so = new SHAPE();
         so.print_Shape();
     }

 }
