import java.io.IOException;
//import static java.util.*;
import java.util.Scanner;
public class BasicsStringsNArrays {
	public static void main(String [] args) throws IOException {
		// Finding a Character or a Substring in a String
		String test = "Bob Test";
		System.out.println(test);
		int space =test.indexOf(' ');
		String firstN = test.substring(0,space);
		String lastN = test.substring(space + 1);
		System.out.println(firstN + " ---- " + lastN);

	}
}
