package DataStructures;

import java.util.Iterator;

public class CallingMadeDataStructures {
	public static void main(String[] args) {
//		CleanString s = new CleanString("to Clean this");
//		s.whatToClean();
//		s.setToClean("new String");
//		s.whatToClean();
//		s.toCaps();
		String text = "Bob J";
		int space = text.indexOf(" ");
		String first = text.substring(0,space);
		String last = text.substring(space +1);
		System.out.println(first);
		System.out.println(last);

		ArrayListTest addressBook = new ArrayListTest();
		addressBook.add("bob k");
		addressBook.add("bob L");
		addressBook.add("bob z");
//		System.out.println(addressBook.size());
//		//Traversing list through Iterator
//		Iterator itr=addressBook.iterator();//getting the Iterator
//		while(itr.hasNext()){//check if iterator has the elements
//			System.out.println(itr.next());//printing the element and move to next
//		}
//		System.out.println(addressBook.indexOf("bob L"));
//		addressBook.getfirstName("Bob l");
//		addressBook.set(addressBook.indexOf("bob L"), "Jim M");
//		System.out.println(addressBook);
		addressBook.findByFullName("bob k");




		//to update
		// see if exists
		// see get indexOf
		// display that
		// set
		// set only lastname








}
}
