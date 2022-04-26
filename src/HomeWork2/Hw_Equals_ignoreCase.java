package HomeWork2;

import java.util.Scanner;

public class Hw_Equals_ignoreCase {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Who wants a break for Eid?");
        System.out.println("I think every students in this class");
        System.out.println("Enter your guess amount of students of this class  ");
        int quantity = scan.nextInt();

        System.out.println("Who wants to create  a vote for this? ");
        System.out.println("Enter his name Mahmud vai or students?");
        String name = scan.next();

        if (name.equalsIgnoreCase("student") || quantity <= 25) {
            System.out.println("If number of 20 students vote for Eid break, You will get a break for Eid ");

        } else if (name.equalsIgnoreCase("Mahmud vai ") || quantity <=40) {
            System.out.println("Mahmud vai has no option to say NO for Eid break.  ");

        } else {
            System.out.println("Sorry guys no break for this Eid. Do study, work hard. ");
        }


    }


}