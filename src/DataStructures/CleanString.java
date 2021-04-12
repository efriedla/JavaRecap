package DataStructures;

/**
 * Get Rid of Extra Spaces
 * Select and Treat All Blank Cells
 * Convert Numbers Stored as Text into Numbers
 * Remove Duplicates
 * Highlight Errors
 * Change Text to Lower/Upper/Proper Case
 * Spell Check
 * Delete all Formatting
 */

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
	public String toCaps(){
		toClean =  toClean.toUpperCase();
		whatToClean();
		return toClean;

	}
	// to upper
	// to lower
	// all caps
	// trim
	// substring
		// multiple spaces
	// if int string
}
