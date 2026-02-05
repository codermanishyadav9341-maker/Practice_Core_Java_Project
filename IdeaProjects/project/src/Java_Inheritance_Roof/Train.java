package Java_Inheritance_Roof;

public class Train {

    public void run(){
        System.out.println("Train is running.......");
    }
}

class Metro extends Train{

    public void run(){
        System.out.println("Metro is running on electric track");
    }

    public static void main(String[] args){
        Metro mm = new Metro();
        mm.run();

    }
}
