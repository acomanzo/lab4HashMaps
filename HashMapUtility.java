package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapUtility {

	public static void start() throws FileNotFoundException {
		HashMap<Integer, User> userMap = new HashMap<>();
		
		fillMap(userMap);
		
		displayMap(userMap);
	}

	private static void displayMap(HashMap<Integer, User> userMap) {
		for (Integer i : userMap.keySet()) {
		      System.out.println("ID:" + i + " - " + userMap.get(i));
		    }
	}

	private static void fillMap(HashMap<Integer, User> userMap) throws FileNotFoundException {
		Scanner input = new Scanner(new File("files\\userInformation.txt"));
		
		int id = 1;
		
		while(input.hasNext()) {
			String[] parameters = input.nextLine().split(", ");
			
			userMap.put(id, new User(parameters[0], parameters[1], parameters[2], parameters[3]));
			
			id++;
		}
		
		input.close();
	}

}
