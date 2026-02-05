package POLYMORPHISM_ROOF;

public class Transport {
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
        System.out.println("Travelling by train");
    }
}

class flight extends Transport{
    public void travelMode(){
        System.out.println("Travelling by flight");
    }

    public static void main(String[] args){

        Transport tt = new Transport();
        tt.travelMode();

        Transport bb = new Bus();
        bb.travelMode();

        Transport tr = new Train();
        tr.travelMode();

        Transport ff = new flight();
        ff.travelMode();

    }
}
