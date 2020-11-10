import java.util.Comparator;

/** A list of generic type objects stored in an array and maintained in order.
"In order" means in the order defined in the compareTo method in class T.
*/
class ListOrdered<T extends Comparable<T>> {

  /** maximum number of elements that can be stored in list */
  private static final int DEFAULT_CAPACITY = 2000;

  /** current number of elements in list */
  private int numberOfItems = 0;

  /** basic data structure to hold list elements */
  private T[] items = null;

  /** Constructor with user-defined capacity of list */
  public ListOrdered() {
    @SuppressWarnings("unchecked")
    T[] temp = (T[]) new Comparable[DEFAULT_CAPACITY];
    items = temp;
  }

  public int length() { return numberOfItems; }

  /** True if no elements in the list. */
  public boolean isEmpty() { return numberOfItems == 0; }
  /** True if list is filled to capacity */
  public boolean isFull() { return length() == items.length; }

  /**
  @return string of all list elements, 1 per line.
  */
  public String toString() {
    String returnString = "";
    for (int i=0; i<numberOfItems; i++) {
      returnString += items[i].toString() + "\n";
    }
    return returnString;
  } // end toString()

  /** Getter for list element at a specific index. Essential for testing.
  @param index Location of element to return (without removal).
  @return list element at index, if index valid (null if not valid)
  */
  public T peek(int index) {
    if (index < 0 || index >= numberOfItems) {
      return null;
    }
    return items[index];
  } // end peek(int)

  /** Add element in order based on comparator, shifting elements
  to the right to make room.
  @param object to be added at provided index (if valid)
  */
  public void add(T object) {
		//System.out.println("trying to add. full="+isFull());
		if (isFull()) { return; }
		int i = numberOfItems;
    while (i>0 && items[i-1].compareTo(object)>0) {
      items[i] = items[i-1];
			i--;
    }
    items[i] = object;
    ++numberOfItems;
  } // end add(T, int)
}
