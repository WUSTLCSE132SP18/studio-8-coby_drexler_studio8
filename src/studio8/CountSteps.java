package studio8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

// TODO: Develop an algorithm to count steps in accelerometer data
//    Major steeps:
//       1. Create a class and main method.
//       2. Using a Scanner and File object, read data from your .csv file.
//       3. Develop and test algorithms to count the "peaks" in the data.

public class CountSteps {
	
	public static void main(String args[]) {
		
		String fileName = "StepData.csv";
		
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.forEach(System.out::println);	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}





