/**
 * Sorting
 * create an int array(50) with random numbers
 * print array
 * have several sorts to choose from
 * Linear
 * bubble
 * insertionSort
 * selection sort
 * merge sort
 * quick sort
 * @author EF
 * @version 1
 * @throw file does not exists
 */
import java.util.Random;

public class SortingStructures {
	public static void main(String[] args){

		Random random = new Random();

		byte[] arr = makeArray( random);
		readArr( arr );


	}
	/**
	 * Creates an array filled with random numbers
	 * @return byte[]
	 */
	public static byte[] makeArray( Random random){
		byte[] arr = new byte[5];
		random.nextBytes( arr );
		return arr;
	}
	/**
	 * reads arr
	 */
	public static void readArr( byte[] arr ){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}

	}

	/**
	 * Create/populate array
	 * @returns an array with random numbers
	 */

}
