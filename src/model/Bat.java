/**
 * Andres Mata - ammata
 * CIS175 JavaII
 * Existing Repos: Zoo
 * Completed 1/13/2022
 */

package model;

public class Bat {
	private String breed;
	private String diet;
	private String noise;
	
	public Bat() {
		setBreed("flying type");
		setDiet("nothing!");
		setNoise("squeak");
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public String getNoise() {
		return noise;
	}
	public void setNoise(String noise) {
		this.noise = noise;
	}
	
	public String makeNoise() {
		return "SCREEEEAAAAAAAHAHAHAHHAHAHAH";
	}
}
