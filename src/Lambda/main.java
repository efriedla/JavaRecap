package Lambda;

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
		//1
		whyKambda();

	}
	public static  void whyKambda(){
		System.out.println("Reasons to use Lambda\n");
		String[] whyLamday = {
				"Enables functional programing",
				"Readable and consise code",
				"Easier to use APIs and Libraries",
				"Enables support for parallel processing"
		};
		for (int i=0; i<whyLamday.length; i++)
		{
			System.out.println(i + 1 +". "+ whyLamday[i]);
		}

	}
}
