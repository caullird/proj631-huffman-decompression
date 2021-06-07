package config;

public interface FileInterface {

	/* getContentFile() function
	 * 
	 * Allows you to retrieve the contents of a file 
	 * 
	 */
	
	static void getContentFile() {};
	
	
	/* writeResultFile() function
	 * 
	 * Allows you to write the results to a file and open that file for the user
	 * 
	 */
	
	static void writeResultFile(HuffmanFile binaryFile, HuffmanFile freqFile, String trad) {};

}
