package Problems;

import java.util.Scanner;

public class EqualOfDecimal {
    public static void main(String[] args) {
        //Scanner class
        Scanner sc=new Scanner(System.in);

        //x variable
        System.out.print("Enter num x: ");
        double x= sc.nextDouble();
        double xResult=Math.round(x*1000);
        double xFinalResult=xResult/1000;

        //y variable
        System.out.print("Enter num y: ");
        double y=sc.nextDouble();
        double yResult=Math.round(y*1000);
        double yFinalResult=yResult/1000;

        if(xFinalResult==yFinalResult){
            System.out.println("x value and value matched: "+xFinalResult+" "+yFinalResult);
        }else {
            System.out.println("Result Not matched");
        }
    }
}
