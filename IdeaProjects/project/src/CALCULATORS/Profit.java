package CALCULATORS;

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Cost Price:- ");
        float cost_Price = scan.nextInt();

        System.out.print("Enter your Selling Price:- ");
        float selling_Price = scan.nextInt();

        float profit;
        float loss;

        if (selling_Price > cost_Price) {
            profit = (selling_Price - cost_Price);

            System.out.print("Profit:- " + profit);
        } else {
            loss = (cost_Price - selling_Price);

            System.out.print("Loss:- " + loss);
        }
    }
}
