package substring_343_hw5;
//-----------------------------------------------------
//Title: Driver1
//Author:Alperen Aslan
//Definition : This class is a driver and test class for Part 1.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Driver1 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
	//Reading the input file	 
	File inputFile = new File("part1.txt");
	BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	String line;
	line = reader.readLine();	
	System.out.println("Input word: "+line);
	
	//Implementing brute force algorithm and calculating time by using nanoTime.
	long starttime1 =System.nanoTime();
	BruteForce bf = new BruteForce();	
	System.out.println(bf.lrs(line));
	long endtime1 = System.nanoTime();
	long totaltime1 = endtime1-starttime1;
	System.out.println(bf.lrs(line).length());
	System.out.println("Brute force time: "+totaltime1+" ns ");
	
	
	
	//Implementing LRS algorithm with collection sort and calculating time by using nanoTime.
	long starttime2 =System.nanoTime();
	LRS lrs = new LRS();
	long endtime2 = System.nanoTime();
	long totaltime2 = endtime2-starttime2;
	System.out.println("LRS time: "+totaltime2+" ns ");
	
	//Implementing LRS algorithm with 3-way radix sort and calculating time by using nanoTime.
	long starttime3 =System.nanoTime();
	LRS_b lrsb = new LRS_b();
	long endtime3 = System.nanoTime();
	long totaltime3 = endtime3-starttime3;
	System.out.println("LRS-B time: "+totaltime3+" ns ");
	
	
	
	
	}
	
}
