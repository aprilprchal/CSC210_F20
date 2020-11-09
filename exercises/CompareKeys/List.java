import java.util.Comparator;

public class List<T extends Comparable<T>> {

	/** An array of elements of type T (Comparable) */
	T[] items;
	int numberOfItems = 0;

	/** Constructor to establish array (capacity of 10) */
	public List() {
		@SuppressWarnings("unchecked")
		T[] temp = (T[]) new Comparable[10];
		items = temp;
	}

	/** pretty print string for this list */
	public String toString() {
		String output = "";
		for (int i=0; i<numberOfItems; i++) {
			output += items[i].toString()+"\n";
		}
		return output;
	}

	// this is a helper function for the ordered add.
	private void shiftRight(int index) {
		for (int i = numberOfItems; i>index; i--) {
			items[i] = items[i-1];
		}
	}

	// Add an element to maintain order.
	// This is not the most efficient way to do this, but straight-forward
	public void add(T element) {
		// If full up, no can do
		if (numberOfItems >= items.length) {
			return;
		}

		// if empty, put it in the first slot
		if (0==numberOfItems) {
			items[0] = element;
			++numberOfItems;
			return;
		}
		// else figure out where it goes
		int i=0;
		while (i<numberOfItems && items[i].compareTo(element)<0) {
			++i;
		}
		// if not at the end, need to shift things to make room
		if (i<numberOfItems) {
			shiftRight(i);
		}
		// place it and update count
		items[i] = element;
		++numberOfItems;
	} // end add()

	// Find everything less than the key value
	public void lessThan(Object key, Comparator<Object> byKey) {
		// PRINT all items that are "less than" the key, based on comparator.
	}

	// Find everything greater than the key value
	public void greaterThan(Object key, Comparator<Object> byKey) {
		// PRINT all items that are "greater than" the key, based on comparator.


	}

	// Find everything in range
	public void inRange(Object min, Object max, Comparator<Object> byKey) {
		// PRINT all items that are between min and max (inclusive), based on comparator.


	}

} // end oredered list
