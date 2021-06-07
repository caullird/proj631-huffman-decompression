package main_program.Interface;

import main_program.HuffmanNode;

public interface HuffmanNodeInterface {

	/* setChildren() function
	 * 
	 * Allows you to add child nodes to a parent node
	 * 
	 */
	
	static void setChildren(HuffmanNode left, HuffmanNode right) {};

	/* isLeaf() function
	 * 
	 * Determines whether a node is a leaf or not
	 * 
	 * @Override : isLeaf() in FileInterface
	 * 
	 */
	
	static void isLeaf() {};
}
