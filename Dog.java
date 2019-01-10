
/**
 * Dog.
 * 
 * @author Bullwinkle
 * @version today
 */
public class Dog
{
    private String name;
    private String breed;
    private int ageInYears;

    /**
     * Default constructor for objects of class Dog
     */
    public Dog()
    {
       
    }
    
    /**
     * Constructor for objects of class Dog.
     * @param name to set the dog name
     * @param breed to set the dog breed
     * @param ageInYears to set the dog age in years
     */
    public Dog(String name, String breed, int ageInYears)
    {
        setName(name);
        setBreed(breed);
        setAgeInYears(ageInYears);
    }
    
    /**
     * Sets the name.
     * @param name dog name
     */
    public void setName(String name)
    {
        if(name != null){
            this.name = name;
        }
        
    }
    
    /**
     * Gets the name.
     * @return name as a String
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Sets the breed.
     * @param breed dog breed
     */
    public void setBreed(String breed)
    {
        if(breed != null){
            this.breed = breed;
        }
       
    }
    
    /**
     * Gets the breed.
     * @return breed as a String
     */
    public String getBreed()
    {
        return breed;
    }
    
    /**
     * Sets the age in years.
     * @param ageInYears age in years
     */
    public void setAgeInYears(int ageInYears)
    {
        if(ageInYears >= 0){
            this.ageInYears = ageInYears;
        }
        
    }
    
    /**
     * Gets the age in years.
     * @return age in years as an int
     */
    public int getAgeInYears()
    {
        return ageInYears;
    }
    

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", ageInYears="
				+ ageInYears + "]";
	}
    
    


}
