package lab4;

import java.util.Date;
import java.util.Scanner;

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
	
	public User(String firstName, String lastName, String email, String password) {
		this(firstName, lastName, email, password, null);
		IDCount++;
		userID = IDCount;
	}
	
	public User(String firstName, String lastName, String email, String password, String gender) {
		this(firstName, lastName, email, password, gender, null);
		IDCount++;
		userID = IDCount;
	}
	
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
	
	public String getName() {
		return firstName + lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
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
	}
}
