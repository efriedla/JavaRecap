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
import java.util.Arrays;
public class SortingStructures {
	public static void main(String[] args){

		Random random = new Random();

		int[] arr = makeArray( random);
		readArr( arr );
		Arrays.sort(arr);
		readArr( arr );
	}
	/**
	 * Creates an array filled with random numbers
	 * @return byte[]
	 */
	public static int[] makeArray( Random random){
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(200);
		return arr;
	}
	/**
	 * reads arr
	 */
	public static void readArr( int[] arr ){
		for(int i = 0; i < arr.length; i++){
			System.out.print(" " + arr[i] );
		}
		System.out.println();
	}

	/**
	 * Create/populate array
	 * @returns an array with random numbers
	 */

}
