package model;

/**
 * Tanner Patterson - tpatterson4
 * CIS175 or CIS152 - SPRING
 * Jan 14, 2022
 */
public class Snake 
{
	String name, color;
	int length;
	
	/**
	 * default constructor
	 */
	public Snake() 
	{
		super();
	}

	/**
	 * @param name
	 * @param color
	 * @param length
	 */
	public Snake(String name, String color, int length) 
	{
		super();
		this.name = name;
		this.color = color;
		this.length = length;
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
	 * @return the color
	 */
	public String getColor() 
	{
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) 
	{
		this.color = color;
	}

	/**
	 * @return the length
	 */
	public int getLength() 
	{
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) 
	{
		this.length = length;
	}

	@Override
	public String toString() 
	{
		return "Snake [name=" + name + ", color=" + color + ", length=" + length + "]";
	}
	
	public String makeNoise()
	{
		return "Hiss!";
	}
}
