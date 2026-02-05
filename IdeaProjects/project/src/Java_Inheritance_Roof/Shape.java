package Java_Inheritance_Roof;

public class Shape {

    public void area(){
        System.out.println("Calculating area...........");
    }
}

class Rectangle extends Shape{
    int length;
    int breath;

    Rectangle(int length ,int breath){
        this.length = length;
        this.breath = breath;
    }

    public void area(){

        int area_of_Rectangle = (length * breath);
        System.out.println("Area of Rectangle:- " +area_of_Rectangle);
    }

    public static void main(String[] args){

        Rectangle ss = new Rectangle(10,5);
        ss.area();

    }
}