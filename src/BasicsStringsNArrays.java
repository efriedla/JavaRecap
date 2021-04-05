import java.io.IOException;
//import static java.util.*;
import java.util.Scanner;
public class BasicsStringsNArrays {
	public static void main(String [] args) throws IOException {
		// Finding a Character or a Substring in a String
		String test = "Bob Test";
		//subStringByFirstSpace(test);
		continueTest();


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

	/**
	 * loops to 20 but does not sum 10 or 11 into total sum
	 */
    public static void continueTest(){
		int sum = 0, number = 0;
		while(number < 20){
			number++;
			if (number == 10 || number == 11)
				continue;
			sum += number;
		}
		System.out.println("sum is " + sum);

    }

}
