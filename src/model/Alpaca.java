
/**
 * @author Owen Miner - osminer
 * CIS175 - Spring 2022
 * Jan 20, 2022
 */
public class Alpaca {
	private String coatColor;
	private Boolean isAlone; //For context - Alpacas will literally die of being lonley and are only sold in pairs of two or more
	private String name;
	
	public Alpaca(){ //default constructor
		supoer();
	}
	public Alpaca(String coatColor, Boolean isAlone, String name){//non-default constructor
		super();
		this.coatColor = coatColor;
		this.isAlone = isAlone;
		this.name = name;
	}
	public String makeNoise() {	
		return "Humm";
	}
	
	
	
	
		
}
