public class List {

  /**
  This is a list of Song objects implemented with an array. The list may have duplicates. It is not in sorted order. Add and remove operate at the end of the list by default, but positional information can be provided to operate in the middle of the list.
  */

  /** Array to store items in queue */
  protected Song[] items;

  /** The maximum size of the array for all queues */
  protected static final int DEFAULT_CAPACITY = 2000;

  /** The capacity of the instance array (set to default). "capacity" is the equivalent to items.length() and can be used interchangably. */
  private int capacity = DEFAULT_CAPACITY;

  /** The number of items in the array. */
  private int numberOfItems=0;


  // ============== 2 Overloaded Constructors ============== //

  /**
  Constructor
  @param size The capacity of the list (i.e. max number of elements)
  */
  public List(int size) {
    capacity = size;
    items = new Song[capacity];
  }

  /**
  Default Constructor
  */
  public List() {
    this(DEFAULT_CAPACITY);
  }

  // ************   SETTERS, GETTERS, toPrint ******************* //

  public int length() { return numberOfItems; }

  public int capacity() { return capacity; }

  /**
  @return True if structure is at capacity.
  */
  public boolean isFull(){
    return false;
  }

  /**
  @return True if no elements in data structure.
  */
  public boolean isEmpty() {
    return false;
  }

  /** Prints numbered list of songs.  */
  @Override
  public String toString() {
    String printedList = "";
    for (int i=0; i<numberOfItems; i++) {
      printedList += (i+1) + ". " + items[i].toString() + "\n";
    }
    return printedList;
  } // end toString()

  // *******************   FIND, CONTAINS, PEEK *************** //

  /**
  */
  public Song peek(int index) {
    return null;
  } // end peek(int)

  /**
  */
  public int find(Song song) {
    return -1;
  } // end find(Song)

  /**
  */
  public boolean contains(Song song) {
    return false;
  } // end contains(Song)

  // *******************   ADD  ******************* //
  /**
  */
  public void add(Song song) {

  } // end add(song)

  /**
  */
  public void add(Song song, int index) {

  } // end add(Song, int)

    /**
  */
  public void set(Song song, int index) {

  } // end set(Song, int)

    // *******************   REMOVE  ******************* //
  /**
  */
  public Song remove(int index) {
    return null;
  } // end remove(int)

  /**
  */
  public void remove(Song song) {

  } // end remove(Song)

  /**
  */
  public void removeAll() {

  } // end removeAll()

  // *******************   CONVERT  ******************* //
  /**
  */
  public Song[] toArray(Song) {
    return null;
  } // end toArray(song)

  /**
   */
  public List sublist(int start, int end) {

  } // end sublist()

} // end class List
