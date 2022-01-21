
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
	//getters and setters
	public void setCoatColor() {
		this.coatColor = coatColor;
	}
	public String getCoatColor() {
		return coatColor;
	}
	
	public void setIsAlone() {
		this.isAlone = isAlone;
	}
	public String getIsAlone() {
		return isAlone;
	}
	
	public void setName() {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//make noise method
	public String makeNoise() {	
		return "Humm";
	}
	
		
}
