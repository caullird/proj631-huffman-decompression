package config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class HuffmanFile {

	private File file;
	private char[] content;

	public HuffmanFile() {}
	
	public HuffmanFile(String link) {
		this.setFile(new File(link));
		this.setContent(this.getContentFile());
	}
	
	public char[] getContentFile() {
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
		try {
			File file = new File("src/data/result_data/" + freqFile.getName());
			file.createNewFile();
			
			FileWriter writer = new FileWriter(file);
			writer.write(trad);
			writer.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public File getFile() { return file; }

	public void setFile(File file) { this.file = file; }
	
	public String getName() { return this.file.getName(); }
	
	public char[] getContent() { return content; }

	public void setContent(char[] content) { this.content = content; }	
}
