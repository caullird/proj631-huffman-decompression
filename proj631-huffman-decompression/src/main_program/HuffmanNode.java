package main_program;

public class HuffmanNode implements Comparable<HuffmanNode> {
	
	private char stringChar;
	private int weight;

	private HuffmanNode left;
	private HuffmanNode right;
	
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
		this.setLeft(left);
		this.setRight(right);
		this.setWeight(left.getWeight() + right.getWeight());
	}

	@Override
	public int compareTo(HuffmanNode unNode) { return this.weight - unNode.weight; }	
	
	public boolean isLeaf() { return this.getRight() == null && this.getLeft() == null; }

	public char getStringChar() { return stringChar; }

	public int getWeight() { return weight; }
	
	public HuffmanNode getLeft() { return left; }

	public HuffmanNode getRight() { return right; }
	
	public void setLeft(HuffmanNode left) { this.left = left; }

	public void setRight(HuffmanNode right) { this.right = right; }
	
	public void setWeight(int weight) { this.weight = weight; }
}
