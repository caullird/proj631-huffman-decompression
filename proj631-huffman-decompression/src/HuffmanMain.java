import java.io.FileNotFoundException;

import main_program.HuffmanDecode;

/* Class HuffmanMain 
* 
* 
* File that allows to choose the files, the only file that can be modified by the user
* 
*/

public class HuffmanMain {
	public static void main(String[] args) throws FileNotFoundException {
		
		/* Main function of the program
		 * 
		 * Add the frequency file and the binary translation, in the data files -> "data/initial_data"
		 * 
		 */
		
		String freqFile = "src/data/initial_data/poly_freq.txt";
		String binaryFile = "src/data/initial_data/poly_comp.txt";
		
		new HuffmanDecode(freqFile,binaryFile);
	}
}
