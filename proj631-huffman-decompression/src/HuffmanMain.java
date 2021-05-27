import java.io.FileNotFoundException;

import main_program.HuffmanDecode;

public class HuffmanMain {

	public static void main(String[] args) throws FileNotFoundException {
		new HuffmanDecode("src/data/initial_data/exemple_freq.txt","src/data/initial_data/exemple_comp.txt");
	}
	
}
