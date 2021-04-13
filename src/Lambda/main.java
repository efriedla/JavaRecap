package Lambda;
import java.util.ArrayList;
import java.util.function.Consumer;
/**
 * Review Lamba with https://www.youtube.com/playlist?list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3 playlist
 * in the excersize
 * 1. Understanding lambda
 * 2. using lambda
 * 3. functional interfaces
 * 4. method references
 * 5. collections improvements
 */

public class main {
	public static void main(String[] args) {
		//1 -2
		ArrayList<String> whyLamda = new ArrayList<String>();
		whyKambda(whyLamda);


	}

	/**
	 * Reasons why Lambda
	 */
	public static  void whyKambda(ArrayList<String>  whyLamda){
		System.out.println("Reasons to use Lambda\n");
		whyLamda.add("Enables functional programing");
		whyLamda.add("Readable and consise code");
		whyLamda.add("Easier to use APIs and Libraries");
		whyLamda.add("Enables support for parallel processing");
		whyLamda.forEach( (n) -> { System.out.println(n); } );

	}

}
