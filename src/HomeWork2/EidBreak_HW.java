package HomeWork2;

import java.util.Scanner;

public class EidBreak_HW {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Who wants the holiday break for Eid?");
        System.out.println("Is that all Students?");
        String name1 = scan.nextLine();

        if (name1.equalsIgnoreCase("yes")) {
            System.out.println("Okay, you guys can do vote for Eid holiday ");

        } else if (name1.equalsIgnoreCase("No")) {
            System.out.println(" Sorry You gys can't vote ");
        }
        System.out.println("Enter the total number of vote from the students in this class  ");
        int vote = scan.nextInt();
        if (vote >= 24 && vote <= 40) {
            System.out.println("We will get the vacation ");
        } else {
            System.out.println("We will not get the vacation ");
        }


    }


    }