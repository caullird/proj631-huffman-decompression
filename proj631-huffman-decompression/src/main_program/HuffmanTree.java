package main_program;

import java.util.*;

import main_program.Interface.HuffmanTreeInterface;

/* Class HuffmanTree 
* 
* Implements : HuffmanTreeInterface
* 
* Global HuffmanTree management
* 
*/

public class HuffmanTree implements HuffmanTreeInterface {
	
	private HuffmanNode root;
	private HuffmanNode current;
	private Dictionary<?, ?> frequency;

	public HuffmanTree(Dictionary<?, ?> frequency) {
		
		/* Constructor of the HuffmanTree Class
		 * 
		 * Create HuffmanTree Object 
		 * 
		 * Allows you to generate the Huffman tree
		 * 
		 */
		
		this.setFrequency(frequency);
		this.generateHuffmanTree();
	}
	
	public void generateHuffmanTree() {
		
		/* generateHuffmanTree() function
		 * 
		 * Allows you to generate a Huffman tree
		 * 
		 * @Override : generateHuffmanTree() in HuffmanTreeInterface
		 * 
		 */
		
		ArrayList<HuffmanNode> nodes = new ArrayList<>();
		for(Enumeration<?> character = frequency.keys(); character.hasMoreElements(); ) {
			String c = character.nextElement().toString();
			nodes.add(new HuffmanNode(c, this.getFrequency().get(c).toString()));
		}
		
		Collections.sort(nodes);
		
		while(nodes.size() > 1) {
			nodes.add(new HuffmanNode(nodes.remove(0), nodes.remove(0)));		
		}
		
		this.setRoot(nodes.get(0));
		this.setCurrent(nodes.get(0));
	}
	
	/* Getters & Setters
	 * 
	 * 
	 * Function allowing the modification and recovery of the elements of the object
	 * 
     * Getters 
     * ----------
     *	- getCurrent() : is used to retrieve the current element 
	 *  - getRootNode() : is used to retrieve the node root element
	 *  - getLeftNode() : is used to retrieve the left node element
	 *  - getRightNode() : is used to retrieve the right node element
	 *  - getRoot() : is used to retrieve the tree root element
	 *  - getFrequency() : is used to retrieve the frequency element
	 *  
	 * Setters 
	 * ----------
	 *  - setRoot() : is used to modify the node root element
	 *  - setCurrent() : is used to modify the current node element
	 *  - setFrequency() : is used to modify the frequency element
	 * 
	 */
	
	public HuffmanNode getCurrent() { return current; }
	
	public void getRootNode() { this.current = this.root; }
	
	public void getLeftNode() { this.current = this.current.getLeft(); }
	
	public void getRightNode() { this.current = this.current.getRight(); }
	
	public HuffmanNode getRoot() { return root; }
	
	public Dictionary<?, ?> getFrequency() { return frequency; }

	public void setRoot(HuffmanNode root) { this.root = root; }

	public void setCurrent(HuffmanNode current) { this.current = current; }

	public void setFrequency(Dictionary<?, ?> frequency) { this.frequency = frequency; }

}
