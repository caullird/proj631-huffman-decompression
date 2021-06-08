package main_program;

import java.io.FileNotFoundException;

import config.HuffmanFile;

/* Class HuffmanDecode 
* 
* Heart of the program, allows the call of all functions
* 
*/

public class HuffmanDecode {
	
	public HuffmanDecode(String frequencyPath, String binaryPath) throws FileNotFoundException{
		
		// Allows the reading of the binary file
		HuffmanFile binaryFile = new HuffmanFile(binaryPath);
		
		HuffmanBinary getBinary = new HuffmanBinary(binaryFile.getFile());
		
		// Allows the reading of the frequency file
		HuffmanFile freqFile = new HuffmanFile(frequencyPath);
		
		HuffmanFrequence huffFreq = new HuffmanFrequence(freqFile.getFile()); 
		
		// Allows the creation of the binary tree
		HuffmanTree huffTree = new HuffmanTree(huffFreq.readFreq());
		
		// Allows the translation of the binary string into a string
		HuffmanTraduction convertString = new HuffmanTraduction(getBinary.getBinaryChain(), huffTree);
		
		// Allows writing the result in a file
		HuffmanFile writeResult = new HuffmanFile();
		
		writeResult.writeResultFile(binaryFile,freqFile,convertString.BinaryStringTranslation());
		
	}
}
