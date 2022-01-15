package model;

/**  
* Kai Mwirotsi-Shaw - kimwirotsishaw  
* CIS171 12601 WH1  
* Jan 14, 2022  
*/
public class Bear {
	
	private String breed;
	private int weight;
	private String species;
	
	public Bear() {
		super();
	}
	
	public Bear(String breed, int weight, String species) {
		super();
		this.breed = breed;
		this.weight = weight;
		this.species = species;
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String makeNoise() {
		String noise = null;
		
		if(this.weight >= 400) {
			noise = "growl";
		}
		else if(this.weight <= 200){
			noise = "huff";
		}
		else {
			noise = "woof";
		}
		return "The " + breed + " goes " + noise;
	}
	
	@Override
	public String toString() {
		return "Bear [breed=" + breed + ", weight=" + weight + ", species=" + species + "]";
	}
	
}
