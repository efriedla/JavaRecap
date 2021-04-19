package Learning.ClassicQuestions;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
	public static void main(String[] args) {
		//array
		List<String> breakfast = new ArrayList<>();
		breakfast.add("eggs");
		breakfast.add("biscuts and gravy");
		breakfast.add("toast");
		breakfast.add("bacon");
		//creat new
		// add
		for(String food:breakfast){
			System.out.println(food);
		}
		// find
		System.out.println(breakfast.get(2));
		breakfast.set(2,"orange");
		// list
		//reverse
		int count=0;
		String[] arr = new String[4];
		for(String food:breakfast){
			arr[count] = food;
			count++;
		}
		for( int i= 0; i < 4 ;i++ ){
			System.out.println(" ."+arr[i]);
		}

		//list to array
		// merge two list


	}
}
