package ENCAPSULATIONS;

class Rectangle {

    private double length;
    private double breath;

    public Rectangle(double length , double breath){
        setLength(length);
        setBreath(breath);
    }

    public void setLength(double length){
        if(length > 0){
          this.length = length;
        }
         else{
             System.out.println("Invalid length");
        }
    }
     public void setBreath(double breath){
        if(breath > 0){
            this.breath = breath;
        }
         else{
             System.out.println("Invalid breath");
        }
     }
      public double getLength(){
        return length;
      }
      public double getBreath(){
        return breath;
      }

      public double getArea(){
        double area_of_rectangle = (length*breath);

        return area_of_rectangle;

      }

      public double getPerimeters(){
        double perimeters_of_rectangle = 2*(length*breath);
        return perimeters_of_rectangle;
      }

     public boolean isSquare(){
        return length == breath;
     }

     public static void main(String[] args){

        Rectangle r = new Rectangle(10,20);

        r.getArea();
        r.getPerimeters();
        r.isSquare();

        System.out.println("Area of rectangle:- " +r.getArea());
        System.out.println("Perimeters of rectangle:- " +r.getPerimeters());
        System.out.println(r.isSquare());
     }

    }

