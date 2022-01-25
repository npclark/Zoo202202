/**
 * nglanes@dmacc.edu - nglanes
 * CIS175 - Spring 2022
 * Jan 20, 2022
 */
package model;

public class Tiger {
    //initialize variables
    private String name;
	private String color;
	private int age;

    //no params  constructor
	public Tiger() {
		super();
	}

    //constructor with parameters for name color age
	public Tiger(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

    //getters and setters
    //name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    //color
	public String getColor() {
		return color;
	}
    
	public void setColor(String color) {
		this.color = color;
	}
    //age
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

    //tostring override
	@Override
	public String toString() {
		return "Name: " + name + "\n" + "Color: " + color + "\n" + "Age: " + age;
	}
    //make noise method
	public String makeNoise() {
		return "Roar!";
	}
}
