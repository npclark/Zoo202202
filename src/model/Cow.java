package model;
/**
 * @author Josiah Anderson, janderson78@dmacc.edu
 * January 20, 2022
 */
public class Cow {
	private String type;
	private double weight;
	
	public Cow() {
		super();
	}
	
	public Cow(String type, double weight) {
		this.type = type;
		this.weight = weight;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Cow [Type=" + type + ", weight=" + weight + "]";
	}
		
	public String makeNoise() {
		return "Moo!";
	}
	
	
}
