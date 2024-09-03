package assiugnment;

import java.util.Scanner;
//WAP to store and print total,avg price of 10 books.

public class StoreBooks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] prices = new double[10];//arrays to store price of the books
        double total = 0;

        //input prices of 10 books
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the price of books " + (i + 1) + ":");
            prices[i] = scanner.nextDouble();
            total += prices[i];
        }
        //calculate average price
        double average = total / 10;

        //print the total
        System.out.println("Total price of the books:" + total);
        System.out.println("Average price of books: " + average);
    }
}

