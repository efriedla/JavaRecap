package AddressBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * User Stories:
 * As a user, i want to print all available contacts, so that i can view all contacts in a CSV
 * like view ordered ascending by name then surname
 *
 *  As a user, i want to add new contact, so that i can increase my contacts list
 *
 * As a user, i want to search contacts based on name, so that i can find the
 * appropriate contacts in a short time.
 *
 * As a user, I want to search contacts based on mobile numbers, so that I can find the
 * appropriate contacts in a short time.
 *
 * As a user, I want to edit contact based on name, so that I can modify contact information and have
 * updated information.
 *
 * As a user, I want to edit contacts based on mobile numbers,so that I can modify contact information
 * and have updated information.
 *
 * As a user, i want to delete contact based on name, so i keep my contact list clean.
 *
 * As a user, I want to delete contacts based on phone numbers, so i keep my contact list clean.
 *
 * [ ] read csv file
 * [ ] Create contact class
 * [ ] create an array list that reads contacts
 * [ ] be able to read the address book
 * [ ] add to addressbook
 * [ ] update contact
 * [ ] handle problems
 *
 */

public class MainAddress {
	public static void main(String[] args) {


	}
	public static void readAddressBook(){
		try {
			File file = new File("addressBook.txt");
			System.out.println(file.exists());
			Scanner sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Something went wrong " + e);
		}
	}
}
