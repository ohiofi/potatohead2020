/**
A class that describes an individual Potatohead toy
*/
public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private String eyeColor, hatStyle;
	private int eyeNumber;
	private String earColor;
  private String mustache;
  private String hairColor;
	private String shoeColor;
  // add one instance variable

  
	/*  the default, no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here */
		eyeNumber = 2;
		eyeColor = "unknown";
		earColor = "unknown";
		hatStyle = "";
		mustache = "none";
		this.hairColor = "";
    shoeColor = "unknown";
    // initialize your instance variable

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
    		@return eyeColor a string that describes the eye color
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
	

	
	
	public void setHatStyle(String style){
		hatStyle = style;
	}
	
	public String getHatStyle(){
		return hatStyle;
  }

	/**
		String getMustacheType()
		accessor method for mustache
		@return mustache a string describing the type of mustache
	*/
	public String getMustacheType(){
		return mustache;
	}
    	/**
		String getHairColor()
		accessor method for hairColor
		@return hairColor a string describing the type of hairColor
	*/
	public String getHairColor(){
		return hairColor;
	}
	
	/**
		void setMustacheType(String type)
		mutator method for mustache
		@param type
	*/
	public void setMustacheType(String type){

		mustache = type;
	}
	/**
		void setMustacheType(String newHairColor)
		mutator method for hairColor
		@param newHairColor for what the user desires.  
	*/
	public void newHairColor(String _newHairColor){
		this.hairColor = _newHairColor;

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
		output += "\nEar Color: " + earColor;
    output += "\nMustache Type: " + mustacheType;
		output += "\nHat Style: " + hatStyle;
    output += "\nMustache Type: " + mustache;
    output += "\nHair Color: + hairColor";
    output += " Shoe Color: " + shoeColor;

    
    		// Add your instance variable to the toString() method
		
		
		return output;
	}
}
