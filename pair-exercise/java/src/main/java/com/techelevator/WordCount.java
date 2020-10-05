package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		
		int counter = 0;
		int sentenceCounter = 0;
		File input = new File("alices_adventures_in_wonderland.txt");
		try(Scanner fileScanner = new Scanner(input)) {
		while(fileScanner.hasNextLine() ) {
		String line = fileScanner.nextLine();
		String[] word = line.split(" ");
		for(String wordCount : word) {
			counter ++;
		if(wordCount.equals("")) {
			counter --;
		}
		if((wordCount.contains("!") || wordCount.contains("?") || wordCount.contains(".")))  {
			sentenceCounter ++;
		}
		}
		
	
		
		}
		
	
		System.out.println("Word Count: " + counter);
		System.out.println("Sentence Count: " + sentenceCounter);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
