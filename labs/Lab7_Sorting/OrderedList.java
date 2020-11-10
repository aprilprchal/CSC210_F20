public class OrderedList<T extends Comparable<T>> {

	/** An array of elements of type T (Comparable) */
	private T[] items;
	private int numberOfItems = 0;
	private int capacity;
	private static final int DEFAULT = 10;

	/** Constructor to establish array (capacity of 10) */
	public OrderedList(int size) {
		capacity = size;
		@SuppressWarnings("unchecked")
		T[] temp = (T[]) new Comparable[capacity];
		items = temp;
	}

	public OrderedList() {
		this(DEFAULT);
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

	// Add an element to maintain order.
	// This is not the most efficient way to do this, but straight-forward
	public void add(T element) {
		// If full up, no can do
		if (numberOfItems >= items.length) {
			return;
		}
		items[numberOfItems] = element;
		++numberOfItems;
	}

	// Sort the elements using Selection sort and the provided comparator.
	public void sort(Comparator<T> orderBy) {
		// Find the location of the minimum and swap with the element at index 0
		// Find the location of the next minumum, swap with element at index 1
		// ...
	}

} // end orderedArray
