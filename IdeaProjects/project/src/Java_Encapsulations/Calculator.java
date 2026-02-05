package Java_Encapsulations;

 class Calculator {
     private double result;

//     Using Constructors;

     Calculator(){
         this.result = 0;
     }

     public void add(double num){
         result += num;
     }

     public void Subtract(double num){
         result -= num;
     }

     public void multiply(double num){
         result *= num;
     }

     public void divide(double num){
         if(num != 0){
             result /= num;
         }
          else{
              System.out.println("Divided Cannot by Zero");
         }
     }

    public double getResult(){
         return result;
    }

    public void clear(){
         result = 0;
    }

    public static void main(String[] args){
         Calculator cu = new Calculator();

         cu.add(10);
         cu.add(20);

         System.out.println("Add:- " +cu.getResult());

         cu.Subtract(20);
         System.out.println("Subtract:- " +cu.getResult());

         cu.multiply(2);
         System.out.println("Multiply:- " +cu.getResult());

         cu.divide(10);
         System.out.println("Divide:- " +cu.getResult());




    }
}
