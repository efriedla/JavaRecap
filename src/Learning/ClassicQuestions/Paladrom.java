package Learning.ClassicQuestions;

import java.util.Scanner;

public class Paladrom {
	public static void main(String args[]){
		System.out.println("testing if paladrom");
		System.out.println(isPaladrom(454));//True
		System.out.println(isPaladrom("noon"));
		Scanner sc = new Scanner(System.in);
		int again = 1;
		String str;
		try {
			while (again == 1) {
				System.out.println("Enter a string/number to check if it is a palindrome \n");
				str = sc.next();
				System.out.println(isPaladrom(str));
				System.out.println("\nEnter a 1 to enter another paladrom");
				again = sc.nextInt();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();


	}

	public static boolean isPaladrom(int pal){
		int r,sum=0,temp;
		temp = pal;
		System.out.println(temp);
		while(pal > 0){
			r=pal%10;
			//System.out.println(r);
			sum = (sum*10)+r;
			//System.out.println(sum);
			pal=pal/10;
			//System.out.println(pal);
		}
		if(temp==sum){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isPaladrom(String pal){
		String reverse = "";
		for(int i = pal.length() -1; i >= 0; i--){
			reverse = reverse+ pal.charAt(i);
		}
		//return pal.equals(reverse)? true:false;
		if(pal.equals(reverse)) {
			return true;
		}else{
			return false;
		}
	}
}
