package Ecapsulations_Roof;

 class Person {
     private String name;
     private int age;
     private  String email;

//      Using Constructors;

     Person(String Name,int Age,String Email){
         this.name = Name;
         this.age = Age;
         this.email = Email;

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

     public void setAge(int age){
         if(age >= 0  && age <= 120){
             this.age = age;
         }
          else{
              System.out.println("Invalid Age");
         }
     }

     public void setEmail(String Email){
         if(email.contains("@")){
             this.email = Email;
         }
          else{
              System.out.println("Invalid Email");
         }
     }
     public String  toString(){
         return "Name:- " +name+
                 "\nAge:- "+age+
                 "\nEmail:- " +email;
     }

     public static void main(String[] args) {

         Person p = new Person("Manish",21,"manishKumar@gmail.com");
         p.setAge(-10);
         p.setEmail("manishyadav122@gmail.com");


         System.out.println(p);
     }
}
