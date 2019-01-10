import java.util.ArrayList;
import java.util.Random;

/**
 * Kennel maintains a collection of Dog objects.
 * 
 * @author Bullwinkle
 * @version today
 */
public class Kennel
{
    private ArrayList<Dog> allDogs;

    /**
     * Constructor for objects of class Kennel
     */
    public Kennel()
    {
        allDogs = new ArrayList<Dog>();
    }
    
    /**
     * Adds a dog to the kennel.
     * @param theDog the dog to add
     */
    public void addDog(Dog theDog)
    {
        if(theDog != null){
            allDogs.add(theDog);
        }
    }
    
    /**
     * Displays details of all dogs.
     */
    public void displayDetails()
    {
        if (allDogs != null && allDogs.size() > 0) {
            for (Dog aDog : allDogs){
                //System.out.println(aDog);
            	System.out.format("%s, %s, %d\n", aDog.getName(), aDog.getBreed(), aDog.getAgeInYears());
            }
        }
        else {
            System.out.println("No dogs to display.");
        }
    }
    
    /**
     * Gets a randomly-selected dog and removes it.
     * @return a randomly chosen dog as a Dog
     */
    public Dog getRandomDog()
    {
        Random rand = new Random();
        if (allDogs == null || allDogs.isEmpty()){
            return null;
        }
        else {
            return allDogs.remove(rand.nextInt(allDogs.size()));
        }
    }
    
    /**
     * Adopt a dog, randomly chosen from the kennel.
     */
    public void adopt()
    {
        Dog aDog = getRandomDog();
        if (aDog == null) {
            System.out.println("Sorry no dogs today.");
        }
        else {
        	System.out.format("You have adopted: %s, %s, %d\n", aDog.getName(), aDog.getBreed(), aDog.getAgeInYears());
        }
    }


}
