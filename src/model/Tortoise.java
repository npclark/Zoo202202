/**
 * @author Sofia Rhoades Ortega - scrhoadesortega
 * CIS175 - Fall 2021
 * Jan 20, 2022
 */
package model;

public class Tortoise {
	private String species;
	private String climate;
	private int lifespan;
	
	public Tortoise() {
		super();
	}
	
	public Tortoise(String species, String climate, int lifespan) {
		super();
		this.species = species;
		this.climate = climate;
		this.lifespan = lifespan;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getClimate() {
		return climate;
	}

	public void setClimate(String climate) {
		this.climate = climate;
	}

	public int getLifespan() {
		return lifespan;
	}

	public void setLifespan(int lifespan) {
		this.lifespan = lifespan;
	}
	public String makeNoise() {
		return "Hiss";
	}

	@Override
	public String toString() {
		return "Tortoise [species=" + species + ", climate=" + climate + ", lifespan=" + lifespan + "]";
	}
}
