package model;

/**
 * @author dynob - tjmendenhall2@dmacc.edu
 * CIS175 - Fall 2021
 * Jan 18, 2022
 */
public class Monkey {
	private String breed;
	private String diet;
	private String noise;
	
	public Monkey() {
		setBreed("Capuchin");
		setDiet("Omnivore");
		setNoise("Oooh aaah AAah");
	}
	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}
	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	/**
	 * @return the diet
	 */
	public String getDiet() {
		return diet;
	}
	/**
	 * @param diet the diet to set
	 */
	public void setDiet(String diet) {
		this.diet = diet;
	}
	/**
	 * @return the noise
	 */
	public String getNoise() {
		return noise;
	}
	/**
	 * @param noise the noise to set
	 */
	public void setNoise(String noise) {
		this.noise = noise;
	}
	
	public String makeNoise() {
		return this.noise;
	}
	
	
}
