package Method_Hw;

public class Method_ReturnType {

    public int doSummation() {
        int x = 20;
        int y = 50;
        int z = 15;
        int total = x + y + z;
        System.out.println("All of the product total price is " + total);
        return total;

    }

    public String takeName() {

        String fname = "Amatullah";
        String lname = "Husna";
        String fullName = fname + lname;

        System.out.println("My full name is " + fname + " " + lname);


        return fullName;

    }

    public double doSubtruction() {

        double monthlySalary = 8500.769;
        double rent = 1200.000;
        double totalSavings = monthlySalary - rent;
        System.out.println("My total savings is " + totalSavings);

        return totalSavings;
    }

    public int doDivision() {
        int num1 = 12;
        int num2 = 3;
        int totalDiv = num1 / num2;


        System.out.println(totalDiv);

        return totalDiv;


    }

    public int doMultiplication() {
        int mangoQuantity = 5;
        int eachMangoPrice = 2;
        int totalMangoPrice = mangoQuantity * eachMangoPrice;

        System.out.println("Total mango price " + totalMangoPrice);

        return totalMangoPrice;

    }


    public static void main(String[] args) {
        Method_ReturnType xyz = new Method_ReturnType();

        xyz.doSummation();
        xyz.takeName();
        xyz.doSubtruction();
        xyz.doDivision();
        xyz.doMultiplication();


    }


}
