
public class Fruit {
	
	// Variables
	private String color, name;
	
	// Constructors
	
	/**
	 * Default constructor which initializes the
	 * fruit with default color and name values of null.
	 */
	public Fruit() {
		setColor(null);
		setName(null);
	}
	
	/**
	 * Parameterized constructor which initializes
	 * the Fruit with specified values for color and name
	 * @param color - a string that describes the color
	 * of the fruit
	 * @param name - a string that describes the name
	 * of the fruit
	 */
	public Fruit(String color, String name) {
		this.color = color;
		this.name = name;
	}
	
	// Methods
	
	/**
	 * This method gets the string of color
	 * @return the string of color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * This method sets the string of color
	 * @param color - the string of color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * This method gets the string of name
	 * @return the string of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method sets the string of name
	 * @param name - the string of name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * This method returns the name and color of the fruit
	 * with the first letter of both capitalized
	 * @return a string with name and color of the fruit
	 * with the first letter of both capitalized
	 */
	public String toString() {
		String str = color.substring(0,1).toUpperCase()
				   + color.substring(1) + " " 
				   + name.substring(0,1).toUpperCase()
				   + name.substring(1);
		return str;
	}
	
	/**
	 * This method compares two fruits to see if they have
	 * the same name and color.
	 * @param frt - the fruit to be compared
	 * @return true if the fruits have the same name and color,
	 * false otherwise.
	 */
	public boolean equals(Fruit frt) {
		if (this.name == frt.name && 
			this.color == frt.color) {
			return true;
		}
		return false;
	}
}
