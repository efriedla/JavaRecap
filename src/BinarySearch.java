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
			int minI = 0;
			int min = myNumbers.get(minI);
			//max
			int maxI = myNumbers.size()-1;
			int max = myNumbers.get(maxI);
			//mid
			int midI = (maxI+minI) / 2;
			int mid = myNumbers.get(midI);
			// if exists in arrayList

			int number = 0;
//			int	number = binarey(myNumbers, find, minI, maxI, midI);

			if(number == -1){
				System.out.println(find + " not found ");
			}else{
				System.out.println(find +" found at index " + number);
			}

			//user can play again
			System.out.print("play again? ");
			repeat = keyboard.next();
		}


	}

	/**
	 * Binarey Search that only takes in numbers that are in the arraylist
	 * @param myNumbers ArrayList of numbers
	 * @param find users int to be found
	 * @param minI original min location
	 * @param maxI original max location
	 * @param midI orginal mid location
	 * @return location of the users int
	 */
	private static int binarey(ArrayList<Integer> myNumbers, int find, int minI, int maxI, int midI) {
		return -1;
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
