package Roof_Encapsulation;

 class Person {
    private String name;
    private int age;
    private String email;

    Person(String name,int age,String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void setName(){
        this.name = name;
    }

    public void setAge(){
        if(age >= 0 && age <= 120) {
            this.age = age;
        }
         else{
             System.out.println("Age Must Be 0 && 120 ! not allow");
        }

    }

    public void setEmail(){
        if(email != null && email.contains("@")){
            this.email = email;
        }
         else{
             System.out.println("Invalid email ! Must Contains email @");
        }

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }

    public String toString(){
        return "Name:- " +name+
                "\nAge:- " +age+
                "\nEmail:- " +email;
    }

    public static void main(String[] args){

        Person pp = new Person("Manish Yadav",23,"manishyadav982105@gmail.com");
        pp.toString();

        System.out.println("-------------:Person Details:-------------");
        System.out.println(pp.toString());


    }
}
