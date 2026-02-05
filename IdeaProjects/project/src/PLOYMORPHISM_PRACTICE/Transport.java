package PLOYMORPHISM_PRACTICE;

class Transport {
    public void travelMode(){
        System.out.println("Travelling");
    }
}

class Bus extends Transport{
    public void travelMode(){
        System.out.println("Travelling by bus");
    }
}

class Train extends Transport{
    public void travelMode(){
        System.out.println("Travelling by Train");
    }
}

class Flight extends Transport{
    public void travelMode(){
        System.out.println("Travelling by flight");
    }

    public static void main(String[] args){

        Flight f = new Flight();
        f.travelMode();

        Train to = new Train();
        to.travelMode();

        Bus b = new Bus();
        b.travelMode();
    }
}