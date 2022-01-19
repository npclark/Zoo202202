/**
 * ajwinters@dmacc.edu - ajwinters
 * CIS175 - Spring 2022
 * Jan 17, 2022
 */
package model;

public class Ferret {
	private String name;
	private String color;
	private int age;

	public Ferret() {
		super();
	}

	public Ferret(String name, String color, int age) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Ferret [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	public String speak() {
		return "Dook!";
	}

}