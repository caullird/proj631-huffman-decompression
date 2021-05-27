package main_program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HuffmanBinary {

	private File file;
	private char[] binaryString;

	public HuffmanBinary(File file){
		this.setFile(file);
		this.setBinaryString(this.getBinaryChain());
	}

	public char[] getBinaryChain(){
		try {
			String result = "";
			Scanner myReader = new Scanner(this.file);
			while(myReader.hasNextLine()) {
				result += myReader.nextLine();
			}
			myReader.close();
			return result.toCharArray();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void setFile(File file) {
		this.file = file;
	}
	
	public char[] getBinaryString() {
		return binaryString;
	}

	public void setBinaryString(char[] cs) {
		this.binaryString = cs;
	}

}
