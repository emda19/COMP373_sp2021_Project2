package com.online.system.data;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

/* This class represents a simplified form of collecting data from an outside source */
public class DataManager {
	private ArrayList<String> lineCollection;
	
	public DataManager() {}
	
	//Would be used to simulate reading in different types of data
	
	public void readFile(File f) {
		ArrayList<String> lineCollection = new ArrayList<String>(); //List to hold each line of a file
		try {
			Scanner fileReader = new Scanner(f);
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				lineCollection.add(line);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		this.lineCollection = lineCollection;
	}
}
