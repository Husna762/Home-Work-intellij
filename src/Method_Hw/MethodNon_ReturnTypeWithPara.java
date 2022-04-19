package Method_Hw;

public class MethodNon_ReturnTypeWithPara {

    public void doSum (int x, int y){

        int total = x+y;

        System.out.println(total);

    }
    public void doSum (int x, int y,int z){

        int total = x+y+z;

        System.out.println("total value"     +total);

    }
    public void doMulti(double x, double y,double z){

        double totalmulti = x+y+z;

        System.out.println("total value"     +totalmulti);

    }
    public void doSubtruction1 (int num1, int num2) {

        int total = num1-num2;

        System.out.println("total organic orange "     +total );

    }



    public static void main(String[] args) {
        MethodNon_ReturnTypeWithPara xyz = new MethodNon_ReturnTypeWithPara();
        xyz.doSum(710,525);
        xyz.doSum(552,225,12);
        xyz.doMulti(222,345,945);

        xyz.doSubtruction1(2345, 34);



    }



}
