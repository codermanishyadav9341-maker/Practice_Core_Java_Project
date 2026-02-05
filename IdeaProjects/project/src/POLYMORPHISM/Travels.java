package POLYMORPHISM;

class Travels {
    void travel_Mode(){
        System.out.println("-------Travelling-------");
    }
}

class Bus extends Travels{
    void travel_mode(){
        System.out.println("Traveling by bus");
    }
}

class Train extends Travels{
    void travels_mode(){
        System.out.println("Traveling by Train ");
    }
}

class Flight extends Travels{
    void travels_mode(){
        System.out.println("Traveling by flight");
    }

    public static void main(String[] args) {

        Travels t = new Travels();
        t.travel_Mode();

        Bus b = new Bus();
        b.travel_mode();

        Train t1 = new Train();
        t1.travels_mode();

        Flight f = new Flight();
        f.travels_mode();

    }
}



