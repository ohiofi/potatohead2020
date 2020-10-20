public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private String eyeColor;
	private int eyeNumber;
	private String mustache;
  
	// add one instance variable
	private String hairColor;
  
	/*  the default, no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
    		eyeNumber = 2;
		eyeColor = "unknown";
		mustacheType = "none";
    
    		// initialize your instance variable
    		hairColor = "unknown";
	}
  

	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  	// Add an accessor method and a mutator method for your instance variable
	public String setHairColor(newHair){
		hairColor = newHair;
	}
	
	public String getHairColor(){
		return hairColor;
	}
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
		String getMustacheType()
		accessor method for mustache
		@return a string describing the type of mustache
	*/
	public String getMustacheType(){
		return mustacheType
	}
	
	/**
		void setMustacheType(String type)
		mutator method for mustache
	*/
	public void setMustacheType(String type){
		mustacheType = type;
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
		output += "\nMustache Type: " + mustacheType;
		output += "\nHair Color: " + hairColor;
    
    		// Add your instance variable to the toString() method

		return output;
	}
}
