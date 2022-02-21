//Circles.java

//importing Scanner
import java.util.Scanner;

public class Circles{
    //making the main function
    public static void main(String[] args){

        //create the scanner
        Scanner keyboard = new Scanner(System.in);

        //getting the user input
        System.out.print("Enter a radius: ");
        double radius = keyboard.nextInt() * 1.0;

        //doing the math
        double diameter = radius * 2;
        double circumference = radius * 2 * Math.PI;
        double area =  Math.PI * Math.pow(radius, 2.0);

        //printing the results
        System.out.println("The diameter is: " + diameter);
        System.out.println("The circumference: " + circumference);
        System.out.println("The area is: " + area);

    }
}
