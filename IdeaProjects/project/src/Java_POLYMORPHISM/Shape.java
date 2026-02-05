package Java_POLYMORPHISM;

 class Shape {

     public void Draw(){
         System.out.println("Drawing Shape");
     }
}

class Circle extends Shape{
     public void Draw(){
         System.out.println("Drawing Circle");
     }

    public void Draw(int radius){
        System.out.println("Drawing Circle with radius is " +radius);
    }
}

class Rectangle extends Shape{
    public void Draw(){
        System.out.println("Drawing Circle");
    }

    public static void main(String[] args){

        Shape sa = new Shape();
        sa.Draw();

        Circle ci = new Circle();
        ci.Draw();
        ci.Draw(10);

        Rectangle re = new Rectangle();
        re.Draw();

    }
}
