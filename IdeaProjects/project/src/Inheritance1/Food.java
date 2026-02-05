package Inheritance1;

class Food{
    String foodName;

    Food(String foodName){
        this.foodName = foodName;
    }

    void display(){
        System.out.println("Food Name:- " +foodName);
    }
}

class Desert extends Food{
   String SweetnessLevel;

    Desert(String foodName, String SweetnessLevel){
        super(foodName);

        this.SweetnessLevel = SweetnessLevel;
    }

    void display(){
        System.out.println("Food Name:- " +foodName);
        System.out.println("SweetnessLevel:- " +SweetnessLevel);
    }

    public static void main(String[] args) {

        Desert so = new Desert("Gulab Jamun" , "High");
        so.display();
    }
}
