/**
 * @uthor Larry Maxwell - ljmaxwell1
 * CIS175 - Spring 2022
 * Jan 16, 2022
 */
package model;


public class Fish {
	public String species;
	public int length;
	public int weight;
	
	public Fish() {
		super();
	}
	
	public Fish(String species, int length, int weight) {
		super();
		this.species = species;
		this.length = length;
		this.weight = weight;
	}
	
	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public int getLength() {
		return length;
	}

	
	public void setLength(int length) {
		this.length = length;
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Fish [species=" + species + ", length=" + length + ", weight=" + weight + "]";
	}
	
	public String makeNoise() {
		return "Croaking";
	}
}
