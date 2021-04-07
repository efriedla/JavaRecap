import java.io.IOException;
//import static java.util.*;
import java.util.Scanner;
public class BasicsStringsNArrays {
	public static void main(String [] args) throws IOException {
		// Finding a Character or a Substring in a String
		String test = "Bob Test";
		subStringByFirstSpace(test);



	}

	/**
	 * Finding a Character or a Substring in a String
	 * @param s
	 */
	public static void subStringByFirstSpace(String s){
		int space = s.indexOf(' ');
		String first = s.substring(0,space);
		String last = s.substring(space + 1);
		System.out.println(first + "\n" + last);

	}

	
}
