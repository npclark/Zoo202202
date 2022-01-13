
package model;

/**
 * @author jword - jord
 * CIS75 - Spring 2022
 * Jan 12, 2022
 * added by John Ord
 */
public class Fox {
	
	private String sound;
	private String color;
	private int numOfLegs;
	/**
	 * 
	 */
	public Fox() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param sound
	 * @param color
	 * @param numOfLegs
	 */
	public Fox(String sound, String color, int numOfLegs) {
		super();
		this.sound = sound;
		this.color = color;
		this.numOfLegs = numOfLegs;
	}
	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}
	/**
	 * @param sound the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the numOfLegs
	 */
	public int getNumOfLegs() {
		return numOfLegs;
	}
	/**
	 * @param numOfLegs the numOfLegs to set
	 */
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	@Override
	public String toString() {
		return "Fox [sound=" + sound + ", color=" + color + ", numOfLegs=" + numOfLegs + "]";
	}
	
	public String speak() {
		return "Ring-ding-ding-ding-dingeringeding!";
		
	}

}
