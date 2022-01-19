package model;

public class Hippo {

	private String name;
	private int age;
	private String gender;
	
	public Hippo() {
		// default constructor
	}
	
	/**
	 * Non-default constructor
	 * @param name - name of hippo
	 * @param age - age of hippo
	 * @param gender - gender of hippo
	 */
	public Hippo(String name, int age, String gender) {
		// non-default constructor
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// gettters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// methods
	@Override
	public String toString() {
		return "Hippo [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	public String makeNoise() {
		return "growl";
	}
	
	
}
