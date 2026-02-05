package Java_Encapsulations;

 class Person {
     private String name;
     private int age;
     private String email;

//      Constructor;

     Person(String name,int age,String email){
         this.name = name;
         this.age = age;
         this.email = email;
     }

//      Using Setter and getter methods Using;

     public void setName(){
         name = name;
     }

     public void setAge(int newAge){
         if(age >= 0 && age <= 100) {
             this.age = newAge;
         }
          else{
              System.out.println("Invalid age");
         }
     }

     public void setEmail(){
         email = email;
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
}
