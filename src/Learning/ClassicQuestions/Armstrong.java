package Learning.ClassicQuestions;

public class Armstrong {
	public static void main(String[] args) {
		int c = 0,a,temp;
		int n = 154;
		temp = n;
		while(n > 1){
			a = n % 0;
			n = n / 10;
			c = c + (a*a*a);
		}
		if(temp == c) {
			System.out.println("armstrong number");
		}else{
			System.out.println("Not armstrong number");
		}

	}
}
