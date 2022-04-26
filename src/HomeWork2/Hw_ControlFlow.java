package HomeWork2;


import java.util.Scanner;

public class Hw_ControlFlow {
    public void getResult() {
        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter your score to get the result");
//        double score = scan.nextDouble();
//        if (score >= 94){
//            System.out.println("Excellent");
//        } else if (score >= 90) {
//            System.out.println("Very Good");
//        } else if (score >= 85) {
//            System.out.println("Good");
//        } else if (score >= 80) {
//            System.out.println("Avarage");
//        } else if (score >= 70) {
//            System.out.println("pass");
//        } else if (score >= 60) {
//            System.out.println("Poor");
//        } else if  (score >= 50) {
//            System.out.println("Need to repeat this course");
//
//        }

        System.out.println("Enter your score to get the Grade");
        double score = scan.nextDouble();
        if (score >= 94 && score <= 100) {
            System.out.println("Excellent");
        } else if (score >= 90 && score <= 93) {
            System.out.println("VeryGood");
        } else if (score >= 85 && score <= 89) {
            System.out.println("Good");
        } else if (score >= 80 && score <= 84) {
            System.out.println("Average");
        } else if (score >= 70 && score <= 79) {
            System.out.println("pass");
        } else if (score >= 60 || score <= 69) {
            System.out.println("Poor");
        } else if (score >= 50 || score <=59) {
            System.out.println("Need to Repeat this Course");
        } else {
            System.out.println(" yor Score is not applicable ");



        }






    }


    public static void main(String[] args) {
        Hw_ControlFlow obj = new Hw_ControlFlow();
        obj.getResult();

    }






    }