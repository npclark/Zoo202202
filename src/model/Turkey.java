/**
 * @author Christopher Pohlman - cmpolhman
 * CIS175 - Spring 2022
 * Jan 11, 2022
 */
package model;


public class Turkey {
	private double weight;
	private String name;
	private int age;
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public Turkey() {
		this.weight = 1.0;
		this.name = "Tom";
		this.age = 0;
	}
	
	/**
	 * @param weight
	 * @param name
	 * @param age
	 */
	public Turkey(double weight, String name, int age) {
		super();
		this.weight = weight;
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Turkey [weight=" + weight + ", name=" + name + ", age=" + age + "]";
	}
	public String speak() {
		return "Gobble Gobble!";
	}
	
	
}
