package main_program;

import main_program.Interface.HuffmanNodeInterface;

/* Class HuffmanNode 
* 
* Implements : HuffmanNodeInterface
* 
* Global node management
* 
*/

public class HuffmanNode implements Comparable<HuffmanNode>, HuffmanNodeInterface {
	
	private char stringChar;
	private int weight;

	private HuffmanNode left;
	private HuffmanNode right;
	
	/* Constructor of the HuffmanNode Class
	 * 
	 * Create HuffmanNode Object 
	 * 
	 * @Override constructor: Possibility to create a node 
	 * via two child nodes, or via a character and a weight
	 * 
	 */
	
	public HuffmanNode(String character, String weight) {
		this.stringChar = character.charAt(0);
		this.weight = Integer.parseInt(weight);
	}
	
	public HuffmanNode(HuffmanNode left, HuffmanNode right) {
		this.left = left;
		this.right = right;
		this.weight = left.getWeight() + right.getWeight();
	}
	
	public void setChildren(HuffmanNode left, HuffmanNode right) {
		
		/* setChildren() function
		 * 
		 * Allows you to add child nodes to a parent node
		 * 
		 * @Override : setChildren() in FileInterface
		 * 
		 */
		
		this.setLeft(left);
		this.setRight(right);
		this.setWeight(left.getWeight() + right.getWeight());
	}

	@Override
	public int compareTo(HuffmanNode unNode) { 
		
		/* compareTo() function
		 * 
		 * Allows you to compare one node to another via their weight 
		 * 
		 * @Override : compareTo() in Comparable
		 * 
		 */
		
		return this.getWeight() - unNode.getWeight(); 
	}	
	
	public boolean isLeaf() { 
		
		/* isLeaf() function
		 * 
		 * Determines whether a node is a leaf or not
		 * 
		 * @Override : isLeaf() in FileInterface
		 * 
		 */
		
		return this.getRight() == null && this.getLeft() == null; 
	}
	
	/* Getters & Setters
	 * 
	 * 
	 * Function allowing the modification and recovery of the elements of the object
	 * 
     * Getters 
     * ----------
     *	- getStringChar() : is used to retrieve the stringChar element 
	 *  - getWeight() : is used to retrieve the weight element
	 * 	- getLeft() : is used to retried the left node element
	 * 	- getRight() : is used to retried the right node element
	 *  
	 * Setters 
	 * ----------
	 *  - setLeft() : is used to modify the left node element
	 *  - setRight() : is used to modify the right node element
	 *  - setWeight() : is used to modify the the weight element
	 * 
	 */
	
	public char getStringChar() { return stringChar; }

	public int getWeight() { return weight; }
	
	public HuffmanNode getLeft() { return left; }

	public HuffmanNode getRight() { return right; }
	
	public void setLeft(HuffmanNode left) { this.left = left; }

	public void setRight(HuffmanNode right) { this.right = right; }
	
	public void setWeight(int weight) { this.weight = weight; }
}
