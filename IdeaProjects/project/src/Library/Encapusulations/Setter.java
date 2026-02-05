package Library.Encapusulations;

 class Setter {
     private String password;

     public void setPassword(String password){
         if(password.length() >= 0){
             this.password = password;
             System.out.println(password);
         }
          else{
              System.out.println("Negative Password Cannot be define");
         }
     }

     public static void main(String[] args){
         Setter so = new Setter();
         so.setPassword("man2333");
     }
}
