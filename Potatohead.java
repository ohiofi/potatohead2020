public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private String eyeColor;
	private int eyeNumber;
	private String earColor;
  
	// add one instance variable
	
  
	/*  the default, no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
    		eyeNumber = 2;
		eyeColor = "unknown";
		earColor = "unknown";
		
    
    		// initialize your instance variable
    
	}
  

	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  	// Add an accessor method and a mutator method for your instance variable

	/**
    		String getEyeColor()
    		accessor method for eyeColor
    		@return a string that describes the eye color
	*/
	public String getEarColor()
	{
		return earColor;
	}
	
	public void setEarColor(String color)-+
	{
		earColor = color;
	}
	
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
		output = "Ear Color: " + earColor;
    
    		// Add your instance variable to the toString() method

		return output;
	}
}
