/**
 * 
 * @author Bullwinkle Moose
 * @version today
 * 
 */
public class Lab01_Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		new Lab01_Driver().test();

	}
	
	/**
	 * creates dogs and add them to the kennel for testing
	 */
	public void test(){
		
		Kennel kennel = new Kennel();
		kennel.addDog(new Dog("Darby", "GSD", 6));
		kennel.addDog(new Dog("Myia", "GSD", 5));
		kennel.addDog(new Dog("Lassie", "Collie", 3));
		
		System.out.println("These are the dogs currently in the kennel:");
		kennel.displayDetails();
		
		kennel.adopt();
		
		System.out.println("These are the dogs currently in the kennel:");
		kennel.displayDetails();
		
	}

}
