package main_program;

import java.util.*;


public class HuffmanTree {
	

	private HuffmanNode root;
	private HuffmanNode current;

	public HuffmanTree(Dictionary<?, ?> frequency) {

		ArrayList<HuffmanNode> nodes = new ArrayList<>();
		for(Enumeration<?> character = frequency.keys(); character.hasMoreElements(); ) {
			String c = character.nextElement().toString();
			nodes.add(new HuffmanNode(c, frequency.get(c).toString()));
		}
		
		Collections.sort(nodes);
		
		while(nodes.size() > 1) {
			nodes.add(new HuffmanNode(nodes.remove(0), nodes.remove(0)));		
		}
		
		this.setRoot(nodes.get(0));
		this.setCurrent(nodes.get(0));
	}
	
	public HuffmanNode getCurrent() { return current; }
	
	public void getRootNode() { this.current = this.root; }
	
	public void getLeftNode() { this.current = this.current.getLeft(); }
	
	public void getRightNode() { this.current = this.current.getRight(); }
	
	public HuffmanNode getRoot() { return root; }

	public void setRoot(HuffmanNode root) { this.root = root; }

	public void setCurrent(HuffmanNode current) { this.current = current; }
}
