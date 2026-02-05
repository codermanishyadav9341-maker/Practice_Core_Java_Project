package Java_Roof;

import java.util.Scanner;

public class Profit1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Cost Price:- ");
        int cost_Price = scan.nextInt();

        System.out.print("Enter your Selling Price:- ");
        int selling_Price = scan.nextInt();

        int profit;
        int loss;

        if(cost_Price <= selling_Price){
            profit = selling_Price - cost_Price;
            System.out.println("Profit:- " +profit);
        }
         else if(selling_Price <= cost_Price){
             loss = cost_Price - selling_Price;
             System.out.println("Loss:- " +loss);
        }
    }
}
