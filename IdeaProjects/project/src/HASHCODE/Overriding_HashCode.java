package HASHCODE;

import java.util.Objects;

class Overriding_HashCode {

    String name;
    int id;

    Overriding_HashCode(String name,int id){
        this.name = name;
        this.id = id;
    }

    public int hashCode(){
        return Objects.hash(name,id);
    }

    public static void main(String[] args){

        Overriding_HashCode so = new Overriding_HashCode("Manish" ,104);
        Overriding_HashCode s1 = new Overriding_HashCode("Manish",104);

        System.out.println(so);
        System.out.println(s1);

    }

}
