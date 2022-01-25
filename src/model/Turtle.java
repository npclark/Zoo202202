package model;
public class Turtle {
    String name;
    int age, weight;
    /**
	 * default constructor
	 */
	public Turtle() 
	{
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param weight
	 */
	public Turtle(String name, int age, int weight) 
	{
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getage() 
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setage(int age) 
	{
		this.age = age;
	}

	/**
	 * @return the weight
	 */
	public int getweight() 
	{
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setweight(int weight) 
	{
		this.weight = weight;
	}

	@Override
	public String toString() 
	{
		return "Turtle [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	public String makeNoise()
	{
		return "Hiss";
	}
}
