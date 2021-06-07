package main_program;

/* Class HuffmanTraduction 
* 
* Implements : HuffmanTraductionInterface
* 
* Global translation management (to go from a binary 
* string to a character string)
* 
*/

public class HuffmanTraduction {

	private char [] binString;
	private HuffmanTree tree;
	
	public HuffmanTraduction(char[] binString, HuffmanTree tree) {
		
		/* Constructor of the HuffmanTraduction Class
		 * 
		 * Create HuffmanTraduction Object 
		 * 
		 */
		
		super();
		this.binString = binString;
		this.tree = tree;
	}
	
	public String BinaryStringTranslation() {
		
		/* BinaryStringTranslation() function
		 * 
		 * Allows to pass from a binary string to a character string with the dictionary 
		 * 
		 * @Override : BinaryStringTranslation() in HuffmanTraductionInterface
		 * 
		 */
		
		String resultString = "";
		
		for(char bin: this.getBinString()) {
			
			HuffmanNode getCurrent = this.getTree().getCurrent();
			
			if(getCurrent.isLeaf()){
				resultString += getCurrent.getStringChar();
				this.tree.getRootNode();
			}			
			
			if(bin == "0".charAt(0)) {
				this.tree.getLeftNode();
			}else {
				this.tree.getRightNode();
			}
			
		}
		return resultString;
	}
	
	/* Getters & Setters
	 * 
	 * 
	 * Function allowing the modification and recovery of the elements of the object
	 * 
     * Getters 
     * ----------
     *	- getBinString() : is used to retrieve the binString element 
	 *  - getTree() : is used to retrieve the tree element
	 *  
	 * Setters 
	 * ----------
	 *  - setBinString() : is used to modify the binString element
	 *  - setTree() : is used to modify the tree element
	 * 
	 */
	
	public char[] getBinString() { return binString; }

	public HuffmanTree getTree() { return tree; }
	
	public void setBinString(char[] binString) { this.binString = binString; }

	public void setTree(HuffmanTree tree) { this.tree = tree; }

}
