/**
 This is a class to represent information needed to 
 compute booking at Hotels R Us.
 @author Jackie Omekara.
*/ 
 
public class Room{

	/**
	 This is the name of the guest.     
	*/   
	private String name;
	
	/**
	This is the nights.     
	*/   
	private int numNights;
	
	/**  
	This is the number of guests staying in the room.   
	*/   
	private int numGuests;
	
	/** 
    This is the name of beds(tota) required.  
	*/   
	private int numBeds;


	/** 
	 Constructor that accepts the name,number of nights, number of guests 
	 and number of beds.
	 @param name The name of the guest.   
	 @param numNights The number of nights.     
	 @param numGuests The number of guests.
	 @param numBeds The number of beds required.
	*/
	public Room(String name , int numNights, int numGuests, int numBeds){
		this.name = name;
		this.numNights = numNights;
		this.numGuests = numGuests;
		this.numBeds = numBeds;
	}

	 /**   
	 Getter for the name of the guest.   
	 @return The name of the guest.   
	 */ 
	 
	public String getName(){
		return name;
	}
	
	 /**    
	 Getter for the number of nights.     
	 @return The number of nights.     
	 */ 
	public int getNumNights(){
		return numNights;
	}

	/** 
	Getter for the number of guests.   
	@return The number of guests.    
	*/ 
	public int getNumGuests(){
		return numGuests;
	}
	
	 /**   
	 Getter for the number of beds.    
	 @return The number of beds.    
	 */ 
	public int getNumBeds(){
		return numBeds;
	}
}