package com.helloworld.app.util;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HelperUtils {
	public String getJsonFile(String _fileName) {
		StringBuilder result = new StringBuilder("");
		 
		//Get file from resources folder
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(_fileName).getFile());
	 
		try (Scanner scanner = new Scanner(file)) {
	 
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				result.append(line);
			}
	 
			scanner.close();
	 
		} catch (IOException e) {
			e.printStackTrace();
		}
	 
		return result.toString();

	}
}
