package ArrayListExtention;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

/**
 * In this program it will have a scanner that will take in user imput to then display a menu for the user to utalize
 * Menu will include: 1 add, 2 display all, 3 search, 4 remove all
 *
 */

public class main {
	public static void main(String[] args) throws IOException {
		AddressBook book = new AddressBook("bob","sdfs",12345678);
		System.out.println(book.cellNumber);



	}
	// reads and displays file
	public static void readNaddAddressbook(){
		//create a scanner
		//read file
		// display file
		try {
			File myObj = new File("addressBook.txt");

			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		}
		catch ( IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}
