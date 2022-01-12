package model;
//Added by Chris Geralds

public class Nuthatch {
	private String name;
	private String species;
	private int age;
	public String getName() {
		return name;
	}
	
	public Nuthatch() {
		super();
	}
	
	
	public Nuthatch(String name, String species, int age) {
		super();
		this.name = name;
		this.species = species;
		this.age = age;
	}


	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Nuthatch [name=" + name + ", species=" + species + ", age=" + age + "]";
	}
	
	 public String speak() {
		 return "Heehee";  //Nuthatchs sound like they're laughing
	 }
	

}
