public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private String eyeColor;
	private int eyeNumber;
  
	// add one instance variable
	private String shoeColor;
  
	/*  the default, no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
    		eyeNumber = 2;
		eyeColor = "unknown";
		
    
    		// initialize your instance variable
    		shoeColor = "unknown";
	}
  

	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  	// Add an accessor method and a mutator method for your instance variable
	public void setShoeColor(String color)
	{
		shoeColor = color;
	}
	
	public String getShoeColor()
	{
		return shoeColor;
	/**
    		String getEyeColor()
    		accessor method for eyeColor
    		@return a string that describes the eye color
	*/
	public String getEyeColor()
	{
		return eyeColor;
	}

	
	/**
    		String toString()
    		gives the internal state of the Potatohead
    		@return output string
	*/
	public String toString()
	{
		String output;
		output =  "Number Of Eyes: " + eyeNumber;
		output += "\nEye Color: " + eyeColor;
    
    		// Add your instance variable to the toString() method
		output += " Shoe Color: " + shoeColor;
		
		return output;
	}
}
