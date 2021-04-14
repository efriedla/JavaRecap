package Learning.ClassicQuestions;

public class Factorial {
	public static void main(String args[]){

		int n = 5;
		factorial(n);

//		for(int i = 1; i <= n; i++){
//			for(int j =1; j <= i; j++){
//				for(int q = 1; q <=j; q++){
//					System.out.println(i + " " + j + " "+ q);
//				}
//			}
//		}

		printhafTriangle(n);
		printhafTriangleUpsideDown(n);
	}
	public static void factorial(int n){
		if(n < 0){
			System.out.println("Sorry can't factorial 0 or negitives");
		}else {
			int i, fact = 1;
			for (i = 1; i <= n; i++) {
				fact *= i;
			}
			System.out.println("Factorial of " + n + " is: " + fact);
		}
	}
	public static void printhafTriangle(int n){
		int i,j;
		for(i =1; i<=n; i++){
			for(j =1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void printhafTriangleUpsideDown(int n){
		int i,j;
		for(i = 1; i<=n; i++){
			for(j =n;j>=i;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
