package Learning;

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

		ArrayList<Integer> myNumbers = new ArrayList<Integer>(11);

		myNumbers = readFile(keyboard, myNumbers);

		showList(myNumbers);

		String repeat = "y";
		while(repeat.equalsIgnoreCase("y")){
			System.out.print("Enter a number to search in the list: ");
			int find = keyboard.nextInt();

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
//			int number;

			int	number = binarey(myNumbers, find, minI, maxI, midI);

			if(number == -1){
				System.out.println(find + " not found ");
			}else{
				System.out.println(find +" found at index " + number);
			}
			//user can play agains
			System.out.print("play again? ");
			repeat = keyboard.next();

		}

		keyboard.close();
	}//end of main

	/**
	 * reads from file
	 * @param keyboard scanner to get user input
	 * @param myNumbers ArrayList to populate
	 * @return populated ArrayList
	 */
	public static ArrayList<Integer> readFile(Scanner keyboard,
	                                          ArrayList<Integer> myNumbers)
			throws FileNotFoundException {
		System.out.print("file name? ");
		String path = keyboard.next();
		File file = new File(path);
		Scanner inputFile = new Scanner(file);
		while (inputFile.hasNext() ) {
			int next = inputFile.nextInt();
			myNumbers.add(next);

		}
		inputFile.close();
		return myNumbers;
	}
	public static void showList(ArrayList<Integer> myNumbers){
		//format
		String tableFormat = "%1$-10s %2$-8s %3$-10s %4$-1s \n";
		int count = 0;
		System.out.println("\nArray list elements before sort: ");
		for(int val: myNumbers){
			System.out.format(tableFormat, "index:", count, "value:", val);
			count++;
		}
		selectionSort(myNumbers);
		System.out.println("\nArray list elements after sort:");
		count = 0;
		for(int val: myNumbers){
			System.out.format(tableFormat, "index:", count, "value:", val);
			count++;
		}
		System.out.println();
	}

	/**
	 * Selection sort
	 * @param myList taks in int ArrayList
	 * @return sorted ArrayList
	 */
	public  static ArrayList<Integer> selectionSort(ArrayList<Integer> myList){
		int minIdx, counter;
		// selection sort
		for (int i = 0; i < myList.size()-1; i++){

			//Find the minimum element in unsorted array
			minIdx = i;
			counter = i + 1;
			for (int j = i + 1; j < myList.size(); j++) {
				// if next iteragtion is smaller than current place in array
				if (myList.get(j).compareTo(myList.get(i)) < 0) {
					// the min would track that location in interation
					minIdx = j;

					// Swap the found minimum element with the first
					// tempVal would capture value of now min val
					int tempVal = myList.get(minIdx);
					int tempValI = myList.get(i);
					// where now min val is swaps with current iteration val

					myList.set(j, tempValI);
					// the current iteration val is now the min
					myList.set(i,tempVal);
				}

			}
		}

		return myList;
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
	public static int binarey(ArrayList<Integer> myNumbers, int find, int minI, int maxI, int midI){

		//min
		int min = myNumbers.get(minI);
		//can not be less than the smallest number
		if(find < min){
			return -1;
		}
		//max
		int max = myNumbers.get(maxI);
		//can not be greater than the largest number
		if(find > max){
			return -1;
		}
		//mid
		int mid = myNumbers.get(midI);
		for (int i = 0; i < myNumbers.size()-1; i++){
			if(find == mid )

			{
				if(find == min){
					return minI;
				}
				if(find == myNumbers.get(midI-1)){

					midI --;
				}
				return midI;

			}
			//smaller
			else if (find < mid )
			{
				maxI = midI;
				midI --;
				mid = myNumbers.get(midI);
//				return binarey(myNumbers,find, minI, maxI, midI);

			}
			//greater
			else if (find > mid)
			{
				minI = midI;

				midI ++;
				mid = myNumbers.get(midI);

			}

		}
		return -1;
	}
}//end
