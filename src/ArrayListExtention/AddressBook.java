package ArrayListExtention;

import java.util.ArrayList;

public class AddressBook<E> extends ArrayList<E> {
	String firstName;
	String lastName;
	long cellNumber;

	public AddressBook(String firstName, String lastName, long cellNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.cellNumber = cellNumber;
	}

}
