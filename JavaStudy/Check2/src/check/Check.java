package check;

import constants.Constants;

public class Check{

	private static String firstName = "Takakusagi";
	private static String lastName = "Rui";
	public static void main(String[] args) { 
		printName(firstName,lastName);

	}
	private static void printName(String firstName, String lastName) {
	      	String printName = firstName + lastName;
	        System.out.println(printName);
	             
	Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
	pet.introduce();
	
	Pet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
	robotpet.introduce();
	        
	    }
}
