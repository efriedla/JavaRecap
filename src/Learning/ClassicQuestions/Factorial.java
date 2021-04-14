package Learning.ClassicQuestions;

public class Factorial {
	public static void main(String args[]){
		System.out.println(55);
		int n = 5;
		factorial(n);
	}
	public static void factorial(int n){
		int i,fact =1;
		for(i = 1; i <= n; i++){
			fact *=i;
		}
		System.out.println("Factorial of "+ n +" is: "+fact);
	}
}
