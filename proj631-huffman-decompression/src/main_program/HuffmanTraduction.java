package main_program;

public class HuffmanTraduction {

	private char [] binString;
	private HuffmanTree tree;
	
	public HuffmanTraduction(char[] binString, HuffmanTree tree) {
		super();
		this.binString = binString;
		this.tree = tree;
	}
	
	public String BinaryStringTranslation() {
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
	
	public char[] getBinString() { return binString; }

	public HuffmanTree getTree() { return tree; }
	
	public void setBinString(char[] binString) { this.binString = binString; }

	public void setTree(HuffmanTree tree) { this.tree = tree; }

}
