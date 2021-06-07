package main_program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

import main_program.Interface.HuffmanFrequenceInterface;


/* Class HuffmanFrequence 
* 
* Implements : HuffmanFrequenceInterface
* 
* Allows you to read the frequency dictionary
* 
*/

public class HuffmanFrequence implements HuffmanFrequenceInterface {

	private File file;
	private Dictionary<String, String> freq;
	
	public HuffmanFrequence(File file){
		
		/* Constructor of the HuffmanFrequence Class
		 * 
		 * Create HuffmanFrequence Object 
		 * 
		 * Retrieves a dictionary by reading the file containing the dictionary
		 * 
		 */
		
		this.setFile(file);
		try {
			this.setFreq(this.readFreq());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Dictionary<String, String> readFreq() throws FileNotFoundException{
		
		/* readFreq() function
		 * 
		 * Reads the frequency file and returns a dictionary
		 * 
		 * @Override : readFreq() in HuffmanFrequenceInterface
		 * 
		 */
		
		Dictionary<String, String> frequency = new Hashtable<String, String>();
		
		Scanner myReader = new Scanner(this.getFile());
		
		int nbRows = Integer.parseInt(myReader.nextLine());
		
		for(int i = 0; i < nbRows; i++) {
			String str = myReader.nextLine();
			String[] data = str.split(" ");
			frequency.put(data[0], data[1]);
		}
		
		myReader.close();
		
		return frequency;
	}
	
	/* Getters & Setters
	 * 
	 * 
	 * Function allowing the modification and recovery of the elements of the object
	 * 
     * Getters 
     * ----------
     *	- getFreq() : is used to retrieve the frequency element 
	 *  - getFile() : is used to retrieve the file element
	 *  
	 * Setters 
	 * ----------
	 *  - setFile() : is used to modify the file element
	 *  - setFreq() : is used to modify the frequency element
	 * 
	 */

	public Dictionary<String, String> getFreq() { return this.freq; }
	
	public File getFile() { return this.file; }
	
	public void setFile(File file) { this.file = file; }

	public void setFreq(Dictionary<String, String> freq) { this.freq = freq; }	
}
