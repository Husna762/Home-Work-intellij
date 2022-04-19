package Method_Hw;

public class Method_ReturnTypeWithPara {

    public String getStudentinfo(String name, String address, String gander) {

        System.out.println(" Student name " + name + " Student Address " + address + " Student gander " + gander);


        return (name + address + gander);
    }

    public double getyearlySalary(double monthlySalary, double month) {

        System.out.println("My Yearly salary is " + monthlySalary * month);

        return (monthlySalary * month);
    }

    public int doSummation(int dresses, int yellowshoes, int hijab, int bangle, int bag) {


        return (dresses + yellowshoes + hijab + bangle + bag);
    }
    public int doDivision (int num1, int num2){

        return (num1/num2);
    }

    public int doSubtruction  (int x, int y){

        return ( x-y );
    }

    public static void main(String[] args) {
        Method_ReturnTypeWithPara obj = new Method_ReturnTypeWithPara();
        obj.getStudentinfo("Sinan", "Tx,USA", "Male");
        obj.getStudentinfo("Sameen", "Dhaka,Bangladesh", "Male");
        obj.getStudentinfo("Mishkat", "Chittagong,Bangladesh", "Female");
        obj.getStudentinfo("Sugra", "Ny,USA", "Female");
        obj.doSummation(250, 50, 20, 50, 159);

        obj.getyearlySalary(8500.00, 12);
        obj.doSummation(250,50,25,60,159);
        System.out.println( obj.doSummation(250,50,25,60,159));
        obj.doDivision(24,3);
        System.out.println(obj.doDivision(24,3));
        obj.doSubtruction(478, 125);
        System.out.println( obj.doSubtruction(478, 125));


    }


}
