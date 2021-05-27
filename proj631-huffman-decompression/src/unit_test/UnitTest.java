package unit_test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import config.HuffmanFile;
import main_program.HuffmanBinary;
import main_program.HuffmanFrequence;
import main_program.HuffmanTree;

class UnitTest {
	
	@Test
	public void testReadFreq() throws FileNotFoundException {
		
		HuffmanFile freqFile = new HuffmanFile("src/data/initial_data/exemple_freq.txt");
		
		HuffmanFrequence huffFreq = new HuffmanFrequence(freqFile.getFile()); 
		
		System.out.println(huffFreq.readFreq());
		
		assertEquals(huffFreq.readFreq().toString(), "{b=1, u=1, j=1, r=1, o=2, !=2, n=1}");
	}

	@Test
	public void testReadBinary() throws FileNotFoundException {
		
		HuffmanFile binaryFile = new HuffmanFile("src/data/initial_data/exemple_comp.txt");
		
		HuffmanBinary getBinary = new HuffmanBinary(binaryFile.getFile());
		
		char[] c_arr = "0101111101001110111010001".toCharArray();
		
		System.out.println(c_arr);
		System.out.println(getBinary.getBinaryChain());		
		
		assertSame(getBinary.getBinaryChain(), c_arr);
	}
	
	@Test
	public void testTreeConstruction() throws FileNotFoundException {
		
		HuffmanFile freqFile = new HuffmanFile("src/data/initial_data/exemple_freq.txt");
		
		HuffmanFrequence huffFreq = new HuffmanFrequence(freqFile.getFile()); 
		
		HuffmanTree huffTree = new HuffmanTree(huffFreq.readFreq());
		
		assertEquals(huffTree.getRoot().getLeft().getLeft().getStringChar(), "!".charAt(0));
		assertEquals(huffTree.getRoot().getRight().getLeft().getLeft().getStringChar(), "j".charAt(0));
		assertEquals(huffTree.getRoot().getRight().getRight().getLeft().getStringChar(), "n".charAt(0));	
	}
	
	

}
