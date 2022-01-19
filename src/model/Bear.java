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
		this.breed = "American Black Bear";
		this.weight = 176;
		this.species = "americanus";
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
			noise = "Growl";
		}
		else if(this.weight <= 200){
			noise = "Huff";
		}
		else {
			noise = "Woof";
		}
		return noise;
	}
	
	@Override
	public String toString() {
		return "Bear [breed=" + breed + ", weight=" + weight + ", species=" + species + "]";
	}
	
}
