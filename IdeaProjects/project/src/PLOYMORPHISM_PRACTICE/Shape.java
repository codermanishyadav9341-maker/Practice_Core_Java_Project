package PLOYMORPHISM_PRACTICE;

class Shape {
    public void draw(){
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape{
    public void draw(){
        System.out.println("Drawing Circle");

    }

    public void draw(int radius){
        System.out.println("Drawing Circle of radius is :- " +radius);
    }
}

class Rectangle extends Circle{
    public void draw(){
        System.out.println("Drawing Rectangle");
    }

    public static void main(String[] args){

        Shape s = new Shape();
        s.draw();

        Circle c = new Circle();
        c.draw();
        c.draw(10);

        Rectangle r = new Rectangle();
        r.draw();

    }
}
