import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

/**
 * Binary Search
 * @author EF
 * @version 1
 * @throw file does not exists
 */

public class BinarySearch {
	public static void main(String[] args) throws FileNotFoundException {
		// Decolarations
		Scanner keyboard = new Scanner( System.in );
		//functions that take in the file and reads out the numbers
		ArrayList<Integer> myNumbers = new ArrayList<Integer>( 11 );
		myNumbers = readFile( keyboard, myNumbers );
		showList(myNumbers);
		String repeat = "y";
		while(repeat.equalsIgnoreCase( "y" )) {
			System.out.print("Enter a number to search in the list: ");
			int find = keyboard.nextInt();
			System.out.println("number is " + find + " ");

			//min
			//max
			//mid
			//if existst

			//user can play again
			System.out.print("play again? ");
			repeat = keyboard.next();
		}


	}


	/**
	 * reads from file
	 *
	 * @param keyboard  scanner to get user input
	 * @param myNumbers ArrayList to populate
	 * @return populated ArrayList
	 */
	private static ArrayList<Integer> readFile(Scanner keyboard,
	                                           ArrayList<Integer> myNumbers)
			throws FileNotFoundException {
		System.out.println("in the readFile function");
		return myNumbers;
	}


	/**
	 * Shows file numbers
	 * @param myNumbers ArrayList to Display
	 */
	public static void showList(ArrayList<Integer> myNumbers) {

		System.out.println("in the showList");
	}
}//end
