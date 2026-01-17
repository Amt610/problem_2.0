package Problems;

import java.util.Scanner;

public class QuardinateEquations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num a: ");
        int a= sc.nextInt();
        System.out.println();

        System.out.print("Enter num b: ");
        int b=sc.nextInt();
        System.out.println();

        System.out.print("Enter num c: ");
        int c=sc.nextInt();
        System.out.println();

        double result=b*b-4*a*c;
        System.out.println(result);

        if (result>0){
            double r1=(-b+Math.pow(result,0.5))/(2*a);
            double r2=(-b-Math.pow(result,0.5))/(2*a);
            System.out.println("r1: "+r1+" r2: "+r2);
        } else if (result==0) {
            double r1=-b/(2.0*a);
            System.out.println(r1);
        }else {
            System.out.println("Root Result not found: ");
        }
    }
}
