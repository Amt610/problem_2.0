package Problems;

import java.util.Scanner;

public class PosNegZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num: ");
        double num=sc.nextInt();

        if(num>1 & num<1000000){
            System.out.println("You Enter Entered Small number: "+num);
            if (num%2==0){
                System.out.println("You Entered Sum digit: "+num);
            }else {
                System.out.println("You Entered Odd digit: "+num);
            }
        }else if (num==0){
            System.out.println("You Enter Zero number: "+num);
        } else if (num>1000000 ) {
            System.out.println("You Entered Large number: "+num);
            if (num%2==0){
                System.out.println("You Entered Sum digit: "+num);
            }else {
                System.out.println("You Entered Odd digit: "+num);
            }
        }
    }
}
