package hust.soict.hedspi.garbage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class GarbageCreator {
	public static void main(String[] args) {
		String filePath = "src/hust.soict.hedspi.garbage/test.txt";
		String garbage = "";
		long start = System.currentTimeMillis();
		try (FileReader fileReader = new FileReader(new File(filePath))) {
			int ch;
			while ((ch = fileReader.read()) != -1) {
				garbage += (char) ch;
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Time taken: " + (System.currentTimeMillis() - start) + " ms");
	}
}
