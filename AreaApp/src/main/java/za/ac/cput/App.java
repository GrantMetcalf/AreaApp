package za.ac.cput;

import java.util.Scanner;

/**
 * Area of circle
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //constant declaration
        final double PI = 3.142159;

        //declaring variables
        double radius, area;  // declaring two variables

        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius please: ");
        radius = sc.nextDouble();


        //processing
        area = PI * radius * radius;

        //output
        System.out.printf("The area is %f\n", area);
    }
}
