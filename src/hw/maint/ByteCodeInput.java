package hw.maint;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ByteCodeInput {
	static List<String> records = new ArrayList<String>();
	
	
	public static List<String> readFile(String filename) throws Exception {
		try{
		String line = null;
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

		while ((line = bufferedReader.readLine()) != null) {
			records.add(line);
		}

		bufferedReader.close();
		}catch(Exception e){
			System.out.println("File Not Found!");
		}
		return records;
	}

}

