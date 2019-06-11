import static org.junit.Assert.*;

import org.junit.Test;

public class FruitBagTester {

	@Test
	public void testGetCurrentSize() {
		FruitBag fb = new FruitBag();
		// test currentSize after adding items
		assertTrue(fb.getCurrentSize() == 0);
		fb.add(new Fruit("Red", "Apple"));
		assertTrue(fb.getCurrentSize() == 1);
		fb.add(new Fruit("Yellow", "Banana"));
		assertTrue(fb.getCurrentSize() == 2);
	}

	@Test
	public void testIsEmpty() {
		FruitBag fb = new FruitBag();
		assertTrue(fb.isEmpty());
		fb.add(new Fruit("Red", "Apple"));
		assertFalse(fb.isEmpty());
	}

	@Test
	public void testAdd() {
		FruitBag fb = new FruitBag();
		assertTrue(fb.getCurrentSize() == 0);
		assertTrue(fb.isEmpty());
		// add an item, check size and isEmpty
		fb.add(new Fruit("Red", "Apple"));
		assertTrue(fb.getCurrentSize() == 1);
		assertFalse(fb.isEmpty());
		FruitBag fb2 = new FruitBag();
		// fill up fb2
		for(int i = 0; i < 30; i++) {
			fb2.add(new Fruit("Red", "Apple"));
			}
		// make sure you can't add more to full FruitBag fb2
		assertFalse(fb2.add(new Fruit("Yellow","Banana")));
	}

	@Test
	public void testRemove() {
		FruitBag fb = new FruitBag();
		assertTrue(fb.getCurrentSize() == 0);
		assertTrue(fb.isEmpty());
		// add two items, remove one
		// check that current size is now 1
		fb.add(new Fruit("Red", "Apple"));
		fb.add(new Fruit("Yellow","Banana"));
		fb.remove();
		assertTrue(fb.getCurrentSize() == 1);
	}

	@Test
	public void testRemoveFruit() {
		FruitBag fb = new FruitBag();
		assertTrue(fb.getCurrentSize() == 0);
		assertTrue(fb.isEmpty());
		// add two items
		fb.add(new Fruit("Red", "Apple"));
		fb.add(new Fruit("Yellow","Banana"));
		// remove one, check size, contains
		fb.remove(new Fruit("Yellow","Banana"));
		assertTrue(fb.getCurrentSize() == 1);
		assertTrue(fb.contains(new Fruit("Red","Apple")));
		assertFalse(fb.contains(new Fruit("Yellow","Apple")));
	}

	@Test
	public void testClear() {
		FruitBag fb = new FruitBag();
		assertTrue(fb.getCurrentSize() == 0);
		assertTrue(fb.isEmpty());
		// add items to fb
		fb.add(new Fruit("Red", "Apple"));
		fb.add(new Fruit("Yellow","Banana"));
		assertTrue(fb.getCurrentSize() == 2);
		// clear fb, check size and isEmpty
		fb.clear();
		assertTrue(fb.getCurrentSize() == 0);
		assertTrue(fb.isEmpty());
	}

	@Test
	public void testGetFrequencyOf() {
		FruitBag fb = new FruitBag();
		assertTrue(fb.getCurrentSize() == 0);
		assertTrue(fb.isEmpty());
		// add two items that are same, one different
		fb.add(new Fruit("Red", "Apple"));
		fb.add(new Fruit("Red", "Apple"));
		fb.add(new Fruit("Yellow","Banana"));
		// check frequency
		assertTrue(fb.getFrequencyOf(new Fruit("Red","Apple")) == 2);
		assertTrue(fb.getFrequencyOf(new Fruit("Yellow","Banana")) == 1);
	}

	@Test
	public void testContains() {
		FruitBag fb = new FruitBag();
		assertTrue(fb.getCurrentSize() == 0);
		assertTrue(fb.isEmpty());
		// add two items
		fb.add(new Fruit("Red", "Apple"));
		fb.add(new Fruit("Yellow","Banana"));
		// check if items contained, and if non present item not contained
		assertTrue(fb.contains(new Fruit("Red","Apple")));
		assertFalse(fb.contains(new Fruit("Yellow","Apple")));
	}

	@Test
	public void testToArray() {
		FruitBag fb = new FruitBag();
		assertTrue(fb.getCurrentSize() == 0);
		assertTrue(fb.isEmpty());
		fb.add(new Fruit("Red", "Apple"));
		fb.add(new Fruit("Yellow","Banana"));
		// create Fruit array, check size, and contents
		Fruit[] arr = fb.toArray();
		assertTrue(arr.length == 2);
		assertTrue(arr[0].equals(new Fruit("Red", "Apple")));
		assertTrue(arr[1].equals(new Fruit("Yellow","Banana")));
	}

}
