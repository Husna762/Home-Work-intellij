package Method_Hw;

public class MethodNon_ReturnTypeWithoutPara {


    public void tvDisplay() {

        System.out.println("This is the 1st Homework of 1st non return type method without parameter. ");

    }

    public void doSummation() {

        int x = 100;
        int y = 345;
        int z = 555;
        int total = x + y + z;
        System.out.println("Total value after sum = " + total);


    }

    public void getMulti() {
        double priceBox = 550.00;
        int quantity = 4;
        double totalPrice = priceBox * quantity;
        System.out.println("Total box price is $" + totalPrice);
    }

    public void getDivision() {

        int num10 = 51212;
        int num15 = 2;
        int totalDiv = num10 / num15;
        System.out.println("result of this division is =" + totalDiv);


    }

    public void collectName (){
        String fName = "Amatullah";
        String lName = "Husna";
        String fullname = fName + lName;
        System.out.println("My full name is :" +(fName + lName));


    }

    public static void main(String[] args) {

        MethodNon_ReturnTypeWithoutPara obj = new MethodNon_ReturnTypeWithoutPara();
        obj.tvDisplay();
        obj.doSummation();
        obj.getMulti();
        obj.getDivision();
        obj.collectName();

    }


}
