package Roof_Encapsulation;

public class Rectangle {
    private double length;
    private double breath;

    Rectangle(double length,double breath){
        this.length = length;
        this.breath = breath;
    }

    public  void setLength(double newLength){
        if(length != 0){
            this.length = newLength;
        }
         else{
             System.out.println("Length Cannot Negative");
        }
    }

    public void setBreath(double newBreath){
        if(newBreath != 0){
            this.breath = newBreath;
        }
         else{
             System.out.println("Breath Cannot Negative");
        }
    }

    public double getLength(){
        return length;
    }

    public double getBreath(){
        return breath;
    }

    public double getArea(){
        return length*breath;
    }

    public double getPerimeters(){
        return 2*length+breath;
    }

    public boolean getIsSquare(){
        return length == breath;
    }

    public static void main(String[] args){
        Rectangle rr = new Rectangle(10,5);

        System.out.println("---------------:Calculating Rectangle:--------------");
        System.out.println("Area of Rectangle:- " +rr.getArea());
        System.out.println("Perimeters of Rectangle:- " +rr.getPerimeters());
        System.out.println("Rectangle of Sides:- " +rr.getIsSquare());


    }
}
