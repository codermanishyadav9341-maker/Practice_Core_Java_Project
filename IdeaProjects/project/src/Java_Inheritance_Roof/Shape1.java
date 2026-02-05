package Java_Inheritance_Roof;

public class Shape1 {

    public void Perimeters(){
        System.out.println("Calculating perimeters...........");
    }
}

class Square extends Shape1{
    double sides;

    Square(double sides){
        this.sides = sides;
    }

    public void Perimeters(){

        double perimeters_Of_Square = 4*sides;

        System.out.println("Perimeters Of Square:- " +perimeters_Of_Square);

    }

    public static void main(String[] args){

        Square ss = new Square(10);
        ss.Perimeters();

    }
}
