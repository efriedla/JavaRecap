package Learning;

import java.util.Scanner;
import java.io.*;
/**
 * This program will read a list of integers, each integer should be placed in one of three arrays
 * evenNum = positive even, oddNum = odd positive numbers,  and negNum = all negative numbers
 * 0 is not positive or negative and will not be placed anywhere
 *
 * @version 11
 * @auther Elizabeth Friendland
 */


public class ArrayDistribution {
	public static void main(String [] args) throws IOException {
		String evenArr= "evenNum", oddArr= "oddNum",negArr= "negNum";
		int [] evenNum = new int [30],oddNum = new int [30], negNum = new int [30];
		int evenCounter = 0, oddCounter = 0, negCounter = 0;
		// asks for file name
		System.out.print("Enter the filename: ");
		// gets name of file
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		// makes file name into a File
		File file = new File(path);
		// Scanner that scans through file
		Scanner inputFile = new Scanner(file);

		final int maxSizeOfArray = 30;
		int [] arr = new int[maxSizeOfArray];
		int txtFileCount = 0;
		// reads through text file and will orgainizes values into proper array
		while (inputFile.hasNext() && txtFileCount  <= maxSizeOfArray)
		{
			arr[txtFileCount] = inputFile.nextInt();
			//if + or -
			//if positive
			if(arr[txtFileCount] > 0){
				// if even
				if(arr[txtFileCount] % 2 == 0){
					//will populate evenNum with even positive values
					evenNum[evenCounter] = arr[txtFileCount];
					evenCounter++;
				}else{
					// if odd
					//will populate oddNum with odd positive values
					oddNum[oddCounter] = arr[txtFileCount];
					oddCounter++;
				}

				// 0 cannot be negative
			}else if(arr[txtFileCount] < 0){
				//is negative
				//will populate negNum with negative values
				negNum[negCounter] = arr[txtFileCount];
				negCounter++;
			}
			txtFileCount++;
		}

		inputFile.close();
		sc.close();
		// this funtion will out put each array
		printArrays(evenArr, evenCounter, evenNum);
		printArrays(oddArr, oddCounter, oddNum);
		printArrays(negArr, negCounter, negNum);

	}

	/**
	 * prints out each array
	 * @param arrayName name of each array
	 * @param counter the number that was populated in each array
	 * @param arrNum the array that is being printed out
	 */
	public static void printArrays(String arrayName, int counter, int [] arrNum){
		//prints arrays
		for(int i = 0; i < counter; i++){
			System.out.println( arrayName +" [" + i + "] : " + arrNum[i]);
		}
		System.out.println();
	}
}

