package Encapsulations_Practice;

class Rectangle {
    private double length;
    private double width;

    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public void setLength(){
        if(length > 0){
            this.length = length;
        }
         else{
             System.out.println("Length is not negative");
        }
    }

    public double getLength(){
        return length;
    }

    public void setWidth(){
        if(width > 0){
            this.width = width;
        }
         else{
             System.out.println("Width is not Negative");
        }
    }


    public double getArea(){
        double area = (length * width);
        return area;
    }

    public double getPerimeters(){
        double perimeters = 2*(length+width);
        return perimeters;
    }

    public boolean getIsSquare(){
       return length == width;
    }


    public static void main(String[] args){

        Rectangle so = new Rectangle(10,20);

        so.getArea();
        so.getPerimeters();
        so.getIsSquare();

        System.out.println("Area of Rectangle:- " +so.getArea());
        System.out.println("Perimeters Of Rectangle:- " +so.getPerimeters());
        System.out.println("Sides area are equally:- " +so.getIsSquare());
    }

}
