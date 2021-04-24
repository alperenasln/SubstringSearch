package substring_343_hw5;
//-----------------------------------------------------
//Title: Driver2
//Author:Alperen Aslan
//Definition : This class is a driver and test class for Part 2.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver2 {
	public static void main(String[] args) throws IOException {

		//Reading the input file
		File inputFile = new File("part2.txt");
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		String line;
		line = reader.readLine();	
		int lineN = Integer.parseInt(line);
		
		//Using the LRS function with every input line
		for(int i = 0; i<lineN; i++) {
			String temp;
			line = reader.readLine();
			temp = NonOverlappedSuffix.longestRepeatedSubstring(line);
			//Using a different function to avoid from order of array.
			NonOverlappedSuffix.skipthat(temp, line);
		}		
	}
}
