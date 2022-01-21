package model;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Jan 20, 2022  
*/
public class Frog {
	private String name;
	private String color;
	private int age;

	public Frog() {
		super();
		this.name = "Larry";
		this.color = "Green";
		this.age = 1;
	}

	public Frog(String name, String color, int age) {
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
		return "Frog [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	public String makeNoise() {
		return "Ribbit!";
	}
}
