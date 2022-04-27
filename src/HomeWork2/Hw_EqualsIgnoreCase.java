package HomeWork2;

import java.util.Scanner;

public class Hw_EqualsIgnoreCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Annual Gaming competition ");
        System.out.println("Did you win on the level 1 competition?");
        String win1 = scan.nextLine();

        if ( win1.equalsIgnoreCase("yes")){
            System.out.println("you will go to the level 2");

        } else {

            System.out.println("Sorry you cannot go to the level 2");
        }




    }






}
