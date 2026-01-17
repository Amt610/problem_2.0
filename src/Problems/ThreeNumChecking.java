package Problems;

import java.util.Scanner;

public class ThreeNumChecking {
    public static void main(String[] args) {
        //Find Greatest Among Three Numbers
        //Write a Java program that takes three
        // numbers from the user and prints the greatest number.

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter num a: ");
        int a=sc.nextInt();
        System.out.println();

        System.out.print("Enter num b: ");
        int b=sc.nextInt();
        System.out.println();

        System.out.print("Enter num c: ");
        int c=sc.nextInt();
        System.out.println();

        if (a>b & a>c){
            System.out.println("a is greater than to a and b value is: "+a);
        } else if (b>a & b>c) {
            System.out.println("b is greater than to a and c value is: "+b);
        }else {
            System.out.println("c is greater than to a and b value is: "+c);
        }
    }
}
