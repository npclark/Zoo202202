package model;

/**
 * @author Chad Robbins - cerobbins@dmacc.edu
 * CIS75 - Spring 2022
 * Jan 20, 2022
 */
public class Pig {

	private int weightInPounds;
	private String color;
	private String sound;
	
	
	/**
	 * @param weightInPounds
	 * @param color
	 * @param sound
	 */
	public Pig() {
		super();
		setWeightInPounds(weightInPounds);
		setColor(color);
		setSound(sound);
	}
	/**
	 * @return the weightInPounds
	 */
	public int getWeightInPounds() {
		return weightInPounds;
	}
	/**
	 * @param weightInPounds the weightInPounds to set
	 */
	public void setWeightInPounds(int weightInPounds) {
		this.weightInPounds = weightInPounds;
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
	
	public String speak() {
		return "OINK";
	}
}
