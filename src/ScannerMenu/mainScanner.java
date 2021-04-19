package ScannerMenu;

import java.util.Scanner;

public class mainScanner {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		menu(sc);


		sc.close();
	}
	public static void menu(Scanner sc) throws Exception {
		int again = 0;
		while(again == 0){
			System.out.println("Working");
			System.out.println("Would you like to play again: 0 for yes");
			try{
				again = sc.nextInt();
			} catch (Exception e) {
				again = 1;
				System.out.println("Something went wrong.");
			}
		}
		System.out.println("thanks for playing");

	}
}
