import java.util.Comparator;

public class OrderedList<T extends Comparable<T>> {

	/** An array of elements of type T (Comparable) */
	private T[] items;
	private int numberOfItems = 0;
	private int capacity;
private static final int DEFAULT = 10;

	/** Constructor to establish array (capacity of 10) */
	public OrderedList() {
		capacity = DEFAULT;
		@SuppressWarnings("unchecked")
		T[] temp = (T[]) new Comparable[capacity];
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

	public T peek(int index) {
		if (0<=index && index<numberOfItems) {
			return items[index];
		}
		return null;
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

	/** find the element provided and return that object (not the index) */
	public T find(T element) {
		for (int i=0; i<numberOfItems; i++) {
			if (items[i] == element) {
				return items[i];
			}
		}
		// not in the list
		return null;
	} // end find
} // end orderedArray
