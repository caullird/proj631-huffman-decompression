package main_program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class HuffmanFrequence {

	private File file;
	private Dictionary<String, String> freq;
	
	public HuffmanFrequence(File file){
		this.setFile(file);
		try {
			this.setFreq(this.readFreq());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Dictionary<String, String> readFreq() throws FileNotFoundException{
		
		Dictionary<String, String> frequency = new Hashtable<String, String>();
		
		Scanner myReader = new Scanner(this.file);
		
		int nbRows = Integer.parseInt(myReader.nextLine());
		
		for(int i = 0; i < nbRows; i++) {
			String str = myReader.nextLine();
			String[] data = str.split(" ");
			frequency.put(data[0], data[1]);
		}
		
		myReader.close();
		
		return frequency;
	}
	
	public void setFile(File file) { this.file = file; }

	public Dictionary<String, String> getFreq() { return freq; }

	public void setFreq(Dictionary<String, String> freq) { this.freq = freq; }	
}
