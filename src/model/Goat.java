/**
 * @author chase - Chase Van Blair
 * CIS175 - Fall 2021
 * Jan 17, 2022
 */
package model;

/**
 * @author chase
 *
 */
public class Goat {
	String color = "White";
	Boolean mammal = true;
	int legs = 4;
	public Goat() {
		
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Boolean getMammal() {
		return mammal;
	}
	public void setMammal(Boolean mammal) {
		this.mammal = mammal;
	}
	public String makeNoise() {
		return "Baa";
	}
	
}
