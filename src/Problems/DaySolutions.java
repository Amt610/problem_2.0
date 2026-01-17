package Problems;

import java.util.Scanner;

public class DaySolutions {
    public static void main(String[] args) {
        //take input and print day
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter day in num 1 to between 7 : ");
        int day=sc.nextInt();
        System.out.println();

        System.out.println("Day is: "+getDayResult(day));
    }
    public static String getDayResult(int day){
        String dayname="";
        switch (day){
            case 1: dayname="Monday";break;
            case 2: dayname="Tuesday";break;
            case 3: dayname="wednesday";break;
            case 4: dayname="Thursday";break;
            case 5: dayname="Friday";break;
            case 6: dayname="Saturday";break;
            case 7: dayname="Sunday";break;
            default: dayname="Invalid day range";
        }
        return  dayname;
    }
}
