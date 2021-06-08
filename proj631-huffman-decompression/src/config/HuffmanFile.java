package config;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


 /* Class File 
 * 
 * Implements : FileInterface
 * 
 * Global file management
 * 
 */

public class HuffmanFile implements HuffmanFileInterface {

	private File file;
	private char[] content;

	
	/* Constructor of the File Class
	 * 
	 * Create File Object 
	 * 
	 * Override constructor: Possibility to make an object without any
	 * element (allows the creation of a file) or directly with a 
	 * file as a parameter.
	 * 
	 */
	
	public HuffmanFile() {}
	
	public HuffmanFile(String link) {
		this.setFile(new File(link));
		this.setContent(this.getContentFile());
	}
	
	public char[] getContentFile() {
		
		/* getContentFile() function
		 * 
		 * Allows you to retrieve the contents of a file 
		 * 
		 * @Override : getContentFile() in FileInterface
		 * 
		 */
		
		String result = "";
		Scanner myReader;
		try {
			myReader = new Scanner(this.file);
			while(myReader.hasNextLine()) {
				result += myReader.nextLine();
			}
			myReader.close();
			return result.toCharArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void writeResultFile(HuffmanFile binaryFile, HuffmanFile freqFile, String trad) {
		
		/* writeResultFile() function
		 * 
		 * Allows you to write the results to a file and open that file for the user
		 * 
		 * @Override : writeResultFile() in FileInterface
		 * 
		 */
		
		try {
			File file = new File("src/data/result_data/result_" + freqFile.getName());
			file.createNewFile();
			
			FileWriter writer = new FileWriter(file);
			writer.write(trad);
			writer.close();
			
			Desktop desktop = Desktop.getDesktop();
			desktop.open(file);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/* Getters & Setters
	 * 
	 * 
	 * Function allowing the modification and recovery of the elements of the object
	 * 
     * Getters 
     * ----------
     *	- getFile() : is used to retrieve the "file" element 
	 *  - getName() : is used to retrieve the fileName element
	 * 	- getContent() : is used to retried the file content element
	 *  
	 * Setters 
	 * ----------
	 *  - setFile() : is used to modify the file element
	 *  - setContent() : is used to modify the content element
	 * 
	 */
	
	public File getFile() { return file; }

	public void setFile(File file) { this.file = file; }
	
	public String getName() { return this.file.getName(); }
	
	public char[] getContent() { return content; }

	public void setContent(char[] content) { this.content = content; }	
}
