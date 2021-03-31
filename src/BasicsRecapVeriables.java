import java.io.IOException;
import static java.lang.Math.*;
import java.util.Scanner;

/**
 * Problem: Computing the Area of a Circle
 * This program computes the area of the circle.
 * As I work through the slides I will add multiple methods to this page
 * This page will only include the basics
 *
 * @version 11
 * @auther Elizabeth Friendland
 */
public class BasicsRecapVeriables {
	public static void main(String [] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type a radius to begin ");
		int placeholder = scan.nextInt();
		System.out.print("Area of a circle with a radius of " + placeholder + " is ");
		System.out.format("%.3f%n",circleArea(placeholder));
		scan.close();
	}

	/**
	 * Pi r^2
	 * @param radius
	 * @return Area of a circle
	 */
	public static double circleArea(int radius){
		double circumference =  Math.pow(radius,2);
		double circleArea = Math.PI * circumference;
		return circleArea;
	}

}
