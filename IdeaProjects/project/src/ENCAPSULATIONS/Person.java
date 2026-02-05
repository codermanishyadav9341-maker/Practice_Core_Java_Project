package ENCAPSULATIONS;

 class Person {
     private String name;
      private int age;
       private String email;

     public void setName(String newName){

         name = newName;
     }

     public void setAge(int  newAge){
         age = newAge;
     }

     public void setEmail(String newEmail){
         email = newEmail;
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

     public static void main(String[] args){

         Person p = new Person();
        System.out.println("-----Person Details--------");

        p.setName("Manish yadav");
        p.setAge(21);
        p.setEmail("manishyadav982105@gmail.com");

       System.out.println("Person Name:- " +p.getName());
       System.out.println("Age:- " +p.getAge());
       System.out.println("Email:- " +p.getEmail());


     }


 }
