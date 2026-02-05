package Encapsulations_Practice;

public class
Person {
     private String name;
     private int age;
     private String email;


     Person(String name,int age,String email){
         this.name = name;
         this.age = age;
         this.email = email;
     }

     public void setName(){
         name = name;
     }

     public void setAge(int newAge){
         if(0 >= age && age <= 120){
             this.age = newAge;

         }
          else{
              System.out.println("Invalid age");
         }

     }

     public void setEmail(String email){
         if(email.contains("@")){
             this.email = email;
         }
          else{
              System.out.println("Invalid email");
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

    public static void main(String[] args) {

         Person p = new Person("Manish Yadav",23,"manishyadav934196@gmail.com");
         p.setName();
         p.setAge(-2000);
         p.setEmail("manishyadav@gmail.com");
         p.toString();


         System.out.println("-----------Person Details----------");
         System.out.println(p.toString());
    }
}
