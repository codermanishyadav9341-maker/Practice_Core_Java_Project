package HASHCODE;

class Without_Overriding {

    String name;
    int id;

    Without_Overriding(String name,int id){
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args){

        Without_Overriding so = new Without_Overriding("Manish",104);
        Without_Overriding so1 = new Without_Overriding("Manish",104);

        System.out.println(so);
        System.out.println(so1);

    }
}
