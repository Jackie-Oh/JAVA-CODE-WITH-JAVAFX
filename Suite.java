
/** 
This is a class to represent booking of a Suite Room
at Hotels R Us.
@author Jackie Omekara
*/ 
 
import java.util.Random;

public class Suite extends Room {
	
	/**
	 This is the base rate of a Suite room.     
	*/ 
	private final int BASE_RATE = 380;
	
	/**
	 This is the cost of an additional bed.     
	*/ 
	private final int COST_BED = 15;
	
	/**
	 This is the name of the perk that comes with a Suite room.     
	*/ 
	private String perk;
	
	/** 
	 Constructor that accepts the name,number of nights, number of guests 
	 and number of beds.
	 @param name The name of the guest.   
	 @param numNights The number of nights.     
	 @param numGuests The number of guests.
	 @param numBeds The number of beds required.
	*/
	public Suite( String name , int numNights, int numGuests, int numBeds){
		super(name,numNights,numGuests,numBeds);
		
		Random generator= new Random();
		int random = 1+ generator.nextInt(3);// generates a random number between 1 and 3 (inclusive) to get perk of a Suite room.
	
		if (random == 1){
			perk = "Champagne";
		}
		else if(random == 2){
			perk = "Chocolates";
		}
		else {
			perk = "Fruit basket";
		}
	}
	
	/** 
	Getter for the perk of a Suite Room.   
	@return The perk that comes with the Suite room.    
	*/ 
	public String getPerk(){
		return perk;
	}
	
	/** 
	Getter for the checkout time.   
	@return The checkout time as 12 noon.    
	*/ 
	public String getCheckoutTimeSuite(){
		return "12 noon";
	}
	
	/** 
	Getter for the cost of the Suite room.   
	@return The cost of the Suite room.    
	*/ 
	public double roomCost(){
		int cost_bed = 0;
		if (getNumBeds()>3){
			cost_bed = (getNumBeds()-3)*COST_BED;
		}
	
		double cost = getNumNights()*(BASE_RATE + cost_bed);
		return cost;
	}
	
	
}