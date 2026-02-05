package POLYMORPHISM_ROOF;

public class Shape1 {
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
        Shape1 ss = new Shape1();
        ss.printShape();
        
        Shape1 So = new Square();
        So.printShape();

        Shape1 tt = new Triangle();
        tt.printShape();

    }
}
