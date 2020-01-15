/** 
This is a class to represent booking of a Standard room
at Hotels R Us.
@author Jackie Omekara
*/ 

import java.util.Random;
public class Standard extends Room {
	
	/**
	 This is the base rate of a Standard room.     
	*/   
	private final int BASE_RATE = 225;
	
	/**
	 This is the cost of an additional bed.     
	*/   
	private final int COST_BED = 20;
	
	/**
	 This is the cost of breakfast.     
	*/   
	private final double BREAKFAST = 9.75;
	
	/**
	 This is the checkout time represented as a String.     
	*/   
	private String checkoutTime;
	
	/** 
	 Constructor that accepts the name,number of nights, number of guests 
	 and number of beds.
	 @param name The name of the guest.   
	 @param numNights The number of nights.     
	 @param numGuests The number of guests.
	 @param nnumBeds The number of beds required.
	*/
	public Standard(String name , int numNights, int numGuests, int numBeds){
		super(name,numNights,numGuests,numBeds);
		
		Random generator= new Random();
		int random = 10+ generator.nextInt(2);//generates a random number between 10 and 11 representing the checkout time.  
		if (random == 10){
			checkoutTime = "10am";
		}
		else{
			checkoutTime = "11am";
		}
	}
	
	/** 
	Getter for the checkout time.   
	@return The checkout time.    
	*/ 
	public String getCheckoutTimeStandard(){
		return checkoutTime;
	}
	
	/** 
	Getter for the cost of the Standard room.   
	@return The cost of the Standard room.    
	*/ 
	public double roomCost(){
		int cost_bed = 0;
		if (getNumBeds()>2){
			cost_bed = (getNumBeds()-2)*COST_BED;
		}
	
		double cost = getNumNights() * (BASE_RATE + cost_bed + (getNumGuests()*BREAKFAST));
		return cost;
	}
	
}
