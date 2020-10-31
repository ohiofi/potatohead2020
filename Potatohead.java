/**
A class that describes an individual Potatohead toy
*/
public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private String eyeColor, hatStyle;
	private int eyeNumber;
	private String hairStyle;
	private String earColor;
	private String mustache;
	private String hairColor;
	private String shoeColor;
	private int numOfArms;
	private String noseStyle;
	private String hatColor;
	private String noseColor;
	private String armStyle;
	
	// add one instance variable
	private int numOfLegs;
  
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
		hairStyle = "unknown";
		shoeColor = "unknown";
		numOfArms = 2;
		noseStyle = "";
		hatColor = "";
		armStyle = "curved";

    		// initialize your instance variable
		numOfLegs = 2;
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
		
	public String getHatColor(){
		return hatColor;
	}
		
	public void setHatColor(String color){
		hatColor = color;
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
		
	/**
		void setNumOfArms(int _numOfArms)
		mutator method for numOfArms
		@param _numOfArms for what the user desires.  
	*/	
	}
	public void setNumOfArms(int _numOfArms){
		numOfArms = _numOfArms;
	}
		
	/**
		String getNumOfArms()
		accessor method for numOfArms
		@return numOfArms an int describing the number of arms.
	*/
	public int getNumOfArms(){
		return numOfArms;
	}
	
	public void setNumOfLegs(int _numOfLegs) {
		numOfLegs = _numOfLegs;
	}
		
	public int getNumOfLegs(){
		return numOfLegs;
	}
		
	public void setNoseStyle(String style) {
		noseStyle = style;
	}
	
	public String getNoseStyle() {
		return noseStyle;
	}
        public void setNoseColor(String _noseColor){
		noseColor = _noseColor;
	}
        public String getNoseColor(){
                return noseColor;
	}
	
	/**
    		String toString()
    		gives the internal state of the Potatohead
    		@return output string
	*/
	
	public void setHairStyle(string _hairStyle){
		hairStyle = _hairStyle;
	}
	
	public String getHairStyle(){
		return hairStyle;
	}
		
	public String getArmStyle(){
		return armStyle;
	}
	
	public void setArmStyle(String _style){
		armStyle = _style;
	}
	
	public String toString()
	{
		String output;
		output =  "Number Of Eyes: " + eyeNumber;
		output += "\nEye Color: " + eyeColor;
		output += "\nHair Style: " + hairStyle;
		output += "\nEar Color: " + earColor;
    		output += "\nMustache Type: " + mustacheType;
		output += "\nHat Style: " + hatStyle;
    		output += "\nMustache Type: " + mustache;
    		output += "\nHair Color: + hairColor";
    		output += " Shoe Color: " + shoeColor;
		output += "\nNumber of Arms: "+ numOfArms;
		output += "\nNose Style: " + noseStyle;
		output += "\nHat Color: " + hatColor;
   		output += "\nNose Color: " + noseColor;
		output += "\nArm Style: " + armStyle;


    
    		// Add your instance variable to the toString() method
		output += "\nNumber of Legs: "+ numOfLegs;
		
		return output;
	}
}
