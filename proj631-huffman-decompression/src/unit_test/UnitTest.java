package unit_test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import config.HuffmanFile;
import main_program.HuffmanBinary;
import main_program.HuffmanFrequence;
import main_program.HuffmanTraduction;
import main_program.HuffmanTree;

/* Class UnitTest
* 
* 
* overall testing of the program's functionality
* 
*/

class UnitTest {
	
	@Test
	public void testReadFreq() throws FileNotFoundException {
		
		/* testReadFreq() function
		 * 
		 * Allows to check the correct reading of the frequency file by the program
		 * 
		 */
		
		HuffmanFile freqFile = new HuffmanFile("src/data/initial_data/exemple_freq.txt");
		
		HuffmanFrequence huffFreq = new HuffmanFrequence(freqFile.getFile()); 
		
		System.out.println(huffFreq.readFreq());
		
		assertEquals(huffFreq.readFreq().toString(), "{b=1, u=1, j=1, r=1, o=2, n=1}");
	}

	@Test
	public void testReadBinary() throws FileNotFoundException {
		
		/* testReadBinary() function
		 * 
		 * Allows to check the correct reading of the binary file by the program
		 * 
		 */
		
		HuffmanFile binaryFile = new HuffmanFile("src/data/initial_data/exemple_comp.txt");
		
		HuffmanBinary getBinary = new HuffmanBinary(binaryFile.getFile());
		
		char[] c_arr = "010111000111100101".toCharArray();			
		
		assertSame(getBinary.getBinaryChain()[1], c_arr[1]);
		assertSame(getBinary.getBinaryChain()[5], c_arr[5]);
		assertSame(getBinary.getBinaryChain()[7], c_arr[7]);
	}
	
	@Test
	public void testTreeConstruction() throws FileNotFoundException {
		
		/* testTreeConstruction() function
		 * 
		 * Allows to check the good creation of the tree using the frequency file
		 * 
		 */
		
		HuffmanFile freqFile = new HuffmanFile("src/data/initial_data/exemple_freq.txt");
		
		HuffmanFrequence huffFreq = new HuffmanFrequence(freqFile.getFile()); 
		
		HuffmanTree huffTree = new HuffmanTree(huffFreq.readFreq());
		
		assertEquals(huffTree.getRoot().getLeft().getLeft().getStringChar(), "u".charAt(0));
		assertEquals(huffTree.getRoot().getRight().getLeft().getLeft().getStringChar(), "n".charAt(0));	
	}
	
	@Test 
	public void testBinaryToStringTranslation() throws FileNotFoundException {
		
		/* testBinaryToStringTranslation() function
		 * 
		 * Allows to check the good translation of the binary string
		 * 
		 */
		
		HuffmanFile binaryFile = new HuffmanFile("src/data/initial_data/exemple_comp.txt");
		
		HuffmanBinary getBinary = new HuffmanBinary(binaryFile.getFile());
		
		HuffmanFile freqFile = new HuffmanFile("src/data/initial_data/exemple_freq.txt");
		
		HuffmanFrequence huffFreq = new HuffmanFrequence(freqFile.getFile()); 
		
		HuffmanTree huffTree = new HuffmanTree(huffFreq.readFreq());
		
		HuffmanTraduction convertString = new HuffmanTraduction(getBinary.getBinaryChain(), huffTree);
		
		assertEquals(convertString.BinaryStringTranslation(), "bonjour");
	}
	
	

}
