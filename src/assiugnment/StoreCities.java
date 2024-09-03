package assiugnment;

import java.util.Scanner;

public class StoreCities {
    public static void main(String[] args) {
        //WAP to store and  print name of 6 cities.
        Scanner scanner = new Scanner(System.in);
        String[] cities = new String[6];

        //input name of cities
        for(int i = 0; i<6; i++){
            System.out.println("Enter the name of cities");
            cities[i] = scanner.nextLine();

            //print name of the cities
            System.out.println("The name of cities :"+(i+1)+":"+cities);

                System.out.println("City " + (i + 1) + ": " + cities[i]);



        }


    }
}
