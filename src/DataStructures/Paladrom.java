package DataStructures;

public class Paladrom {
	public static void main(String args[]){
		System.out.println("testing if paladrom");
		System.out.println(isPaladrom(4546));//True
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
}
