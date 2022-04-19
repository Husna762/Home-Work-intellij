package Method_Hw;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hw_Calculating {

    public int getTotalCost() {
        Scanner input = new Scanner(System.in);
        System.out.println("****let's do calculating by user input***");
        System.out.println("Star with summation");
        System.out.println("Enter first number");
        int num1 = input.nextInt();

        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();

        System.out.println("Enter 3rd number");
        int num3 = input.nextInt();

        System.out.println("Enter 4th number");
        int num4 = input.nextInt();
        int totalAdd = num1 + num2 + num3 + num4;
        System.out.println("Here is my total summation " + totalAdd);
        return (num1 + num2 + num3 + num4);
    }

    public static double doSubtruction() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Can you calculate your monthly saving? :) ");
        String ab = scan.nextLine();
        System.out.println("your monthly Salary");
        double x = scan.nextDouble();
        System.out.println("your house hold expense");
        double y = scan.nextDouble();
        double monthlySavings = x - y;
        System.out.println("My monthly savings only $ " + monthlySavings);
        return monthlySavings;
    }
    public void doMulti() {
        Scanner sm= new Scanner(System.in);
        System.out.println("let's do a multiplication :) ");
        String ab = sm.nextLine();
        System.out.println("you paid hourly? ");
        double salary = sm.nextDouble();
        System.out.println("How many hours you work in a day ");
        double hourSalary = sm.nextDouble();
        double perDaySalary = salary*hourSalary;
        System.out.println("I got paid for a day $" + perDaySalary);

    }
    public void doDivision(){
        Scanner sm= new Scanner(System.in);
        System.out.println("Are you ready fo to do division? :) ");
        String ab = sm.nextLine();
        System.out.println("Total costs of a basket of mangoes ");
        int mangoPrice  = sm.nextInt();
        System.out.println("Numbers of mango in a basket ");
        int mangoQuantity = sm.nextInt();
        int costPerMango = mangoPrice/mangoQuantity;
        System.out.println("Each mango price is $ " + costPerMango);

    }


    public static void main(String[] args) {

        Hw_Calculating obj = new Hw_Calculating();
        obj.getTotalCost();
        Hw_Calculating.doSubtruction();
        obj.doMulti();
        obj.doDivision();


    }
}
