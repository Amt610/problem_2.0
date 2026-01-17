package Problems;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        //Check number is positive or negative
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num: ");
        int num=sc.nextInt();

        System.out.println();

        if (num>0){
            System.out.println("Number is Positive and value is: "+num);
        } else if (num==0) {
            System.out.println("Number is zero");
        }else {
            System.out.println("Num is Negative and value is: "+num);
        }
    }
}
