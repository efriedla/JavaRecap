package DataStructures;

import java.util.ArrayList;

public class ArrayListTest extends ArrayList {
	//ArrayList<String> addressbook;
	String firstName;
	String lastName;
	int location;
	public ArrayListTest(){
		System.out.println("test");
	}

	public  void add(String name){
		super.add(name);
		System.out.println(name);
		//System.out.println(super);
		//System.out.println(addressBook.indexOf(name));
	}

	public  int findByFullName(String name){
		System.out.println(super.indexOf(name));
		this.location = super.indexOf(name);


		return super.indexOf(name);
	}

	public void getfirstName(String name){
		//if exists
		// find location
		//set first name
		int space = name.indexOf(" ");
		this.firstName = name.substring(0,space);
		this.lastName = name.substring(space +1);
		System.out.println(firstName);
	}

	//location
	// display is that correct
	// set new name
	// set new name without changing rest of code




}
