/**
 * 
 * @author Matthew Sorkin
 * @version 1.0
 * 
 * Parts of my program that work: All
 * 
 * Parts of my program that don't work: None
 * 
 */

public class FruitBag implements BagInterface<Fruit> {
	
	// Variables
	private Fruit[] BagArray;
	int numOfEntries = 0;
	public static final int DEFAULT_CAPACITY = 30;
	
	// Constructors
	
	/**
	 * Default constructor which initializes the
	 * Bag array with the default capacity.
	 */
	public FruitBag() {
		BagArray = new Fruit[DEFAULT_CAPACITY];
	}

	/**
	 * Parameterized constructor which initializes
	 * the Bag array with the specified capacity
	 * @param capacity - an integer that describes
	 * the desired size of the array.
	 */
	public FruitBag(int capacity) {
		BagArray = new Fruit[capacity];
	}

	// Methods
	
	/**
	 * Gets the current number of entries in this bag.
	 * 
	 * @return The integer number of entries currently in the bag.
	 */
	@Override
	public int getCurrentSize() {
		return numOfEntries;
	}

	/**
	 * Sees whether this bag is empty.
	 * 
	 * @return True if the bag is empty, or false if not.
	 */
	@Override
	public boolean isEmpty() {
		// check currentSize
		// if count = 0 BagArray is empty
		if (getCurrentSize() == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Adds a new fruit to this bag.
	 * 
	 * @param newFrt
	 *            The fruit to be added as a new fruit.
	 * @return True if the addition is successful, or false if not.
	 */
	@Override
	public boolean add(Fruit newFrt) {
		// check currentSize
		// if bag is not full, add
		if (getCurrentSize() < BagArray.length) {
			BagArray[numOfEntries] = newFrt;
			numOfEntries++;
			return true;
		}
		// if bag is full
		return false;
	}

	/**
	 * Removes one unspecified fruit from this bag, if possible.
	 * 
	 * @return Either the removed fruit, if the removal. was successful, or
	 *         null.
	 */
	@Override
	public Fruit remove() {
		// check if bag is empty
		if (isEmpty()) {
			return null;
		}
		// remove fruit
		Fruit frtRmvd = null;
		frtRmvd = BagArray[numOfEntries - 1];
		BagArray[numOfEntries - 1] = null;
		numOfEntries--;
		return frtRmvd;
	}

	/**
	 * Removes one occurrence of a given fruit from this bag.
	 * 
	 * @param frt
	 *            The fruit to be removed.
	 * @return True if the removal was successful, or false if not.
	 */
	@Override
	public boolean remove(Fruit frt) {
		// check if bag is empty
		if (isEmpty()) {
			return false;
		}
		// loop through and check for fruit
		for (int i = 0; i < numOfEntries; i++) {
			// if fruit present put last fruit into
			// index of fruit and make last fruit null
			if (BagArray[i].equals(frt)) {
				BagArray[i] = BagArray[numOfEntries - 1];
				BagArray[numOfEntries - 1] = null;
				numOfEntries--;
				return true;
			}
		}
		// if fruit not in bag
		return false;
	}
	
	/** Removes all entries from this bag. */
	@Override
	public void clear() {
		// while bag is not empty, remove entries
		while (!isEmpty()) {
			remove();
		}
	}

	/**
	 * Counts the number of times a given fruit appears in this bag.
	 * 
	 * @param frt
	 *            The fruit to be counted.
	 * @return The number of times the fruit appears in the bag.
	 */
	@Override
	public int getFrequencyOf(Fruit frt) {
		int count = 0;
		// check if bag is empty
		if (isEmpty()) {
			return count;
		}
		for (int i = 0; i < numOfEntries; i++) {
			// if fruit found, increase count
			if (BagArray[i].equals(frt)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Tests whether this bag contains a given fruit.
	 * 
	 * @param frt
	 *            The fruit to locate.
	 * @return True if the bag contains the fruit, or false if not.
	 */
	@Override
	public boolean contains(Fruit frt) {
		// check if bag is empty
		if (isEmpty()) {
			return false;
		}
		for (int i = 0; i < numOfEntries; i++) {
			// check for fruit
			if (BagArray[i].equals(frt)) {
				return true;
			}
		}
		// if fruit not in bag
		return false;
	}

	/**
	 * Retrieves all entries that are in this bag.
	 * 
	 * @return A newly allocated array of all the entries in the bag. Note: If
	 *         the bag is empty, the returned array is empty.
	 */
	@Override
	public Fruit[] toArray() {
		Fruit[] fruitArray = new Fruit[numOfEntries];
		// run through bag and add entries to array
		for (int i = 0; i < numOfEntries; i++) {
			fruitArray[i] = BagArray[i];
		}
		return fruitArray;
	}
}
