package DataStructures;

public class CleanString {
	String toClean;
	int count = 0;
	public CleanString(){
		this.toClean = "";
	}
	public CleanString(String toClean){
		this.toClean = toClean;
	}

	public String getToClean(){
		return toClean;
	}
	public void whatToClean(){
		System.out.println(toClean);
	}
	public void setToClean(String s){
		this.toClean = s;
	}
}
