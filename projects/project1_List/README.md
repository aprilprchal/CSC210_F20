### Project 1 : Homegrown Lists
##### Due Tuesday, February 25 at 11pm
##### Submit a single zipped file to Moodle

<hr>

#### Learning Outcomes:

- Be able to implement a generic type _List_ using an array.
- Be able to implement a generic type _List_ using a linked list.
- Be able to design and use tests to verify code.

<hr>

> You must earn a grade above the threshold of 60% on this project to pass this course. If after submission, you have not reached that threshold, you will have ample opportunity to work on the project until it meets this requirement. However, the grade will remain as it was for the work originally submitted.

#### General Requirements:

1. Write the class _ListLinked_ that implements the _List_ interface.
2. Extend functionality of _ListArray_ to match _ListLinked_.
2. Document all code using Javadocs.
1. Verify code using tests from Lab 4.

Note: In lab 4, you reorganized (maybe refactored) your tests. There are no additional tests required for this project, but you should write some to ensure your code is working. (I will be writing tests to verify your code, so better that you find your bugs before I do.) ALSO, I will be writing some tests using objects other than Song, so you should try it with another type as well just to be sure the generic part is working.

<hr>

### Getting Started

Start by creating a new project with all of your code from Lab 4. Add the _ListLinked.java_ file to the project. The file _List.java_, which is the List interface, has been provided to ensure that your List has all required methods. You should compare this to your _List.java_ file to make sure it is matching.

### Primary Directive

You have essentially already completed half of this project. The other half is to repeat what you did, except use linked lists instead of arrays. And there are a few new methods to implement in both array and linked list form:

- `public T peek()` : return the first element but DO NOT remove it.
- `public T peekLast()` : return the last element but DO NOT remove it.
- `public boolean contains(T object)` : tests if object is in list.
- `public T[] toArray()` : same as other toArray, but this returns a newly created array (casting will likely be involved!);
- `public void removeLast(T object)` : remove the last occurrence of object

Word of Advice: Code a little, then test. Code a litte more, then test. Use the restructured tests from Lab 4 for the linked list implementation.

### Outline of Functionality

The tiers are essentially the same as before, with some slight adjustments.

**Tier 1**

```java
public T peek(int index);
public void add(T object);
public void add(T object, int index);
public T remove();
public T remove(int index);
public T remove(T object);
```

<hr>
<hr>

> Completing the above for BOTH ListArray and ListLinked can earn you up to a C. Continue if you want to strive for a higher grade.

<hr>
<hr>

**Tier 2**

```java
public T removeAll();
public void set(int position, T value);
public void addAll(T[] toAdd);
public int find(T object);
public T peek();
public T peekLast();
public boolean contains(T object);
```

<hr>
<hr>

> Completing the above for BOTH ListArray and ListLinked can earn you up to a B. Continue if you want to strive for a higher grade.

<hr>
<hr>

**Tier 3**

```java
public Object sublist(int startIndex, int endIndex);
public void toArray(T[] array);
public T[] toArray();
public void removeLast(T object);
```

##### BONUS POINTS (available to all tiers):

`public void removeDuplicates()` : make the list into a set.

<hr>

#### Assessment:

Complete the following to earn up to a C
- 15% : complete, compiles, and executes without throwing exception
- 15% : javadocs
- 35% : ListLinked Tier 1 implementation (C-level methods)
- 05% : ListArray Tier 1 implementation
- 06% : Tests of Lab 4 Working with Project Code (ListArray and ListLinked)

Complete the above and the following to earn up to a high B
- 12% : Tier 2 Functionality for ListLinked and ListArray

Complete the above and the following to earn up to an A
- 12% : Tier 3 Functionality for ListLinked and ListArray
