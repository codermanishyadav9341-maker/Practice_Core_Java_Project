package INHERITANCEQuestions;

class LivingBeing {
    void breathe(){
        System.out.print("Breathing");
    }
}

class DOG extends LivingBeing{
    void Animal(){
        System.out.print("Eating");
    }
}

class dog extends DOG{

    void barks(){
        System.out.print("Barking");
    }

    public static void main(String[] args) {

        dog so = new dog();

        so.Animal();
        so.breathe();
        so.barks();

    }
}
