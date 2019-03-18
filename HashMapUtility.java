package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * Utility to test common HashMap methods.
 * @author Habib Affinnih
 */
public class HashMapUtility {
	/**
	 * Tests the common methods of the HashMap Class.
	 * @throws FileNotFoundException If the specified file can not be found
	 */
	public static void start() throws FileNotFoundException {
		HashMap<Integer, User> userMap = new HashMap<>();
		
		fillMap(userMap);
		
		displayMap(userMap);
		
		System.out.println();
		removeRandomEntry(userMap);
		
		System.out.println();
		mapSize(userMap);
		
		System.out.println();
		containsKey(userMap, 2);
		
		System.out.println();
		isEmpty(userMap);
		
		System.out.println();
		clear(userMap);
	}

	/**
	 * Removes all entries from a HashMap.
	 * @param userMap A reference to a HashMap Object
	 */
	private static void clear(HashMap<Integer, User> userMap) {
		System.out.println("Removing all entries from the HashMap...");
		userMap.clear();
		isEmpty(userMap);
	}

	/**
	 * Checks if a HashMap Object is empty.
	 * @param userMap A reference to a HashMap Object
	 */
	private static void isEmpty(HashMap<Integer, User> userMap) {
		System.out.println("Checking if the HashMap is empty...");
		if(userMap.isEmpty())
			System.out.println("It is empty.");
		else
			System.out.println("It is not empty.");
	}

	/**
	 * Checks if a specified key is contained in the HashMap.
	 * @param userMap A reference to a HashMap Object
	 * @param key An integer representing a key in a HashMap Object
	 */
	private static void containsKey(HashMap<Integer, User> userMap, int key) {
		System.out.println("Checking if key " + key + " is in the HashMap...");
		if(userMap.containsKey(key))
			System.out.println("Key " + key + " is mapped to User " + userMap.get(key));
		else
			System.out.println("The key does not exist in the HashMap.");
	}

	/**
	 * Prints the size of a HashMap.
	 * @param userMap A reference to a HashMap Object
	 */
	private static void mapSize(HashMap<Integer, User> userMap) {
		System.out.println("The map has " + userMap.size() + " entries.");
	}

	/**
	 * Removes a random entry from a HashMap.
	 * @param userMap A reference to a HashMap Object
	 */
	private static void removeRandomEntry(HashMap<Integer, User> userMap) {
		System.out.println("Removing the a random element from the hashmap...");
		
		Random rand = new Random();
		
		int index = 1 + rand.nextInt(userMap.size());
		
		userMap.remove(index);
		
		displayMap(userMap);
		
	}

	/**
	 * Prints the entries in a HashMap.
	 * @param userMap A reference to a HashMap Object
	 */
	private static void displayMap(HashMap<Integer, User> userMap) {
		System.out.println("The entries in the Hashmap are...");
		for (Integer i : userMap.keySet()) {
		      System.out.println("ID:" + i + " - " + userMap.get(i));
		}
	}
	
	/**
	 * Populates a HashMap with integers as keys and User Objects as values.
	 * @param userMap A reference to a HashMap object
	 * @throws FileNotFoundException If the specified file is not found
	 */
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
