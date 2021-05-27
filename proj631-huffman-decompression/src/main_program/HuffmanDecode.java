package main_program;

import java.io.FileNotFoundException;

import config.HuffmanFile;

public class HuffmanDecode {
	
	public HuffmanDecode(String frequencyPath, String binaryPath) throws FileNotFoundException{
		
		HuffmanFile binaryFile = new HuffmanFile(binaryPath);
		
		HuffmanBinary getBinary = new HuffmanBinary(binaryFile.getFile());
		
		HuffmanFile freqFile = new HuffmanFile(frequencyPath);
		
		HuffmanFrequence huffFreq = new HuffmanFrequence(freqFile.getFile()); 
		
		HuffmanTree huffTree = new HuffmanTree(huffFreq.readFreq());
		
		HuffmanTraduction convertString = new HuffmanTraduction(getBinary.getBinaryChain(), huffTree);
		
		HuffmanFile writeResult = new HuffmanFile();
		
		writeResult.writeResultFile(binaryFile,freqFile,convertString.BinaryStringTranslation());
	
	}
}
