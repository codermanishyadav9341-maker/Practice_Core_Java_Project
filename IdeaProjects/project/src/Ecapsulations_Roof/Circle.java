package Ecapsulations_Roof;

class Circle {
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double pie = 3.14;

    public void setRadius(double newRadius){
        if (newRadius >= 0) {
            radius = newRadius;

        }
        else {
            System.out.println("Radius is not negative");
        }

    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        double area = pie*radius*radius;
        return area;
    }

    public double getCircumference(){
        double circumference = 2*pie*radius;
        return circumference;
    }

    public double getDiameters(double diameter){
        double diameters = 2*radius;
        return diameters;
    }

    public static void main(String[] args){

        Circle c = new Circle(10);
        c.setRadius(-2);
        c.getArea();
        c.getCircumference();
        c.getDiameters(20);


        System.out.println("---------Circle--------");
//        System.out.println("Area of Circle:- " +c.getRadius());
        System.out.println("Area of Circle:- " +c.getArea());
        System.out.println("Circumference of Circle:- " +c.getCircumference());
        System.out.println("Diameters of Circle:- " +c.getDiameters(20));
    }
}
