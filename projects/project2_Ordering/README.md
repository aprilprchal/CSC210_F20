## Project 2 Ordered List
#### Zip all files and submit via Moodle

> You must earn 60%+ on this project to pass the course. You will be given the opportunity to rework the project until it meets the threshold.

<hr>

In this project, you will be building on previous labs to create a complete ListOrdered class. This list class will make use of Comparators to find, add, and sort elements. Additionally, you will incorporate error checking by creating and throwing Exceptions.

The data of Olympians was obtained from kaggle.com, which has many many databases that you can download for free.

<hr>

### ListOrdered Class Comparator and Sorting

Create a class variable `Comparator<T> sortOrder` to store the default order of the stored class. The array _items_ should always be sorted according to this class comparator. In any method in which a comparator is not passed, the sortOrder comparator should be used.

Initialize `Comparator<T> sortOrder` to a Comparator<T> whose compare method calls the `compareTo` method of the class type T.

The list should always be ordered based on the class member _sortOrder_. Note that you will need to change the add method that was provided to use the sortOrder comparator.

The **setter for sortOrder must reorder the elements based on the new comparator**. You will not receive credit for using any of Java's built-in sorting functionality.

In main(), create a Comparator<Olympian> that compares 2 Olympians for each of:
- name
- sport
- country
- medal
- year
- age


### Using Keys

Recall the in-class example of creating a Comparator<Object> comparator that uses a key value to test against a class object. For this project, in main(), create a Comparator<Object> for each of the fields

- Medal
- year
- season
- age
- city

### Dynamic Array

Dynamic arrays are arrays that expand as needed without limits. Use a default array size of 100 when first initialized, but at any point, if more elements need to be added, then increase the array size by 100. To do this, you will need to create a new larger array then copy everything over.

On a related note, you can give the user the opportunity to shrink the size of the array. Define this function in OrderedList:

- `void trimToSize();`
  Shrink the array to the **smallest multiple of 100** that will hold all elements. For example, if there are currently 120 elements in the list, move everything to an array of size 200 or if there are 0 elements, create an empty array of size 100.

### Extend Functionality

Write the following class methods for OrderedList:

- `public int find(T item);`
	Use BINARY SEARCH to find the item in the list. Return -1 if not there.

- `public T[] sort(Comparator<T> orderBy);`
Copy items into a new array then sort those based on the orderBy comparator. You will not receive credit for using Java's built-in sort methods.

- `public void reorder();`
  Sort items based on the member variable sortOrder. Note that you would only call this after changing the variable sortOrder. You will not receive credit for using Java's built-in sort methods.

- `ArrayList<T> findAll(Object key, Comparator<T> comp);`
  Return an ArrayList (Yes, a JAVA collections ArrayList!) that contains all objects that match the key value using one of the KEY comparators as defined above, for example.

- `T findFirst(Object key, Comparator<T> comp);`
  Return the first object in the list that matches the key value using one of the KEY comparators as defined above, for example.

- `ArrayList<T> getRange(Object key1, Object key2, Comparator<T> comp);`
  Return an ArrayList (Yes, a JAVA collections ArrayList!) that contains all object that fall in the range (inclusive) between key values key1 and key2 using the KEY comparators.

- `void retainRange(Object key1, Object key2, Comparator<T> comp);`
  Retain all objects in the list that fall in the range (inclusive) between key values key1 and key2 using one of the KEY comparators. In other words, remove all the elements not in that range. **To be in range means to between those values. For example, if key1=1985 and key2=1990, then you keep all athletes that competed in the years between 1985 and 1990 (inclusive).**

- `void removeRange(Object key1, Object key2, Comparator<T> comp);`
	  Remove all objects in the list that fall in the range (inclusive) between key values key1 and key2 using one of the KEY comparators. In other words, keep only those elements not in this range.

 - `T[] toArray();`
  As before, take all the items and return them in a new array.

- `T max();`
  Return the max valued object based on the default comparator. Note that you do not need to iterate.

- `T min();`
  Return the min valued object based on the default comparator. Note that you do not need to iterate.

- `T max(Comparator<T> comp);`
  Return the max valued object based on the provided comparator.

- `T min(Comparator<T> comp);`
  Return the min valued object based on the provided comparator.

### Exception Handling

In previous labs, you printed error messages when the user did something unexpected. In this project, you will practice error checking by creating and throwing exceptions and using try-catch to handle thrown exceptions.

**Create an Exception class `KeyTypeMismatch` and `ObjectTypeMismatch`**, which should be thrown when checking types within your comparators for key values. It should produce a meaningful error message, such as

```
> java Main
KeyTypeMismatch in Year Comparator
     expected Integer
```

**Create an Exception class `NullObjectException`**, which should be thrown in any method that passes an object to be compared to other objects in the list (e.g. `add(null)` would throw this exception). Use variables to store the location and specific information about the exception. Override toString() in the Exception class.

Here is one tutorial on Exceptions: https://www.geeksforgeeks.org/g-fact-32-user-defined-custom-exception-in-java/

You can also read the corresponding section in zyBooks.

### Javadocs

You know what to do!
