package lab4;

import java.util.Date;
import java.util.Scanner;

/**
 * Models a user and its attributes.
 */
public class User {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String gender;
	private Date birthdate;
	private int userID;
	
	private String securityQuestion1;
	private String securityQuestion1Answer;
	
	private String securityQuestion2;
	private String securityQuestion2Answer;
	
	private static int IDCount = 0;
	
	/**
	 * Constructs a User Object with a first and last name, email address, and password.
	 * @param firstName A String representing the first name of the user
	 * @param lastName A String representing the last name of the user
	 * @param email A String representing the email address of the user
	 * @param password A String representing the user's password
	 */
	public User(String firstName, String lastName, String email, String password) {
		this(firstName, lastName, email, password, null);
		
	}
	
	/**
	 * Constructs a User Object with a first and last name, email address, password, and gender. 
	 * @param firstName A String representing the first name of the user
	 * @param lastName A String representing the last name of the user
	 * @param email A String representing the email address of the user
	 * @param password A String representing the user's password
	 * @param gender A String representing the user's gender
	 */
	public User(String firstName, String lastName, String email, String password, String gender) {
		this(firstName, lastName, email, password, gender, null);
		
	}
	
	/**
	 * Constructs a User Object with a first and last name, email address, password, gender, and birthdate. 
	 * @param firstName A String representing the first name of the user
	 * @param lastName A String representing the last name of the user
	 * @param email A String representing the email address of the user
	 * @param password A String representing the user's password
	 * @param gender A String representing the user's gender
	 * @param birthdate A Date object representing the birth date of the user
	 */
	public User(String firstName, String lastName, String email, String password, String gender, Date birthdate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.email = email;
		this.gender = gender;
		this.password = password;
		IDCount++;
		userID = IDCount;
	}
	
	/**
	 * Returns the first and last name of the user.
	 * @return A String representing the first and last name of the user
	 */
	public String getName() {
		return firstName + " " + lastName;
	}
	
	/**
	 * Returns the email address of the user.
	 * @return A String representing the email address of the user
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Returns the ID number of the user.
	 * @return An integer representing the ID number of the user
	 */
	public int getUserID() {
		return userID;
	}
	
	/**
	 * Sets the first name of the user.
	 * @param firstName A String representation of the user's first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/**
	 * Sets the last name of the user.
	 * @param lastName A String representation of the user's last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Sets the email address of the user.
	 * @param email A String representation of the user's email address
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Sets the password of the user.
	 * @param password A String representation of the user's password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Sets the gender of the user.
	 * @param password A String representation of the user's gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Sets the security questions of the user.
	 */
	public void setSecurityQuestions() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the first question.");
		securityQuestion1 = keyboard.nextLine();
		System.out.println("Enter the answer to the first question.");
		securityQuestion1Answer = keyboard.nextLine();
		
		System.out.println("Enter the second question.");
		securityQuestion2 = keyboard.nextLine();
		System.out.println("Enter the answer to the second question.");
		securityQuestion2Answer = keyboard.nextLine();
		
		keyboard.close();
	}
	
	/**
	 * Returns a string representation of the User Object.
	 * @return A String representation of the User Object
	 */
	public String toString() {
		return this.firstName + " " + this.lastName + ", Email: " + this.email;
	}
}
