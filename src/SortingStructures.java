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

		long startTime = System.nanoTime();
		bubbleSort( arr );
//		Arrays.sort(arr);
		long stopTime = System.nanoTime();
		readArr( arr );
		System.out.print( "Method took " );
		System.out.println(stopTime - startTime);
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
	 * Bubble Sort
	 * @param  arr unsorted array
	 * @returns Sorted array
	 */
	public static int[] bubbleSort(int[] arr){
		int length = arr.length;
		for (int i = 0; i <length -1; i++){
			for(int j = 0; j < length-i-1; j++){
				if(arr[j] > arr[i]){
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

} //End
