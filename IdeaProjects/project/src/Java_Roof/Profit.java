package Java_Roof;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Cost_Price:- ");
        int cost = scan.nextInt();

        System.out.print("Enter your Selling Price:- ");
        int selling = scan.nextInt();

        int profit;
        int loss;

        if(cost <= selling){
            profit = selling - cost;
            System.out.println("Profit:- " +profit);
        }
         else if(selling >= cost){
             loss = cost - selling;
             System.out.println("Loss:- " +loss);
        }
          else{
              System.out.println("Equally");
        }
    }
}
