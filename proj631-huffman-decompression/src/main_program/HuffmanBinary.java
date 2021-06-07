package main_program;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import main_program.Interface.HuffmanBinaryInterface;

/* Class HuffmanBinary 
* 
* Implements : HuffmanBinaryInterface
* 
* Global HuffmanBinary management
* 
*/

public class HuffmanBinary implements HuffmanBinaryInterface {

	private File file;
	private char[] binaryString;

	public HuffmanBinary(File file){
		
		/* Constructor of the HuffmanBinary Class
		 * 
		 * Create HuffmanBinary Object 
		 * 
		 */
		
		this.setFile(file);
		this.setBinaryString(this.getBinaryChain());
	}

	public char[] getBinaryChain(){
		
		/* getBinaryChain() function
		 * 
		 * Allows you to get binary chain from file
		 * 
		 * @Override : getBinaryChain() in FileInterface
		 * 
		 */
		
		
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
	
	/* Getters & Setters
	 * 
	 * 
	 * Function allowing the modification and recovery of the elements of the object
	 * 
     * Getters 
     * ----------
     *	- getFile() : is used to retrieve the file element 
	 *  - getBinaryString() : is used to retrieve the binary string element
	 *  
	 * Setters 
	 * ----------
	 *  - setBinaryString() : is used to modify the binary string element
	 *  - setFile() : is used to modify the file element
	 * 
	 */
	
	public File getFile() { return this.file; }
	
	public char[] getBinaryString() { return this.binaryString; }

	public void setBinaryString(char[] binaryString) { this.binaryString = binaryString; }
	
	public void setFile(File file) { this.file = file; }

}
